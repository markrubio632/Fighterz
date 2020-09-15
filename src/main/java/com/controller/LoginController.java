package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.CRUDRepo;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.DaoImpl;
import com.fighters.Fighter;
import com.service.LoginService;

@Controller
@RequestMapping(path="/login")
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
	public String showIndex() {
		return "/index";
	}
	
	@GetMapping("/register")
	public String fighterRegistration() {
		return "register";
	}

	@PostMapping("/register")
	public String fighterRegistered(ModelMap model, @RequestParam String userName, @RequestParam String pass, @RequestParam String fName, @RequestParam String nickName,
			@RequestParam String lName, @RequestParam String gender) {

		//insert validation to check user input - i.e. phone number specific length/format
		daoimpl.addFighter(new Fighter(0,userName, pass, fName, nickName, lName, gender));

		//redirect/move page to character specs
		return "showAccount";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		
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
				//DISPLAY ERROR MESSAGE / LOGIN FAILED
				//model.put("loginError", "Invalid Credentials. Please Try Again");
				return "login";
			}
			
		}
		
		return "welcome";
	}
	
	//when the logout button is hit call this method
	@GetMapping("/logout")
	public String logoutSuccess(ModelMap model) {
		model.clear();
		return "index";
	}
	
}
