package one_to_one.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.Employee;
import one_to_one.unidirectional.Passport;
import one_to_one.unidirectional.utilities.OneToOneUnidirectionalConfigurationUtilities;

public class LinkPassportsToEmployees {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				OneToOneUnidirectionalConfigurationUtilities.getSessionFactory();
				Session sessionObject = factory.openSession()
				){
			//Find the passports which are to be linked
			Passport passport1  = sessionObject.find(Passport.class, "P01");
			Passport passport2 = sessionObject.find(Passport.class, "P02");
			//Find the employees to which passports are to be linked
			Employee employee1 = sessionObject.find(Employee.class, 1234);
			Employee employee2 =sessionObject.find(Employee.class, 5678);
			//Link passports to employees
			Transaction tx = sessionObject.beginTransaction();
				employee1.setPassport(passport1);
				employee2.setPassport(passport2);
			tx.commit();
			System.out.println("Linking succeeded.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
