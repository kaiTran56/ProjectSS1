package com.team.dao;

import java.util.List;

import com.team.model.Ordered;

public interface OrderedDao<T> {
	List<T> getAll();

	Ordered get(int id);

	void insert(T t);

	void edit(T t);

	void delete(String id);
}
