package com.admintracker.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import com.admintracker.client.guidata.GuiDataService;
import com.admintracker.client.login.LoginService;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GuiDataServiceImpl extends RemoteServiceServlet implements
		GuiDataService {

	public String getCode(String name, String path) {
		String strLine;
		
		ArrayList<String> arr = new ArrayList<String>();

		try {
			FileInputStream fstream = new FileInputStream(path);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while ((strLine = br.readLine()) != null) {

				arr.add(strLine);
				
			}

			in.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

		}

		Collections.sort(arr);
		
		for(int i=0; i<arr.size();i++){
			String[] cd = arr.get(i).split("-");
			if (name.equals(cd[0])) {
				return  cd[1];
			}
			
		}
				
		return null;

	}
	
	
	public int getDepartmentIndex(String name, String path) {
		String strLine;
		int idx = 0;
		ArrayList<String> arr = new ArrayList<String>();

		if(name == null)
			return -1;
		
		try {
			FileInputStream fstream = new FileInputStream(path);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while ((strLine = br.readLine()) != null) {

				arr.add(strLine);
				
			}

			in.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

		}

		Collections.sort(arr);
		
		for(int i=0; i<arr.size();i++){
		 
			if (name.equals(arr.get(i))) {
				return idx;
			}
			idx++;
		}
				
		return -1;

		
		
	}
	
	
	
	
	
	
	public int getIndex(String name, String path) {
		String strLine;
		int idx = 0;
		ArrayList<String> arr = new ArrayList<String>();

		try {
			FileInputStream fstream = new FileInputStream(path);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while ((strLine = br.readLine()) != null) {

				arr.add(strLine);
				
			}

			in.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

		}

		Collections.sort(arr);
		
		for(int i=0; i<arr.size();i++){
			String[] cd = arr.get(i).split("-");
			if (name.equals(cd[1])) {
				return idx;
			}
			idx++;
		}
				
		return -1;

	}

	@Override
	public ArrayList<String> read(String path) {
		String strLine;
		ArrayList<String> names = new ArrayList();

		try {
			FileInputStream fstream = new FileInputStream(path);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while ((strLine = br.readLine()) != null) {

				// System.out.println(strLine);
				names.add(strLine);
			}

			in.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

		}
		return names;
	}

	
	 
	public ArrayList<ArrayList<Integer>> readList(String path) {
		String strLine;
		
		ArrayList<ArrayList<Integer>> ua = new ArrayList<ArrayList<Integer>>();
		
		
		//add minimum capacity to 20 list
		ua.ensureCapacity(20);
				
		int j = 0;
		try {
			FileInputStream fstream = new FileInputStream(path);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			 
			
			
			while ((strLine = br.readLine()) != null) {
				ArrayList<Integer> ia = new ArrayList<Integer>();
				ia.ensureCapacity(40);

				String[] ix = strLine.split("-");
				int index = Integer.parseInt(ix[0])%1000;
				
				String[] val = ix[1].split(",");
				
				
				
				
				for(int i=0;i<val.length;i++){
					ia.add(Integer.parseInt(val[i]));
				}
				
				 
				ua.add(ia);
				//ua.add(j, ia);
				//j++;
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return ua;
	}
	
	@Override
	public ArrayList<String> readSort(String path) {
		String strLine;
		ArrayList<String> names = new ArrayList();

		try {
			FileInputStream fstream = new FileInputStream(path);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while ((strLine = br.readLine()) != null) {

				names.add(strLine);
			}

			in.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

		}
		
		//Collections.sort(names);
		
		
		return names;
	}

	
	
	
	
}
