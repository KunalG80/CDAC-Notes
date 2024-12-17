package one_to_many.unidirectional.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import one_to_many.unidirectional.CricketPlayer;
import one_to_many.unidirectional.CricketTeam;

public class OneToManyUnidirectionalConfigurationUitilities {
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		Properties hibernateProps = new Properties();
		//Adding Hibernate configuration specific properties into Properties object
		hibernateProps.put(
				"hibernate.connection.url", 
				"jdbc:mysql://localhost:3306/sports");
		
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
		
		conf.setProperties(hibernateProps);
		conf.addAnnotatedClass(CricketTeam.class);
		conf.addAnnotatedClass(CricketPlayer.class);
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}
	
}
