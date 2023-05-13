package com.skilldistillery.sneakercollection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.sneakercollection.data.SneakerDAO;
import com.skilldistillery.sneakercollection.entities.Sneaker;

@Controller
public class SneakerController {
	@Autowired
	private SneakerDAO sneakerDao;

	@RequestMapping(path = { "/", "home.do" })
	public String home(Model model) {
		model.addAttribute("sneakerList", sneakerDao.findAll());
		return "home";
	}

	@RequestMapping(path = "getSneaker.do", method = RequestMethod.GET)
	public String getSneaker(Integer sneakerId, Model model) {
		Sneaker sneaker = sneakerDao.findById(sneakerId);
		model.addAttribute(sneaker);
		return "single";
	}

	@RequestMapping(path = "listAll.do", method = RequestMethod.GET)
	public String listAllSneakers(Model model) {
		List<Sneaker> sneakers = sneakerDao.findAll();
		model.addAttribute(sneakers);
		return "multiple";
	}
	
	@RequestMapping(path="createSneaker.do", method = RequestMethod.GET)
	public String createSneakerForm(Sneaker sneaker) {
		return "newSneaker";
	}
	
	@RequestMapping(path="createdSneaker.do", method = RequestMethod.POST)
	public String createSneaker(Sneaker sneaker, Model model) {
		model.addAttribute("sneaker", sneakerDao.create(sneaker));
		return "single";
	}

	@RequestMapping(path = "editSneaker.do", method = RequestMethod.GET)
	public String editSneak(Sneaker sneaker, int sneakerId, Model model) {
		model.addAttribute("sneaker", sneakerDao.findById(sneakerId));
		return "edit";
	}

	@RequestMapping(path = "updatedSneaker.do", method = RequestMethod.POST)
	public String updateSneaker(int sneakerId, Model model, Sneaker sneaker) {
		sneakerDao.update(sneakerId, sneaker);
		model.addAttribute("sneaker", sneaker);
		return "update";
	}

	@RequestMapping(path = "delete.do", method = RequestMethod.POST)
	public String deleteSneaker(@RequestParam("sneakerId") int sneakerId, Model model) {
		sneakerDao.deleteById(sneakerId);
		model.addAttribute("result", "Sneaker DELETED!");
		return "deleted";
	}
}
