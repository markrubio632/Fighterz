package com.crud;

import org.springframework.data.repository.CrudRepository;

import com.fighters.Fighter;

public interface CRUDRepo extends CrudRepository<Fighter, Integer>{

}
