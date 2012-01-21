package com.admintracker.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.google.appengine.api.images.Image;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;

public class AdvImageServlet extends HttpServlet{
	private static final Logger log =
	      Logger.getLogger(FileUpload.class.getName());
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
  throws ServletException, IOException {
		
		ServletFileUpload upload = new ServletFileUpload();
		upload.setSizeMax(50000000);
		PrintWriter pw = null;
		System.out.println("file ="+req);
		
		String oname = req.getParameter("oname");
		String oemail = req.getParameter("oemail");
		String ofirstName = req.getParameter("ofirstName");
		String olastName = req.getParameter("olastName");
		String osno = req.getParameter("osno");
		
		 try 
		 {
			 res.reset();
			 pw = res.getWriter();
			 res.setContentType("text/plain");
		     FileItemIterator iterator = upload.getItemIterator(req);
		
		     while (iterator.hasNext()) {
		    	 FileItemStream item = iterator.next();
		         InputStream in = item.openStream();
		         BufferedInputStream bis = new BufferedInputStream(in);
		         byte[] bisArray = IOUtils.toByteArray(bis);
		         
		         long tot = bisArray.length;
		         
		         if(tot == 0){
		        	 pw.println("No-File");
		        	 return;
		         }
		         
		         
		           
		         Date date = new Date();
		         
		         ImagesService imagesService = ImagesServiceFactory.getImagesService();
		          Image origImage = ImagesServiceFactory.makeImage(bisArray);
		          com.google.appengine.api.datastore.Blob origBlob = new com.google.appengine.api.datastore.Blob(
							origImage.getImageData());
		          AdvImageObject origImageObject = new AdvImageObject(oname, origBlob, date,oemail, ofirstName, olastName,osno);
		    	 
		          PersistenceManager pm = PMF.get().getPersistenceManager();
		    	 
		          try
		          {
		        	  
		        	  /*String query = "select from " + AdvImageObject.class.getName()
						+ " where name == '" + oname+"'" 
		        	  	+ " && email == '" + oemail+"'"
		        	  	+ " && firstName == '" + ofirstName+"'"
		        	  	+ " && lastName == '" + olastName+"'";
		        	  
		        	  
		        	  List<AdvImageObject> entities = (List<AdvImageObject>) pm
						.newQuery(query).execute();
		        	
		        	 		        	  
		        	  for (AdvImageObject entity : entities) {
		        		
		        		  
		        		 pm.deletePersistent(entity);
		        		  
		        	  }*/
		        	  
		        	  
		        	  pm.makePersistent(origImageObject);
		        	  
		        	 
		        	  
		        	  pw.println("value="+String.valueOf(origImageObject.getId()));
		          }
		          catch(Exception ex){
	        	  
		          }
		          
		          
		    	 
		     }
			 
			 
			 
			 
			 
		 }
		 catch (Exception ex) {
			      throw new ServletException(ex);
		 }
		 
		 
		 
	}
}
