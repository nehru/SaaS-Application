package com.admintracker.server;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageSource extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("image/jpeg");
		
		/*resp.setContentType("image/gif");
		resp.setContentType("application/msword");
		resp.setContentType("application/pdf");
		resp.setContentType("application/doc");
		resp.setContentType("text/plain");
		resp.setContentType("application/txt");*/
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		resp.getOutputStream().write(
				pm.getObjectById(ImageObject.class,
						Long.valueOf(req.getParameter("id").toString()))
						.getContent().getBytes());
		resp.getOutputStream().flush();
		resp.getOutputStream().close();
		
		
	}
}
