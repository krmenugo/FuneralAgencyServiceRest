package com.krmenugo.agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krmenugo.agency.model.Assistance;
import com.krmenugo.agency.repository.AssistanceRepositoryInterface;
import com.krmenugo.agency.service.BaseService;

@Service
public class AssistanceServiceImplement implements BaseService<Assistance> {

	@Autowired
	private AssistanceRepositoryInterface repository;

	@Override
	public Assistance findById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Assistance create(Assistance model) {
		return repository.save(model);
	}

	@Override
	public Assistance update(Assistance model) {
		return repository.save(model);
	}

	@Override
	public void delete(Integer id) {
		Assistance assistance = repository.findById(id).orElseThrow(null);
		repository.delete(assistance);
	}

}
