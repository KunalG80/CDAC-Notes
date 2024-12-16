package many_to_many.bidirectional.main;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import many_to_many.bidirectional.Actor;
import many_to_many.bidirectional.WebSeries;
import many_to_many.bidirectional.utilties.ManyToManyBidirectionalConfigurationUtilities;

public class LinkActorsToWebSeriesesExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				ManyToManyBidirectionalConfigurationUtilities.
				getSessionFactory();
				Session sessionObject = factory.openSession();				
				){
			//Find the actors which are to be linked
			Actor actor1 = sessionObject.find(Actor.class, "A01");
			Actor actor2 = sessionObject.find(Actor.class, "A02");
			
			//Find the web serieses for which actors are to be linked
			WebSeries series1 = sessionObject.find(WebSeries.class, "W01");
			WebSeries series2 = sessionObject.find(WebSeries.class, "W02");
			WebSeries series3 = sessionObject.find(WebSeries.class, "W03");
			
			//Adding Actors to Web Serieses
			Transaction tx = sessionObject.beginTransaction();
				Collection<Actor> bothActors = List.of(actor1, actor2);
				series1.setActors(bothActors);
				series3.setActors(bothActors);
				series2.addActor(actor2);
			tx.commit();
			System.out.println("Actors added to Web Serieses");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
