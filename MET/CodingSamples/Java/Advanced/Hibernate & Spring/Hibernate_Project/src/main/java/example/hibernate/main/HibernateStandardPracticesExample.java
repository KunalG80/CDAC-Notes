package example.hibernate.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Movie;
import example.hibernate.utilties.HibernateUtilities;

public class HibernateStandardPracticesExample {

	public static void main(String[] args) {
		Scanner scr;
		//Opening a SessionFactory and a Session using try-with-resources
		try(
				SessionFactory factory = HibernateUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
				Movie m1 = new Movie(107, "Mother India", "Inspirational", 175);
				Transaction tx = sessionObject.beginTransaction();
					sessionObject.persist(m1);
				tx.commit();
				System.out.println("Record added.");
				//No need to call close() method on SessionFactory and Session
				//because they get closed automatically.
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
