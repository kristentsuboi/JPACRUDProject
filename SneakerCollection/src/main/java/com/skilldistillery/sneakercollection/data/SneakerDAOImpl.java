package com.skilldistillery.sneakercollection.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
		em.persist(sneaker);
		return sneaker;
	}

	@Override
	public Sneaker update(int sneakerId, Sneaker updatedSneaker) {
		Sneaker sneaker = em.find(Sneaker.class, sneakerId);
		sneaker.setBrand(updatedSneaker.getBrand());
		sneaker.setStyle(updatedSneaker.getStyle());
		sneaker.setPrimaryColor(updatedSneaker.getPrimaryColor());
		sneaker.setSecondaryColor(updatedSneaker.getSecondaryColor());
		sneaker.setSize(updatedSneaker.getSize());
		sneaker.setResaleValue(updatedSneaker.getResaleValue());
		return sneaker;
	}

	@Override
	public boolean deleteById(int sneakerId) {
		Sneaker sneaker = em.find(Sneaker.class, sneakerId);
		em.remove(sneaker);
		if (sneaker == null) {
			return true;
		} else {
			return false;
		}
	}

}
