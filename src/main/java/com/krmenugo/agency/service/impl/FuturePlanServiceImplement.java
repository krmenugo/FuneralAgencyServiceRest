package com.krmenugo.agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krmenugo.agency.model.FuturePlan;
import com.krmenugo.agency.repository.FuturePlanRepositoryInterface;
import com.krmenugo.agency.service.BaseService;

@Service
public class FuturePlanServiceImplement implements BaseService<FuturePlan> {

	//CRUD CREATE | UPDATE | DELETE | SEARCH | LIST
	
	@Autowired
	private FuturePlanRepositoryInterface repository;
	
	@Override
	public FuturePlan findById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public FuturePlan create(FuturePlan model) {
		return repository.save(model);
	}

	@Override
	public FuturePlan update(FuturePlan model) {
		return repository.save(model);
	}

	@Override
	public void delete(Integer id) {
		FuturePlan futurePlan = repository.findById(id).orElseThrow(null);
		repository.delete(futurePlan);
	}
	
}
