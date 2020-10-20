package com.team.dao;

import java.util.List;

public interface ProductDao<T> {
	List<T> getAll();

	T get(String keyword);

	void insert(T t);

	void edit(T t);

	void delete(String name);

	List<T> searchByName(String keyword);
}
