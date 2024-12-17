package one_to_one.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.Employee;
import one_to_one.unidirectional.utilities.OneToOneUnidirectionalConfigurationUtilities;

public class AddEmployees {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				OneToOneUnidirectionalConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			Employee e1 = new Employee(1234, "Mr. Dinesh", 50000.45f, null);
			Employee e2 = new Employee(5678, "Mrs. Anjali", 60000.45f, null);
			Transaction tx = sessionObject.beginTransaction();
				sessionObject.persist(e1);
				sessionObject.persist(e2);
			tx.commit();
			System.out.println("Employees added.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
