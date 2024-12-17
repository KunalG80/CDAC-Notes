package many_to_many.bidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import many_to_many.bidirectional.Actor;
import many_to_many.bidirectional.utilties.ManyToManyBidirectionalConfigurationUtilities;

public class AddActorsExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				ManyToManyBidirectionalConfigurationUtilities.
				getSessionFactory();
				Session sessionObject = factory.openSession();				
				){
			Actor a1 = new Actor("A01", "Manoj Bajpayee", null);
			Actor a2 = new Actor("A02", "K K Menon", null);
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(a1);
				sessionObject.persist(a2);
			tx.commit();
			System.out.println("Actors added.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
