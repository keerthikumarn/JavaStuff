package com.employee.repositoryservice;

import java.io.Serializable;
import java.util.List;

public interface RepositoryService<T extends Object> {
	
	T find(Serializable id);

	List<T> findAll();

	long countAll();

	T save(T object);

	void deleteAll();

	void delete(Serializable id);
}
