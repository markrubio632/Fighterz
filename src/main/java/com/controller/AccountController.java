package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.DaoImpl;
import com.fighters.Fighter;

@Controller
@RequestMapping(path = "/account")
@SessionAttributes("fighter")
public class AccountController {

	@Autowired
	DaoImpl dao;

	@GetMapping("/account")
	public String showAccount(ModelMap model, Fighter fighter, int id) {

		Optional<Fighter> mainFighter = dao.findById(id);
		
		return "account";
	}

}
