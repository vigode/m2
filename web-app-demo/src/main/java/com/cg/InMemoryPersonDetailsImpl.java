/*package com.cg;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryPersonDetailsImpl implements PersonDetailsDAO {
	
	@Override
	public List<Person>findAll() {
		
		Person person = new Person();
		person.setAge(25);
		person.setId(1);
		person.setName("Harry");
		
		List<Person> persons = new LinkedList<>();
		persons.add(person);
		
		return persons;
	}

}
*/