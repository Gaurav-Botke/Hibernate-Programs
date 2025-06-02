package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class SaveObjectTest {

	public static void main(String[] args) {
	 
        Configuration cfg = null;
        SessionFactory factory = null;
        Session ses = null;
        Product prod = null;
        Transaction tx = null;
        boolean flag = false;
        //Activate Hibernate f/w(Bootstrap hobernate)
        cfg = new Configuration();
        //supply hibernate cfg file as input file
        cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
        //build Session Factory
        factory = cfg.buildSessionFactory();
        //open Session
        ses = factory.openSession();
        //create Entity object to save with DB s/w
		
		
		  prod = new Product();
		 // prod.setPid(777);
		  prod.setPname("MOBILE");
		  prod.setPrice(2000.0f); prod.setQty(5.0f);
		 
		 
        
        try {
			tx = ses.beginTransaction(); //Internally calls con.setAutoCommit(false) to begin the Tx
			//save object
			ses.save(prod);
			flag = true;
		} catch (HibernateException e) {
                 e.printStackTrace();
                 flag = false;
		}
        finally {
			//commit or rollback tx
        	if(flag == true) {
        		tx.commit();   //intenally call con.commit()
        		System.out.println("Data is successfully added");
        	}else {
        		tx.rollback(); // internally calls con.rollback()
        	}
        	// close session object
        	ses.close();
        	//close factory
        	factory.close();
        	
		}//finally
	}//main

}//class













