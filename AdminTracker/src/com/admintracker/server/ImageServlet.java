package com.admintracker.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.images.Image;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;

@SuppressWarnings("serial")
public class ImageServlet extends HttpServlet{

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
		          ImageObject origImageObject = new ImageObject(oname, origBlob, date,oemail, ofirstName, olastName);
		    	 
		          PersistenceManager pm = PMF.get().getPersistenceManager();
		    	 
		          try
		          {
		        	  
		        	//  Vector<ImageObject> entries = new Vector<ImageObject>();
		        	  
		        	  String query = "select from " + ImageObject.class.getName()
						+ " where name == '" + oname+"'" 
		        	  	+ " && email == '" + oemail+"'"
		        	  	+ " && firstName == '" + ofirstName+"'"
		        	  	+ " && lastName == '" + olastName+"'";
		        	  
		        	  
		        	  List<ImageObject> entities = (List<ImageObject>) pm
						.newQuery(query).execute();
		        	
		        	 		        	  
		        	  for (ImageObject entity : entities) {
		        		 /* System.out.println("name = "+entity.getName());
		        		  System.out.println("id = "+entity.getId());
		        		  System.out.println("content = "+entity.getContent());
		        		  System.out.println("date = "+entity.getDate());
		        		  System.out.println("email = "+entity.getEmail());*/
		        		  
		        		 pm.deletePersistent(entity);
		        		  
		        	  }
		        	  pm.makePersistent(origImageObject);
		        	  
		        	  /*System.out.println("id = "+String.valueOf(origImageObject.getId()));
		        	  
		        	  pw.println("<HTML><HEAD></HEAD><BODY>");
		        	  pw.println("<img src='" + "/form/ImageSource" + "?id="
								+ String.valueOf(origImageObject.getId()) + "'/>");
		        	  pw.println("</BODY></HTML>"); */
		        	  
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
