package example.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.Film;
import example.hibernate.utilties.ProgrammaticConfigurationUtilities;

public class SelectClauseExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				ProgrammaticConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			String hqlQuery = "select f.title, f.type from Film f";
			Query<Object[]> queryObject = 
					sessionObject.createQuery(hqlQuery, Object[].class);
			List<Object[]> dataList = queryObject.list();
			for(Object[] data : dataList) {
				Object title = data[0];
				Object type = data[1];
				System.out.println(title + " : " + type);
			}	
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
