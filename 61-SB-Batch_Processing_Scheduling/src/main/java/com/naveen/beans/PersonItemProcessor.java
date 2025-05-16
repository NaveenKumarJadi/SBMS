package com.naveen.beans;

import org.springframework.batch.item.ItemProcessor;

import com.naveen.record.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person item) throws Exception {

		final String fname = item.firstName().toUpperCase();
		final String lname = item.lastName().toUpperCase();

		final Person transformedPerson = new Person(fname, lname);

		log.info("Converting ({}) into ({})", item, transformedPerson);
		return transformedPerson;
	}

}