package many_to_many.bidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import many_to_many.bidirectional.WebSeries;
import many_to_many.bidirectional.utilties.ManyToManyBidirectionalConfigurationUtilities;

public class AddWebSeriesExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory =
				ManyToManyBidirectionalConfigurationUtilities.
				getSessionFactory();
				Session sessionObject = factory.openSession();				
				){
			WebSeries series1 = 
					new WebSeries("W01", "The Family Man", null);
			WebSeries series2 = 
					new WebSeries("W02", "Revenge", null);
			WebSeries series3 = 
					new WebSeries("W03", "The Final Destination", null);
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(series1);
				sessionObject.persist(series2);
				sessionObject.persist(series3);
			tx.commit();
			System.out.println("Web Serieses added.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
