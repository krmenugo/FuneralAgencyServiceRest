package com.krmenugo.agency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krmenugo.agency.model.TypeAssistance;
import com.krmenugo.agency.repository.TypeAssistanceRepositoryInterface;
import com.krmenugo.agency.service.BaseService;

@Service
public class TypeAssistanceServiceImplement implements BaseService<TypeAssistance> {
	
	//CRUD CREATE | UPDATE | DELETE | SEARCH | LIST
	
	@Autowired
	private TypeAssistanceRepositoryInterface repository;

	@Override
	public TypeAssistance findById(Integer id) {
		return repository.findById(id).orElseThrow(null);
	}

	@Override
	public TypeAssistance create(TypeAssistance model) {
		return repository.save(model);
	}

	@Override
	public TypeAssistance update(TypeAssistance model) {
		return repository.save(model);
	}
	
	@Override
	public void delete(Integer id) {
		TypeAssistance typeAssistance = repository.findById(id).orElse(null);
		repository.delete(typeAssistance);		
	}
	
}
