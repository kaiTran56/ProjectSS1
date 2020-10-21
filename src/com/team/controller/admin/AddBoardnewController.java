package com.team.controller.admin;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.dao.impl.BoardnewDaoImpl;
import com.team.model.Boardnew;
import com.team.model.Image;

public class AddBoardnewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddBoardnewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/view/admin/addboardnew.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("new-title");
		String content = request.getParameter("new-content");
		
		String image_link = new Image().getAddress();
		String author = request.getParameter("new-author");
		LocalDateTime created = LocalDateTime.now();
		System.out.println("Check: "+title+content+image_link+author);
		Boardnew boardnew = new Boardnew(title, content, image_link, author, created);
		new BoardnewDaoImpl().insert(boardnew);
	}

	protected void setURL(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
