package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.CRUDRepo;
import com.fighters.Fighter;

public class DaoImpl {
	
	@Autowired
	CRUDRepo repo;

	public void addFighter(Fighter fighter) {

		repo.save(fighter);

	}

	public List<Fighter> findFighters() {
		List<Fighter> fList = (List<Fighter>) repo.findAll();
		return fList;
	}

	public List<Fighter> findById(int id) {
		//this should call the method, store in fight1, and if its present(not null)
		//return everything, if not present return null
		Optional<Fighter> fight1 = repo.findById(id);
		return fight1.isPresent() ? (List) fight1.get() : null;
	}

}
