package example.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.Film;
import example.hibernate.utilties.ProgrammaticConfigurationUtilities;

public class ConstructorExpressionExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				ProgrammaticConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
					String hqlQuery = 
					"select new java.lang.String(f.title) from Film f";
					Query<String> queryObject = 
							sessionObject.createQuery(hqlQuery, String.class);
					List<String> allTitles = queryObject.list();
					allTitles.stream().
					forEach(title -> System.out.println(title.toUpperCase()));
			
			}	
		
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
