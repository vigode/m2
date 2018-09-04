package com.cg;

import java.util.List;

public interface PersonDetailsDAO {
	
	public List<Person>findAll();
    public Person findById(int id);
    public void create(Person person);
    public void update(Person person);
}