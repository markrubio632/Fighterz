package com.profileService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.CRUDRepo;
import com.fighters.Fighter;

@Service
public class profileService {

	// works hand in hand with the repo

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
		Optional<Fighter> fight1 = repo.findById(id);
		return fight1.isPresent() ? (List) fight1.get() : null;
	}

}
