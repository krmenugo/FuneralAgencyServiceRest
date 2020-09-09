package com.krmenugo.agency.service;

public interface BaseService<T> {
	
	T findById (Integer id);
	T create (T model);
	T update (T model);
	void delete (Integer id);

}
