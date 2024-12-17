package one_to_many.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many.unidirectional.CricketPlayer;
import one_to_many.unidirectional.utilities.OneToManyUnidirectionalConfigurationUitilities;

public class AddCricketPlayersExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				OneToManyUnidirectionalConfigurationUitilities.
				getSessionFactory();
				Session sessionObject = factory.openSession()
				){
				CricketPlayer player1 = 
						new CricketPlayer(101, "Rohit Sharma", 36);
				CricketPlayer player2 = 
						new CricketPlayer(102, "Virat Kohli", 36);
				CricketPlayer player3 = 
						new CricketPlayer(103, "Rishabh Pant", 27);
				CricketPlayer player4 = 
						new CricketPlayer(104, "Pat Cummins", 32);
				CricketPlayer player5 = 
						new CricketPlayer(105, "Glenn Maxwell", 34);
				Transaction tx = sessionObject.beginTransaction();
					sessionObject.persist(player1);
					sessionObject.persist(player2);
					sessionObject.persist(player3);
					sessionObject.persist(player4);
					sessionObject.persist(player5);
				tx.commit();
				System.out.println("Players added.");
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}

	}

}
