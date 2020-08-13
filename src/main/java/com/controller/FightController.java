package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crud.CRUDRepo;
import com.fighters.Fighter;
import com.profileService.profileService;

@Controller
@SessionAttributes("fighter")
public class FightController {

	@Autowired
	CRUDRepo repo;

	@Autowired
	profileService serv;

	@GetMapping("/register")
	public String fighterRegistration(ModelMap model) {
		Fighter fighter = new Fighter();
		model.addAttribute("fighter", fighter);
		return "register";
	}

	@PostMapping("/register")
	public String fighterRegistered(ModelMap model, @RequestParam String fName, @RequestParam String nickName,
			@RequestParam String lName, @RequestParam int gender) {

		model.put("fName", fName);
		model.put("nickName", nickName);
		model.put("lName", lName);
		model.put("gender", gender);

		serv.addFighter(new Fighter(0, fName, nickName, lName, gender));

		// serv.addFighter(fighter);

		return "account";
	}

	@GetMapping("/account")
	public String showAccount(ModelMap model, Fighter fighter, int id) {

		List<Fighter> mainFighter = serv.findById(id);

		model.put("mainFighter", mainFighter);
		System.out.println(mainFighter);
		return "account";
	}

	@GetMapping("/fightview")
	public String allFighters(ModelMap model) {

		List<Fighter> allFighters = serv.findFighters();
		model.put("allFighters", allFighters);

		return "/fightview";
	}

}
