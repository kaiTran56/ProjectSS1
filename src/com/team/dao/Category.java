package com.team.dao;

import java.util.List;

public interface Category<T> {
	List<T> getAll();

	T get(String name);

	void insert(T t);

	void delete(String name);

	void edit(T t);

	List<T> getCateByProduct(String name);

}
