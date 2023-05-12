package com.skilldistillery.sneakercollection.data;

import java.util.List;

import com.skilldistillery.sneakercollection.entities.Sneaker;

public interface SneakerDAO {

	Sneaker findById(int sneakerId);
	List<Sneaker> findAll();
	Sneaker create(Sneaker sneaker);
	Sneaker update(int sneakerId, Sneaker sneaker);
	boolean deleteById(int sneakerId);
}
