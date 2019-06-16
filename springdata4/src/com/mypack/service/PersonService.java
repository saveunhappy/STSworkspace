package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.domain.Person;
import com.mypack.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public void savePersons(List<Person> persons) {
		personRepository.save(persons);
	}
	
	
	@Transactional
	public void updatePerson(String email,Integer id) {
		personRepository.updatePersonEmail(id, email);
	}
}
