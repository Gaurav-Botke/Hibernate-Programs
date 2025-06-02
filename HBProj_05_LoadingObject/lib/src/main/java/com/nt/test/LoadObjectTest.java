package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session ses = null;
		InsurancePolicy policy = null;
		//get Session object
		ses = HibernateUtil.getSession();
		try {
			//Load object
			policy = ses.get(InsurancePolicy.class,111L);
			//verify
		if(policy == null)
			System.out.println("Record not found");
		else {
			System.out.println("Record found and display");
			System.out.println(policy);
		}
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		

	}

}
