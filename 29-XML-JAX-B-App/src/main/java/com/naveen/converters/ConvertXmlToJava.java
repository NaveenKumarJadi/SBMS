//package com.naveen.converters;
//
//import java.io.File;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//
//import com.naveen.binding.Person;
//
//public class ConvertXmlToJava {
//
//	public static void main(String[] args) throws Exception {
//
//		File xmlfile = new File("Person.xml");
//
//		JAXBContext context = JAXBContext.newInstance(Person.class);
//
//		Unmarshaller unmarshaller = context.createUnmarshaller();
//
//		Object object = unmarshaller.unmarshal(xmlfile);
//
//		Person person = (Person) object;
//
//		System.out.println(person);
//	}
//}
