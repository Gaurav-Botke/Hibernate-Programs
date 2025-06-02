package com.nt.test;


import org.hibernate.Session;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

public class ObjectTest {

	public static void main(String[] args) {
		
		Session ses;
		InsurancePolicy policy = null;
		ses = HibernateUtil.getSession();
		
		try {
			policy = ses.load(InsurancePolicy.class, 111L);    //load(-,-) is deprecated new one is find(-,-)
			System.out.println(policy.getClass().getSuperclass());
			
			if(policy == null) {
				System.out.println("Record not found");
			}
			else {
				System.out.println("Record Found And Display");
				System.out.println(policy);
			}
		 }
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		

	}

}
