/**
 * 
 */
package com.hcl.pp.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sunil
 *
 */
public class Main {

	/**
	 * @param args
	 */
	@Autowired  
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		
		Pet pet1 = new Pet();
		pet1.setName("cat");
		pet1.setPlace("vizag");
		pet1.setAge(2);
		Pet pet2 = new Pet();
		pet2.setName("dog");
		pet2.setPlace("vizag");
		pet2.setAge(1);
		User user = new User();
		user.setUserName("sunil");
		user.setPassword("kumar");
		user.getPets().add(pet1);
		user.getPets().add(pet2);
		Session session = sessionFactory.getCurrentSession();
		session.persist(pet1);
		session.persist(pet2);
		session.persist(user);
		
		
	}

}
