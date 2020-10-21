package com.team.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

/**
 * Servlet implementation class ImageUpload
 */

public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ImageUpload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (!ServletFileUpload.isMultipartContent(request)) {
			request.setAttribute("error-image", "Nothing to upload!");
			return;
		}
		FileItemFactory itemFactory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(itemFactory);
		List<FileItem> items = upload.parseRequest(new ServletRequestContext(request));
		for (FileItem item : items) {
			String contentType = item.getContentType();
			System.out.println("Type: " + contentType);
			if (!contentType.equals("image/jpeg") && !contentType.equals("image/png")) {
				request.setAttribute("error-type", "only png or jpeg format image files supported");
				continue;
			}
			String fileURL = "C:\\Users\\Admin\\eclipse-workspace\\WebTest\\WebContent\\images";
			File uploadDir = new File(fileURL);
			File file = File.createTempFile("img", ".png", uploadDir);
			try {
				item.write(file);
				url = file.getAbsolutePath();
				System.out.println("Address: " + url);
				request.setAttribute("success-upload", "Upload image successful!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
