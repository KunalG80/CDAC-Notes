package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.entity.Movie;
import example.hibernate.utilties.ProgrammaticConfigurationUtilities;

public class FilmRecordUpdationExample {
	//This program demonstrates record retrieval against ID
	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				ProgrammaticConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			Film retrievedFilm = sessionObject.find(Film.class, 101);
			if(retrievedFilm != null) {//If film exists then make changes and update them towards DB
				Transaction tx = sessionObject.beginTransaction();
					retrievedFilm.setTitle("83");
					retrievedFilm.setType("Sports");
				tx.commit();
				//System.out.println(retrievedFilm);
				System.out.println("Record updated.");
			}
			else
				System.out.println("Film with given ID does not exist.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
