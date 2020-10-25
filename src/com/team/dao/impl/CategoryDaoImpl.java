package com.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team.JDBC.JDBCConnection;
import com.team.dao.CategoryDao;
import com.team.model.Category;

public class CategoryDaoImpl extends JDBCConnection implements CategoryDao<Category> {
	private Connection connect;

	private PreparedStatement statement;
	private ResultSet result;

	@Override
	public List<Category> getAll() {
		List<Category> listCategory = new ArrayList<Category>();
		connect = super.getConnectionJDBC();
		String sql 
		return null;
	}

	@Override
	public Category get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Category t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Category t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> getCateByProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
