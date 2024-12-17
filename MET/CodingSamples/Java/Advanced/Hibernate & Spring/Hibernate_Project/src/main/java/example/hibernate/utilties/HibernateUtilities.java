package example.hibernate.utilties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	//This class is used to build and return SessionFactory
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		conf = conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}

}
