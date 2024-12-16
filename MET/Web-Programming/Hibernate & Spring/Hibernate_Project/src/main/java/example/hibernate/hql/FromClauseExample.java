package example.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.Film;
import example.hibernate.utilties.ProgrammaticConfigurationUtilities;

public class FromClauseExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				ProgrammaticConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			String hqlQuery = "from Film f";
			Query<Film> queryObject = 
					sessionObject.createQuery(hqlQuery, Film.class);
			List<Film> allFilms = queryObject.list();
			for(Film currentFilm : allFilms)
				System.out.println(currentFilm.getTitle());
				//System.out.println(currentFilm);
			System.out.println("------------------------");
			allFilms.stream().
			forEach(currentFilm -> System.out.println(currentFilm.getTitle()));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
