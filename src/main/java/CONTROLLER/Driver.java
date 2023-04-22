package CONTROLLER;

import DAO.Dao;
import DTO.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		Person person = new Person();
		Pancard pancard = new Pancard();
		
		person.setId(1);
		person.setName("Harshraj");
		person.setLocation("Sangola");
		person.setPancard(pancard);
		
		pancard.setId(001);
		pancard.setP_name("Harshraj Shinde");
		pancard.setPerson(person);
		
		
		Dao dao = new Dao();
		
//		dao.savePerson(person);
//		dao.findPerson(1);
//		dao.deletePersonById(1);
		dao.updatePerson(1, person);
		
		
	}

}
