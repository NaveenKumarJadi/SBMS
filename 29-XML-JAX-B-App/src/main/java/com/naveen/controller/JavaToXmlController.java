package com.naveen.controller;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.naveen.model.Employee;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

@RestController
public class JavaToXmlController {

	@GetMapping(value = "/convert-to-xml", produces = MediaType.APPLICATION_XML_VALUE)
	public String convertJavaToXml() {
		try {
			Employee employee = new Employee(111, "Java to xml", "SpringBoot");

			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter sw = new StringWriter();
			marshaller.marshal(employee, sw);
			marshaller.marshal(employee, new File("Employee.xml"));
			System.out.println("Marshalling Completed....");

			return sw.toString();

		} catch (Exception e) {
			return "<error>Unable to convert to XML</error>";
		}
	}

	@GetMapping(value = "/convert-to-json", produces = "application/json")
	public ResponseEntity<Employee> convertXmlToJson() {
		try {
			File xmlfile = new File("Employee.xml");

			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			Employee employee = (Employee) unmarshaller.unmarshal(xmlfile);

			return ResponseEntity.ok(employee);

		} catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
	}

	// New: Upload XML and convert to Java object / from POSTMAN
	@PostMapping("/xml-to-json")
	public ResponseEntity<?> uploadXml(@RequestParam("file") MultipartFile file) {
		try (InputStream is = file.getInputStream()) {

			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Employee employee = (Employee) unmarshaller.unmarshal(is);

			return ResponseEntity.ok(employee);

		} catch (Exception e) {
			return ResponseEntity.badRequest()
					.body("Invalid XML format or error during unmarshalling: " + e.getMessage());
		}
	}

//    Endpoint: POST http://localhost:8080/xml-to-json
//    	Form field: file
//    	Type: File (upload employee.xml)

	// uploading the file from resources
	@GetMapping("/load-xml-from-resource")
	public ResponseEntity<?> loadXmlFromResource() {
		try (InputStream is = getClass().getClassLoader().getResourceAsStream("employee.xml")) {

			if (is == null) {
				return ResponseEntity.badRequest().body("XML file not found in resources.");
			}

			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Employee employee = (Employee) unmarshaller.unmarshal(is);

			return ResponseEntity.ok(employee);

		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Error while reading XML: " + e.getMessage());
		}
	}

}
