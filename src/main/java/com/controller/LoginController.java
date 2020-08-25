package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.CRUDRepo;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.DaoImpl;
import com.fighters.Fighter;
import com.profileService.LoginService;

@Controller
@SessionAttributes("fighter")
public class LoginController {
	
	//HANDLES LOGIN AND REGISTRATION
	
	@Autowired
	CRUDRepo repo;

	@Autowired
	LoginService login;
	
	@Autowired
	DaoImpl daoimpl;
	
	@GetMapping("/index")
	public String showIndex(ModelMap model) {
		return "/index";
	}
	
	@GetMapping("/register")
	public String fighterRegistration(ModelMap model) {
		Fighter fighter = new Fighter();
		model.addAttribute(fighter);
		return "register";
	}

	@PostMapping("/register")
	public String fighterRegistered(ModelMap model, @RequestParam String userName, @RequestParam String pass, @RequestParam String fName, @RequestParam String nickName,
			@RequestParam String lName, @RequestParam int gender) {
		
		/*
		 * model.put("fName", fName); model.put("nickName", nickName);
		 * model.put("lName", lName); model.put("gender", gender);
		 */

		//insert validation to check user input - i.e. phone number specific length/format
		daoimpl.addFighter(new Fighter(0,userName, pass, fName, nickName, lName, gender));

		return "account";
	}
	
	@GetMapping("/login")
	public String showLogin(ModelMap model) {
		
		//creates a temporary fighter account to empty out log outs when hitting login page
		Fighter tempFighter = new Fighter();
		model.put("temp", tempFighter);
		
		return "login";
	}
	
	@PostMapping("/login")
	public String LoginSuccess(ModelMap model, @RequestParam String userName, @RequestParam String pass ) {
		
		List<Fighter> fList = daoimpl.findFighters();
		
		for(Fighter fighter : fList) {
			if(login.fighterReady(userName, pass)) {
				//if true in the service, replace temporary user with the newly logged user
				model.replace("temp", fighter);
			}
			//if the user is not found, then give out error
			//needs to be implemented in JSP
			else {
				model.put("loginError", "Invalid Credentials. Please Try Again");
				return "login";
			}
			
		}
		
		return "welcome";
	}
	
}
