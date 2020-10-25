package com.team.controller.admin;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team.model.Product;

/**
 * Servlet implementation class AddProductController
 */

public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/view/admin/addproduct.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = request.getParameter("product-name");
		int catalog_id = Integer.parseInt(request.getParameter("product-cate"));
		double price = Double.parseDouble(request.getParameter("product-price"));
		String status = request.getParameter("product-status");
		int discount = Integer.parseInt(request.getParameter("product-discount"));
		String description = request.getParameter("product-desc");
		LocalDateTime created = LocalDateTime.now();
		Product product = new Product(catalog_id, name, price, status, description, discount, created);
		session.setAttribute("productTemp", product);
		response.sendRedirect(request.getContextPath() + "/view/admin/imageupload.jsp");
	}

}
