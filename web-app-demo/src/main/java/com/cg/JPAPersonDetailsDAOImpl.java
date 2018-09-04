
package com.cg;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class JPAPersonDetailsDAOImpl implements PersonDetailsDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Person> findAll() {
		System.out.println("in jpa");
		Query query = entityManager.createQuery("select person from Person person");
		return query.getResultList();
	}

} 
 
