package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;
import com.nt.utility.HibernateUtil;

public class PersistObjectTest {

	public static void main(String[] args) {
	 
		
        Session ses = null;
        Product prod = null;
        Transaction tx = null;
        boolean flag = false;
        
        //getHibernate Session object
        ses = HibernateUtil.getSession();
        
		
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
        	HibernateUtil.closeSession(ses);
        	//close factory
        	HibernateUtil.closeSessionFactory();
        	
		}//finally
	}//main

}//class













