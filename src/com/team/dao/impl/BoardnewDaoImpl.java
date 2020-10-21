package com.team.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

import com.team.JDBC.JDBCConnection;
import com.team.dao.BoardnewDao;
import com.team.model.Boardnew;

public class BoardnewDaoImpl extends JDBCConnection implements BoardnewDao<Boardnew> {
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
	public Boardnew get(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boardnew get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Boardnew t) {
		connect = super.getConnectionJDBC();
		String sql = "insert into boardnew (title, content, image_link, author, created) value (?,?,?,?,?);";
		try {
			preparedStatement = connect.prepareStatement(sql);
			preparedStatement.setString(1, t.getTitle());
			preparedStatement.setString(2, t.getContent());
			preparedStatement.setString(3, t.getImage_link());
			preparedStatement.setString(4, t.getAuthor());
			preparedStatement.setTimestamp(5, Timestamp.valueOf(t.getCreated()));
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Boardnew t) {
		// TODO Auto-generated method stub

	}

}
