package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.Person;

public class Dao 
{
	
	public void savePerson(Person person) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}

	public void findPerson(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	      Person person = 	entityManager.find(Person.class, id);
	      System.out.println(person);
		
	}
	
	public void deletePersonById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
		entityTransaction.commit();

	}

	public void updatePerson(int id, Person person) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		Person person2 = entityManager.find(Person.class, id);
		person2.setId(id);
		person2.setPancard(person.getPancard());
		person2.setName("Harshu");
		entityManager.merge(person2);
		entityTransaction.commit();

	}

}
