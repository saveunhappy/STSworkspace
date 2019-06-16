package com.mypack.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = null;
	private JPAUtil() {}
	
	static {
		emf = Persistence.createEntityManagerFactory("myPersistence");
	}
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
