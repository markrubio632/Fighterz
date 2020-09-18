package com.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DaoImpl;
import com.fighters.Fighter;

public class InputValidation {

	@Autowired
	DaoImpl daoimpl;

	// valid for password formatting
	public static boolean validPassword(String password) {
		if (password.matches("(?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!*]).{8,30}")) {
			return true;
		} else
			return false;
	}

	// valid for phone number
	public static boolean validPhoneNum(String phoneNum) {
		// checks to see if there is a format of (XXX)XXX-XXXX
		if (phoneNum.matches("\\(\\d{3}\\)\\d{3}-\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	// valid for no numbers in names (in registration)

	// valid for if user exists
	public boolean userExists(String contactNum, String password) {

		List<Fighter> fighter = daoimpl.findFighters();

		for (Fighter fight : fighter) {

			if (fight.getContactNum().equals(contactNum) && fight.getPass().equals(password)) {
				return true;
			}

		}

		return false;

	}
}
