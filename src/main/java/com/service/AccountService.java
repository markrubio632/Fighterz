package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoImpl;
import com.fighters.Fighter;

@Service
public class AccountService {

	// insert validation for anything account related

	@Autowired
	DaoImpl daoimpl;

	public boolean fighterExists(String userName, String password) {

		List<Fighter> fighter = daoimpl.findFighters();
		
		for(Fighter fight : fighter) {
			
			if(fight.getUserName().equals(userName) && fight.getPass().equals(password)) {
				return true;
			}
			
		}
		
		return false;
	}

}
