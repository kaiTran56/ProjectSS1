package com.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.team.JDBC.JDBCConnection;
import com.team.dao.ProductDao;
import com.team.model.Product;

public class ProductDaoImpl extends JDBCConnection implements ProductDao<Product> {
	private Connection connect;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet result;

	@Override
	public List<Product> getAll() {
		connect = super.getConnectionJDBC();
		List<Product> listProduct = new ArrayList<Product>();
		String sql = "select product_id, name, price, status, description, discount, image_link, created from product;";
		try {
			statement = connect.createStatement();
			result = statement.executeQuery(sql);
			while(result.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Product get(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Product t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Product t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> searchByName(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
