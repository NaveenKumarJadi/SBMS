package com.naveen.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.entity.Passport;
import com.naveen.entity.Person;
import com.naveen.repo.PassportRepo;
import com.naveen.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PassportRepo passportRepo;
	
	public void getPassport() {
		passportRepo.findById(1);
	}

	public void getPerson() {
		personRepo.findById(1);
	}

	public void savePerson() {

		Person p = new Person();
		p.setName("John");
		p.setGender("Male");

		Passport pp = new Passport();
		pp.setPassportNum("JJ797979");
		pp.setIssuedDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));

		// associating person with passport
		p.setPassport(pp);

		// associating passport with person
		pp.setPerson(p);

		// saving person record (parent)
		personRepo.save(p);

		System.out.println("Record inserted...");

	}

}