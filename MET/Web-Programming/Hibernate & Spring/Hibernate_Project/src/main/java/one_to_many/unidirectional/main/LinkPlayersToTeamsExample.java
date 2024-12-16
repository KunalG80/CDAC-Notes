package one_to_many.unidirectional.main;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many.unidirectional.CricketPlayer;
import one_to_many.unidirectional.CricketTeam;
import one_to_many.unidirectional.utilities.OneToManyUnidirectionalConfigurationUitilities;

public class LinkPlayersToTeamsExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				OneToManyUnidirectionalConfigurationUitilities.
				getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			//Fetch the teams in which players are to be added
			CricketTeam teamIndia = 
					sessionObject.find(CricketTeam.class, "IND");
			CricketTeam teamAustralia = 
					sessionObject.find(CricketTeam.class, "AUS");
			//Fetch the players which are to be added in the team
			CricketPlayer player1 = 
					sessionObject.find(CricketPlayer.class, 101);
			CricketPlayer player2 =
			sessionObject.find(CricketPlayer.class, 102);
			CricketPlayer player3 =
			sessionObject.find(CricketPlayer.class, 103);
			CricketPlayer player4 =
			sessionObject.find(CricketPlayer.class, 104);
			CricketPlayer player5 =
			sessionObject.find(CricketPlayer.class, 105);
			//Add players to teams
			Transaction tx = sessionObject.beginTransaction();
				//Adding players into Indian team using setter method
				Collection<CricketPlayer> indianPlayers = 
						List.of(player1, player2, player3);
				teamIndia.setCricketPlayers(indianPlayers);
				//Adding players into Australian team using add...() method
				teamAustralia.addCricketPlayer(player4);
				teamAustralia.addCricketPlayer(player5);
			tx.commit();
			System.out.println("Players added to teams.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	
	
}
