package com.team.dao;

import java.util.List;

public interface CategoryDao<T> {
	List<T> getAll();

	T get(String name);

	void insert(T t);

	void delete(int id);

	void edit(T t);

	List<T> getCateByProduct(String name);

}
