package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.utilties.ProgrammaticConfigurationUtilities;

public class FilmRecordInsertionExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				ProgrammaticConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			Film f1 = new Film(105, "83", "Sports");
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(f1);
			tx.commit();
			System.out.println("Record added.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
