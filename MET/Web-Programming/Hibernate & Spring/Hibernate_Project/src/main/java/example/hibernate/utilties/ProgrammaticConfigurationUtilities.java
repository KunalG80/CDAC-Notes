package example.hibernate.utilties;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Film;

public class ProgrammaticConfigurationUtilities {

	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		Properties hibernateProps = new Properties();
		//Adding Hibernate configuration specific properties into Properties object
		hibernateProps.put(
				"hibernate.connection.url", 
				"jdbc:mysql://localhost:3306/bollywood");
		
		hibernateProps.put(
				"hibernate.connection.username", 
				"root");
		
		hibernateProps.put(
				"hibernate.connection.password", 
				"root");
		
		hibernateProps.put(
				"hibernate.show_sql", 
				"true");
		
		hibernateProps.put(
				"hibernate.hbm2ddl.auto", 
				"update");
		//Associating Properties object with Configuration object
		conf.setProperties(hibernateProps);
		//Adding the annotated class: Film to the configuration
		//Class<Film> filmClassType = Film.class;
		conf.addAnnotatedClass(Film.class);
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}

}




