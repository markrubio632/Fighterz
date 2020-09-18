package com.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DaoImpl;

@Service
public class LoginService {
	
	@Autowired
	DaoImpl daoimpl;
	
	

}
