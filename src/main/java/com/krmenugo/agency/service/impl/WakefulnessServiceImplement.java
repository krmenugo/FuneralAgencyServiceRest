package com.krmenugo.agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krmenugo.agency.model.Wakefulness;
import com.krmenugo.agency.repository.WakefulnessRepositoryInterface;
import com.krmenugo.agency.service.BaseService;

@Service
public class WakefulnessServiceImplement implements BaseService<Wakefulness> {
	
	//CRUD CREATE | UPDATE | DELETE | SEARCH | LIST
	
	@Autowired
	private WakefulnessRepositoryInterface repository;
	
	@Override
	public Wakefulness findById(Integer id) {
		return repository.findById(id).orElseThrow(null);
	}

	@Override
	public Wakefulness create(Wakefulness model) {
		return repository.save(model);
	}

	@Override
	public Wakefulness update(Wakefulness model) {
		return repository.save(model);
	}

	@Override
	public void delete(Integer id) {
		Wakefulness wakefulness = repository.findById(id).orElse(null);
		repository.delete(wakefulness);
	}

}
