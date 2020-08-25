package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.DaoImpl;
import com.fighters.Fighter;

@Controller
@SessionAttributes("fighter")
public class AccountController {
	
	//HANDLES ACCOUNT STUFF
	//i.e. settings, accounts, etc.
	//registration and login will be done in login controller
	
	@Autowired
	DaoImpl daoimpl;
	
	@GetMapping("/account")
	public String showAccount(ModelMap model, Fighter fighter, int id) {

		List<Fighter> mainFighter = daoimpl.findById(id);

		model.put("mainFighter", mainFighter);
		System.out.println(mainFighter);
		return "account";
	}
	
}
