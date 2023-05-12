package com.skilldistillery.sneakercollection.entities;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SneakerTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Sneaker sneaker;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPASneaker");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		sneaker = em.find(Sneaker.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		sneaker = null;
	}

	@Test
	void test() {
		assertNotNull(sneaker);
		assertEquals("Jordan", sneaker.getBrand());
	
	}

}
