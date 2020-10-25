package com.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.team.JDBC.JDBCConnection;
import com.team.dao.CategoryDao;

public class CategoryDaoImpl extends JDBCConnection implements CategoryDao {
	private Connection connect;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet result;

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Object t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List getCateByProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
