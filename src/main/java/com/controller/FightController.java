package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crud.CRUDRepo;
import com.profileService.profileService;

@Controller
@SessionAttributes("fighter")
public class FightController {
	
	@Autowired
	CRUDRepo repo;
	
	@Autowired
	profileService serv;
	
	@GetMapping("/login")
	public String fighterLogin(ModelMap model) {
		return "login";
	}

}
