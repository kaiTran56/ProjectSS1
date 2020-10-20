package com.team.dao;

import java.util.List;

public interface TransactionsDao<T> {
	List<T> getAll();

	void insert(T t);

	void edit(T t);

	void delete(String name);

}
