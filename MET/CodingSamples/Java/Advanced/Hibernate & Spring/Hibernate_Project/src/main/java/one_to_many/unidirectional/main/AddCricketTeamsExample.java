package one_to_many.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many.unidirectional.CricketTeam;
import one_to_many.unidirectional.utilities.OneToManyUnidirectionalConfigurationUitilities;

public class AddCricketTeamsExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				OneToManyUnidirectionalConfigurationUitilities.
				getSessionFactory();
				Session sessionObject = factory.openSession()
				){
					CricketTeam teamIndia = 
							new CricketTeam("IND", "India", null);
					CricketTeam teamAustralia =
							new CricketTeam("AUS", "Australia", null);
					Transaction tx = sessionObject.beginTransaction();
						sessionObject.persist(teamIndia);
						sessionObject.persist(teamAustralia);
					tx.commit();
					System.out.println("Teams added.");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}

	}

}
