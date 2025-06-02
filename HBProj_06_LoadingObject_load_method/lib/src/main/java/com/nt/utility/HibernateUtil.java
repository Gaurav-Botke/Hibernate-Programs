package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
       private static SessionFactory factory;
      
      static {
    	  Configuration cfg = null;
    	  
    	  try {
    		  cfg = new Configuration();
			  cfg.configure("com/nt/cfgs/Hibernate.cfg.xml");
			  
			  factory = cfg.buildSessionFactory();
			  
		} catch (HibernateException he) {
                   he.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
    	  
      }//static
      
      public static Session getSession() {
    	  Session ses = null;
    	  if(factory != null)
    		  ses = factory.openSession();
          
    	  return ses;
      }
      
      public static void closeSession(Session ses) {
    	  if(ses != null)
    		  ses.close();
      }
      
      public  static void closeSessionFactory() {
    	  if(factory != null)
    		  factory.close();
      }
      
}













