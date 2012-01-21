package com.admintracker.server;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdvImageSource extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException {
resp.setContentType("image/jpeg");
PersistenceManager pm = PMF.get().getPersistenceManager();
resp.getOutputStream().write(
		pm.getObjectById(AdvImageObject.class,
				Long.valueOf(req.getParameter("id").toString()))
				.getContent().getBytes());
resp.getOutputStream().flush();
resp.getOutputStream().close();


}
}
