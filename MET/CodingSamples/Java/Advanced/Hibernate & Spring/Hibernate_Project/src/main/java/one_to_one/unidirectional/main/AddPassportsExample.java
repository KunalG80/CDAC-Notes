package one_to_one.unidirectional.main;



import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.Passport;
import one_to_one.unidirectional.utilities.OneToOneUnidirectionalConfigurationUtilities;

public class AddPassportsExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				OneToOneUnidirectionalConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			Passport p1 = 
			new Passport("P01", "Dinesh Vaidya", LocalDate.of(2027, 5, 14));
			
			Passport p2 = 
					new Passport("P02", "Anjali Sharma", LocalDate.of(2029, 8, 24));
			
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(p1);
				sessionObject.persist(p2);
			tx.commit();
			System.out.println("Passports added.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
