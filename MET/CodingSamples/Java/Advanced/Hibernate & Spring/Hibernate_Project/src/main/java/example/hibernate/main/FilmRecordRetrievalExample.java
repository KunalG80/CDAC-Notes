package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Film;
import example.hibernate.entity.Movie;
import example.hibernate.utilties.ProgrammaticConfigurationUtilities;

public class FilmRecordRetrievalExample {
	//This program demonstrates record retrieval against ID
	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				ProgrammaticConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			Film retrievedFilm = sessionObject.find(Film.class, 101);
			if(retrievedFilm != null) {
				System.out.println(retrievedFilm);
				System.out.println(retrievedFilm.getTitle());
			}
			else
				System.out.println("Film with given ID does not exist.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
