package com.skilldistillery.sneakercollection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.sneakercollection.data.SneakerDAO;

@Controller
public class SneakerController {
	@Autowired
	private SneakerDAO sneakerDao;

	@RequestMapping(path = {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("sneakerList", sneakerDao.findAll());
		return "home";
	}

}
