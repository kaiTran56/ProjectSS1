package com.team.controller.admin;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.dao.impl.BoardnewDaoImpl;
import com.team.model.Boardnew;

/**
 * Servlet implementation class EditBoardnewController
 */

public class EditBoardnewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditBoardnewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int inTemp = Integer.parseInt(request.getParameter("boardnew-id"));
		Boardnew boardnewTemp = new BoardnewDaoImpl().get(inTemp);
		request.setAttribute("boardnew", boardnewTemp);
		request.getRequestDispatcher("/view/admin/editboardnew.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("new-title");
		String content = request.getParameter("new-content");
		String author = request.getParameter("new-author");
		String image_link = request.getParameter("new-image_link");
		LocalDateTime created = LocalDateTime.now();
		Boardnew boardnew = new Boardnew(title, content, image_link, author, created)
	}

}
