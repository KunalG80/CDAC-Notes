package many_to_many.bidirectional.utilties;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import many_to_many.bidirectional.Actor;
import many_to_many.bidirectional.WebSeries;

public class ManyToManyBidirectionalConfigurationUtilities {
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		Properties hibernateProps = new Properties();
		//Adding Hibernate configuration specific properties into Properties object
		hibernateProps.put(
				"hibernate.connection.url", 
				"jdbc:mysql://localhost:3306/ott");
		
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
		conf.addAnnotatedClass(WebSeries.class);
		conf.addAnnotatedClass(Actor.class);
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}
}
