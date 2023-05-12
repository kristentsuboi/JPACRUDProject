package com.skilldistillery.sneakercollection.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.sneakercollection.entities.Sneaker;


@Service
@Transactional
public class SneakerDAOImpl implements SneakerDAO {
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Sneaker findById(int sneakerId) {
		return em.find(Sneaker.class, sneakerId);
	}

	@Override
	public List<Sneaker> findAll() {
		String jpql = "SELECT s FROM Sneaker s";
		return em.createQuery(jpql, Sneaker.class).getResultList();
	}

	@Override
	public Sneaker create(Sneaker sneaker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sneaker update(int sneakerId, Sneaker sneaker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int sneakerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
