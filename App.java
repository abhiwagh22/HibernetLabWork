package com.example.PersonAndPassport;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App
{
	public static void main(String args[]) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			Person person=new Person();
			person.setpName("ABhishek");
			person.setEmail("abhishek@gmail.com");
			
			Person person1=new Person();
			person1.setpName("Tejas");
			person1.setEmail("tejas@gmail.com");
			
			Person person2=new Person();
			person2.setpName("Sameer");
			person2.setEmail("sam@gmail.com");
			
			Passport passport=new Passport();
			passport.setPassportType("Regular");
			
			Passport passport1=new Passport();
			passport1.setPassportType("Domestic");
			
			Passport passport2=new Passport();
			passport2.setPassportType("Regular");
			
			person.setPassport(passport);
			person1.setPassport(passport1);
			person2.setPassport(passport2);
			passport.setPerson(person);
			passport1.setPerson(person1);
			passport2.setPerson(person2);
			
			session.save(person);
			session.save(person1);
			session.save(person2);
			
			session.getTransaction().commit();
			
			 Person retrievedPerson=session.get(Person.class, person.getpId());
			 Passport retrievedPassport=retrievedPerson.getPassport();

			 System.out.println("Person ID: "+retrievedPerson.getpId());
			 System.out.println("Person Name: "+retrievedPerson.getpName());
			 System.out.println("Person Email: "+retrievedPerson.getEmail());
			 System.out.println("Passport: "+retrievedPassport.getPassportId());
			 System.out.println("Passport Type: "+retrievedPassport.getPassportType());
		}
		finally 
		{
			session.close();
            sessionFactory.close();
		}
	}
}