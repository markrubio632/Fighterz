package com.profileService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.fighters.Fighter;
import com.dao.DaoImpl;

@Service
public class LoginService {
	
	@Autowired
	DaoImpl daoimpl;
	
	public boolean fighterReady(String name, String pass) {
		
		List<Fighter> fList = daoimpl.findFighters();
		
		for(Fighter fight : fList) {
			
			if(fight.getUserName() == name && fight.getPass() == pass) {
				return true;
			}
			
		}
		
		return false;
	}

}
