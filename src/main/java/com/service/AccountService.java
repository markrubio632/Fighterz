package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoImpl;

@Service
public class AccountService {

	// insert validation for anything account related

	@Autowired
	DaoImpl daoimpl;

	

}
