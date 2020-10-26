package com.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
			while (result.next()) {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listProduct;
	}

	@Override
	public Product get(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Product t) {
		connect = super.getConnectionJDBC();
		String sql = "insert into product (product_id, catalog_id, name, price, status, description, discount, image_link, created) value(?,?,?,?,?,?,?,?,?);";
		try {
			preparedStatement = connect.prepareStatement(sql);
			preparedStatement.setInt(1, t.getProduct_id());
			preparedStatement.setInt(2, t.getCatalog_id());
			preparedStatement.setString(3, t.getName());
			preparedStatement.setDouble(4, t.getPrice());
			preparedStatement.setString(5, t.getStatus());
			preparedStatement.setString(6, t.getDescription());
			preparedStatement.setInt(7, t.getDiscount());
			preparedStatement.setString(8, t.getImage_link());
			preparedStatement.setTimestamp(9, Timestamp.valueOf(t.getCreated()));
			preparedStatement.executeUpdate();
			System.out.println("insert product successfull");
			preparedStatement.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
