package com.naveen.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Mashaller;

import com.naveen.binding.Address;
import com.naveen.binding.Person;

public class ConvertJavaToXml {

	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("HYD");
		addr.setState("TG");
		addr.setCountry("INDIA");

		Person person = new Person();
		person.setId(101);
		person.setName("John");
		person.setAge(25);
		person.setType("Docker");
		person.setPhno(1257571L);
		person.setAddress(addr);

		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = instance.createMarshaller();

		marshaller.marshal(person, new File("Person.xml"));

		System.out.println("Marshalling Completed....");
	}
}
