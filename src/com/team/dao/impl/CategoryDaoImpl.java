package com.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		String sql = "select * from catalog ;";
		try {
			statement = connect.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				int catalog_id = result.getInt("catalog_id");
				String name = result.getString("name");
				listCategory.add(new Category(catalog_id, name));

			}
			statement.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listCategory;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Category t) {
		connect = super.getConnectionJDBC();
		String sql = "insert into catalog (catalog_id, name) value (?,?);";
		try {
			statement = connect.prepareStatement(sql);
			statement.setInt(1, t.getCatalog_id());
			statement.setString(2, t.getName());
			statement.executeUpdate();
			System.out.println("Insert Successfully!");
			statement.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		connect = super.getConnectionJDBC();
		String sql = "delete from catalog where catalog_id = ?;";
		try {
			statement = connect.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();
			System.out.println("Delete catalog successfully!");
			statement.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
