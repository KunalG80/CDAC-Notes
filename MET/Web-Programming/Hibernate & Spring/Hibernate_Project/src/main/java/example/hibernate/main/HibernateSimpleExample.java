package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Movie;

//This program demonstrates Record Insertion - DML
public class HibernateSimpleExample {
	
	public static void main(String[] args) {
		//Configuring Hibernate
		Configuration conf = new Configuration();
		conf = conf.configure();
		//Obtaining SessionFactory
		SessionFactory factory = conf.buildSessionFactory();
		//Obtaining Session
		Session sessionObject = factory.openSession();
		//Building a Movie object
		Movie movieObject = new Movie(102, "Drishyam 2", "Action", 145);
		//Obtaining and Starting the Transaction
		Transaction trx = sessionObject.beginTransaction();
			sessionObject.persist(movieObject);//Store or Save data into DB
		trx.commit();//Commits the transaction
		//Closing the Session
		sessionObject.close();
		//Closing the SessionFactory
		factory.close();
		System.out.println("Record added successfully.");
	}

}





