package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.DaoImpl;
import com.fighters.Fighter;

@Controller
@RequestMapping(path="/fight")
@SessionAttributes("fighter")
public class FightController {
	
	//CONTROLLER FOR ACTIONS THAT USER DOES
	//i.e. user swipes, this controller handles the action
	
	@Autowired
	DaoImpl daoimpl;


	@GetMapping("/fightview")
	public String allFighters(ModelMap model) {

		List<Fighter> allFighters = daoimpl.findFighters();
		model.put("allFighters", allFighters);

		return "/fightview";
	}

}
