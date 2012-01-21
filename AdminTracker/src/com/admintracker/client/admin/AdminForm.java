package com.admintracker.client.admin;

import java.util.ArrayList;
import java.util.Vector;

import com.admintracker.client.advertisement.AdvImageData;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginData;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.client.login.LoginServiceAsync;
import com.admintracker.client.registration.RegistrationData;
import com.admintracker.client.student.StudentData;
import com.admintracker.shared.ServiceInitialization;
import com.admintracker.shared.misc;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.Grid;

public class AdminForm extends Composite {

	private String vl;
	private Image logo = new Image();
	private HorizontalPanel topPanel = new HorizontalPanel();
	HorizontalPanel nameLogout = new HorizontalPanel();
	private VerticalPanel mainPanel = new VerticalPanel();
	DecoratedTabPanel tabPanel = new DecoratedTabPanel();
	misc mi = new misc();
	Button btnLogout;
	private FlexTable flexAdminTable = new FlexTable();
	private FlexTable flexStudentTable = new FlexTable();
	private VerticalPanel vpDataTable = new VerticalPanel();
	
	private VerticalPanel vpAdTable = new VerticalPanel();
	
	private final VerticalPanel verticalPanel = new VerticalPanel();
	private final Label lblUp = new Label("");
	ArrayList<String> ret;
	private final HorizontalPanel horizontalPanel = new HorizontalPanel();
	private final HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
	private final Grid grid = new Grid(1, 4);
	private final Button btnAdvAdd = new Button("New button");
	private final Label label = new Label("");
	private final FormPanel formPanel = new FormPanel();
	private final FileUpload fileUpload = new FileUpload();
	private final FlexTable flexTable = new FlexTable();
	
	
	@SuppressWarnings("deprecation")
	public AdminForm(final ServiceInitialization si, final LoginScreen lscr) {
		 
		
		
		logo.setHeight("57px");
		logo.setUrl("images/Untitled-1.gif");
		
		topPanel.setSize("1000px", "57px");
		topPanel.add(logo);
		topPanel.add(nameLogout);
		topPanel.setCellHorizontalAlignment(nameLogout,
	 			HasHorizontalAlignment.ALIGN_RIGHT);
		nameLogout.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		
		VerticalPanel tab1Content = new VerticalPanel();
		tabPanel.setStyleName("gwt-Label1");
		
		tabPanel.setSize("100%", "500px");
		tabPanel.setAnimationEnabled(true);
		tabPanel.add(flexAdminTable, "Users");
		tabPanel.selectTab(0);
		
		/*tabPanel.getTabBar().getTab(0).addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				getRegEntries(si, lscr);
				
			}
			
		});*/
		
			
		//Add student table
		tabPanel.add(flexStudentTable, "Application");
		
		/*tabPanel.getTabBar().getTab(1).addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				 
				getAlluser(si, lscr);
			}

		});*/
		
		//Add user data information
		tabPanel.add(vpDataTable, "Information");
		
		//Add advertisement panel to add 
		tabPanel.add(vpAdTable, "Advertisement");
		
		vpAdTable.add(horizontalPanel_1);
		
		horizontalPanel_1.add(grid);
		grid.setWidth("437px");
		
		grid.setWidget(0, 0, formPanel);
		
		fileUpload.setName("uploadFormElement1");
		
		
		formPanel.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel.setMethod(FormPanel.METHOD_POST);
		
		formPanel.setWidget(fileUpload);
		fileUpload.setSize("100%", "100%");
			
		
		btnAdvAdd.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				///////////////////////////////////////////////////
				//Get sno
				try {
					si.getAdverDataServiceAsync().getSno(new AsyncCallback<String>(){
						 
						
						@Override
						public void onFailure(Throwable caught) {
							 Window.alert("Server error");
							
						}

						@Override
						public void onSuccess(String result) {
							 if(result != null){
								String va = result;
								 
								String fname = fileUpload.getFilename();
								String[] fn = fname.split("\\\\");
									
								System.out.println("oname ="+fname);
								formPanel.setAction(GWT.getModuleBaseURL() + "adver?"+"oname="+fn[2]+"&oemail="+lscr.getLemail()+"&ofirstName="+lscr.getLfirstName()+"&olastName="+lscr.getLlastName()+"&osno="+va);
									
								formPanel.submit();
								 
							 }
							
						}
					 
					});
				} catch (LoggedInException e1) {
					 
					e1.printStackTrace();
				}
			 
			}
		});
		btnAdvAdd.setText("ADD");
		
		formPanel.addFormHandler(new FormHandler(){

			@Override
			public void onSubmit(FormSubmitEvent event) {
				 
				
			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				// Window.alert(event.getResults());
		        String ret = event.getResults();
		        		        	        
		        String[] sret = ret.split(">");
		        
		        if(sret[1].startsWith("No-File")){
		        	Window.alert("Select File");
		        	return;
		        }
		        
		        
		        String[] fin = sret[1].split("\n");
		        String[] sfin = fin[0].split("=");
		        
		        if(Integer.parseInt(sfin[1]) > 0){
		        	
		        }
		        else{
		        	Window.alert("Error adding image to the server");
		        }
				
		      //update flexTable of the added image
				si.getAdverDataServiceAsync().getImgEntries(new AsyncCallback<Vector<AdvImageData>>(){

					@Override
					public void onFailure(Throwable caught) {
						 Window.alert("Error from server");
						
					}

					public void onSuccess(Vector<AdvImageData> result) {
						 
						if(result != null){
							int row = 4;
							flexTable.setText(row, 0, "DATE");
							flexTable.setText(row, 1, "");
							flexTable.setText(row, 2, "NAME");
							flexTable.setText(row, 3, "");
							flexTable.setText(row, 4, "EMAIL");
							flexTable.setText(row, 5, "");
							flexTable.setText(row, 6, "ID");
							flexTable.setText(row, 7, "");
							flexTable.setText(row, 8, "SNO");
							
							row = row+3;
							
							for (AdvImageData ted : result) {
								row++;
								flexTable.setText(row, 0, ted.getDate().toString());
								flexTable.setText(row, 2, ted.getName());
								flexTable.setText(row, 4,ted.getEmail());
								flexTable.setText(row, 6, ted.getId().toString());
								flexTable.setText(row, 8, ted.getSno());
								
								Button delButton = new Button("x");
								delButton.addClickHandler(new ClickHandler(){

									@Override
									public void onClick(ClickEvent event) {
										com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexTable
										.getCellForEvent(event);
										int rw = cell.getRowIndex();
										int cl = cell.getCellIndex();
										
										AdvImageData sdd = new AdvImageData();
										sdd.setId(flexTable.getText(rw, 6));
										sdd.setName(flexTable.getText(rw, 2));
										
										try {
											si.getAdverDataServiceAsync().deleteImgData(sdd,new AsyncCallback<String>(){

												@Override
												public void onFailure(
														Throwable caught) {
													 Window.alert("Error from server");
													
												}

												@Override
												public void onSuccess(String result) {
													 if(result != null){
														 if(result == "ok")
														 {}
													 }
													 else
														 Window.alert("Error deleting in server");
												}
												
											});
										} catch (LoggedInException e) {
											 
											e.printStackTrace();
										}
										flexTable.removeRow(rw);
									}
									
								});
																
								flexTable.setWidget(row, 10, delButton);
								
								Button viewButton = new Button("View");
								
								viewButton.addClickHandler(new ClickHandler(){

									@Override
									public void onClick(ClickEvent event) {
										com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexTable
										.getCellForEvent(event);
										int rw = cell.getRowIndex();
										int cl = cell.getCellIndex();
										
										Long id = Long.parseLong(flexTable.getText(rw, 6));
										Window.open(GWT.getModuleBaseURL()+"addimgsource?id="+id, "_blank", null);
									}
									
								});
								flexTable.setWidget(row, 12, viewButton);
								
							}
							
							
							
						}
					}
					
				});
		        
		        
		        
			}//onsubmitComplete
					
		});//addformHandler
		
		
		
		
		grid.setWidget(0, 2, btnAdvAdd);
		
		grid.setWidget(0, 3, label);
		label.setWidth("100px");
		
		vpAdTable.add(flexTable);
		
		
		
		
		lblUp.setStyleName("gwt-Label-up");
		lblUp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblUp.setText("Administrator Dash Board");
		nameLogout.add(verticalPanel);
		verticalPanel.add(lblUp);
		lblUp.setWidth("425px");
		
		
		String name = "Welcome " + lscr.getLfirstName() +" "+lscr.getLlastName();
		Label lbl = new Label(name);
		lbl.setWidth("249px");
		lbl.setStyleName("lbl");
		nameLogout.add(lbl);
		
				
		mi.addHGap(nameLogout, "5px");
		btnLogout = new Button("Logout");
		btnLogout.setStyleName("logout");
		nameLogout.add(btnLogout);
		
		btnLogout.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				LoginServiceAsync rst = si.getLoginServiceAsync();
				rst.logout(new AsyncCallback<LoginData>(){

					@Override
					public void onFailure(Throwable caught) {
						 Window.alert("error admin server");
						
					}

					@Override
					public void onSuccess(LoginData result) {
						LoginScreen ls = new LoginScreen(si);
						RootPanel rootPanel = RootPanel.get("login");
						rootPanel.clear();
						rootPanel.add(ls);
						
					}
					
				});
			}
			
		});
		
		mainPanel.setHeight("223px");
		mainPanel.add(topPanel);
		mainPanel.add(tabPanel);
		
		initWidget(mainPanel); 
		
		getRegEntries(si, lscr);
		getAlluser(si, lscr);
		getUserInformation(si, lscr);
		getImageInformation(si, lscr);
	}
	
	void getUserInformation(final ServiceInitialization si, final LoginScreen lscr){
		  // final int[] arr = new int[13];
		//final int[] arr;
		//  final int total;
		
		try {
			si.getStudentDataServiceAsync().getAllEntries(
					new AsyncCallback<Vector<StudentData>>() {
						 
						int total = 0;
						int[] arr = new int[19];
						
						@Override
						public void onFailure(Throwable caught) {
							Window.alert("Error from server***");
							
						}

						@Override
						public void onSuccess(Vector<StudentData> result) {
							 
							//int total = 0;
							if(result != null){
							for (StudentData ted : result) {
								total++;
								int x = Integer.parseInt(ted.getUcode());
								arr[(x%1000)]++;
								
								//System.out.println("x="+x%1000);
								
								
							}
						}
							
							
							//ArrayList<String> dd=  getSchoolList(si,);
							
							si.getGuiDataServiceAsync().read("data/school.txt", new AsyncCallback<ArrayList<String>>(){
								ArrayList<String> val = null;
								
								@Override
								public void onFailure(Throwable caught) {
									 
									Window.alert("Serve error");
								}

								@Override
								public void onSuccess(ArrayList<String> result) {
									 if(result != null){
										 val = result;
										 String dis = "<hr/><table border="+"1>" ;
										 
										 for(int i=1;i<val.size();i++){
											 String[] mm = val.get(i).split("-");
																				 
											dis += "<tr>" +	
											        "<td>"+mm[0]+":"+"</td>" +
											        "<td>"+ arr[i]+"</td>" +
											        "</tr>" ;
											 
										 }
										 dis += "</table>";
										 
										 HTML ht = new HTML(
													"<hr/><br/>  Total Application : "+total+"<br/>"+dis
													
													
													);
										 vpDataTable.add(ht);
										 
									 }
									 
									
								}
								
								 
							});
							
							
							
							
							
							 
							
							 
							
							
							
							
							 
							
							
					}
					
						
						
				
			});
		} catch (LoggedInException e) {
			 
			e.printStackTrace();
		}
		
		//for(int i=0;i<)
		
		
		 
	}
	
	
	
	
	
	void getAlluser(final ServiceInitialization si, final LoginScreen lscr){
		
		try {
			si.getStudentDataServiceAsync().getAllEntries(
					new AsyncCallback<Vector<StudentData>>() {

						@Override
						public void onFailure(Throwable caught) {
							Window.alert("Error from server***");
							
						}

						@Override
						public void onSuccess(Vector<StudentData> result) {
							 
							int row = 0;
							
							flexStudentTable.setText(row, 0, "DATE");
							flexStudentTable.setText(row, 1, "SCHOOL NAME");
							flexStudentTable.setText(row, 2, "DEPARTMENT");
							flexStudentTable.setText(row, 3, "MAJOR");
							flexStudentTable.setText(row, 4, "CODE");
							
							
							row = 3;
							if(result != null){
							for (StudentData ted : result) {
								row++;
								flexStudentTable.setText(row, 0, ted.getDate());
								flexStudentTable.setText(row, 1, ted.getAppliedSchoolName());
								flexStudentTable.setText(row, 2, ted.getDepartment());
								flexStudentTable.setText(row, 3, ted.getMajor());
								flexStudentTable.setText(row, 4, ted.getUcode());
								
							}
						}
					}
				
			});
		} catch (LoggedInException e) {
			 
			e.printStackTrace();
		}

	}
	
	void getRegEntries(final ServiceInitialization si, final LoginScreen lscr){
		 
		
		try {
			si.getAdminDataServiceAsync().getAllUser(new AsyncCallback<Vector<RegistrationData>>(){

				@Override
				public void onFailure(Throwable caught) {
					 Window.alert("error admin server");
					
				}

				@Override
				public void onSuccess(Vector<RegistrationData> result) {
					//int row = flexAdminTable.getRowCount();
					int row = 0;
					
					
				 
					flexAdminTable.setText(row, 0, "FIRST NAME");
					flexAdminTable.setText(row, 1, "LAST NAME");
					flexAdminTable.setText(row, 2, "EMAIL");
					 
					flexAdminTable.setText(row, 3, "ROLE");
					flexAdminTable.setText(row, 4, "USER NAME");
					flexAdminTable.setText(row, 5, "PASSWORD");
					
					row = 3;
					for (RegistrationData ted : result) {
						row++;
						
					 
						flexAdminTable.setText(row, 0, ted.getFirstName());
						flexAdminTable.setText(row, 1, ted.getLastName());
						flexAdminTable.setText(row, 2, ted.getEmail());
						 
						flexAdminTable.setText(row, 3, ted.getRole());
						flexAdminTable.setText(row, 4, ted.getUsername());
						flexAdminTable.setText(row, 5, ted.getPassoword());
						
						Button delButton = new Button("x");
						delButton.addClickHandler(new ClickHandler(){

							@Override
							public void onClick(ClickEvent event) {
								com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexAdminTable.getCellForEvent(event);
								final int rw = cell.getRowIndex();
								int cl = cell.getCellIndex();
								
								RegistrationData rda = new RegistrationData();
								rda.setFirstName(flexAdminTable.getText(rw, 0));
								rda.setLastName(flexAdminTable.getText(rw, 1));
								rda.setEmail(flexAdminTable.getText(rw, 2));
								rda.setUsername(flexAdminTable.getText(rw, 4));
								rda.setPassoword(flexAdminTable.getText(rw, 5));
								rda.setRole(flexAdminTable.getText(rw, 3));
								
								try {
									si.getRegistrationServiceAsyn().registerDelete(rda, new AsyncCallback<String>(){

										@Override
										public void onFailure(Throwable caught) {
											 
											
										}

										@Override
										public void onSuccess(String result) {
											 if(result != null){
												 if(result.equals("ok")){
													// Window.alert("User info deleted in the database");
													 getRegEntries(si, lscr);
													 flexAdminTable.removeRow(rw);
												 }
												 else
													 Window.alert("Error in delting user information");
											 }
											
										}
										
									});
								} catch (LoggedInException e) {
									 
									e.printStackTrace();
								}
								
							}
							
						});
						
						flexAdminTable.setWidget(row, 6, delButton);
						
					}
					
				}
				
			});
		} catch (LoggedInException e) {
			 
			e.printStackTrace();
		}
	}
//////////////////////////////////////////
	void getImageInformation(final ServiceInitialization si, final LoginScreen lscr){
		si.getAdverDataServiceAsync().getImgEntries(new AsyncCallback<Vector<AdvImageData>>(){

			@Override
			public void onFailure(Throwable caught) {
				 Window.alert("Error from server");
				
			}

			public void onSuccess(Vector<AdvImageData> result) {
				 
				if(result != null){
					int row = 4;
					flexTable.setText(row, 0, "DATE");
					flexTable.setText(row, 1, "");
					flexTable.setText(row, 2, "NAME");
					flexTable.setText(row, 3, "");
					flexTable.setText(row, 4, "EMAIL");
					flexTable.setText(row, 5, "");
					flexTable.setText(row, 6, "ID");
					flexTable.setText(row, 7, "");
					flexTable.setText(row, 8, "SNO");
					
					
					row = row+3;
					
					for (AdvImageData ted : result) {
						row++;
						flexTable.setText(row, 0, ted.getDate().toString());
						flexTable.setText(row, 2, ted.getName());
						flexTable.setText(row, 4,ted.getEmail());
						flexTable.setText(row, 6, ted.getId().toString());
						flexTable.setText(row, 8, ted.getSno());
						
						Button delButton = new Button("x");
						delButton.addClickHandler(new ClickHandler(){

							@Override
							public void onClick(ClickEvent event) {
								com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexTable
								.getCellForEvent(event);
								int rw = cell.getRowIndex();
								int cl = cell.getCellIndex();
								
								AdvImageData sdd = new AdvImageData();
								sdd.setId(flexTable.getText(rw, 6));
								sdd.setName(flexTable.getText(rw, 2));
								
								try {
									si.getAdverDataServiceAsync().deleteImgData(sdd,new AsyncCallback<String>(){

										@Override
										public void onFailure(
												Throwable caught) {
											 Window.alert("Error from server");
											
										}

										@Override
										public void onSuccess(String result) {
											 if(result != null){
												 if(result == "ok")
												 {}
											 }
											 else
												 Window.alert("Error deleting in server");
										}
										
									});
								} catch (LoggedInException e) {
									 
									e.printStackTrace();
								}
								flexTable.removeRow(rw);
							}
							
						});
						
						flexTable.setWidget(row, 10, delButton);
						
						Button viewButton = new Button("View");
						
						viewButton.addClickHandler(new ClickHandler(){

							@Override
							public void onClick(ClickEvent event) {
								com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexTable
								.getCellForEvent(event);
								int rw = cell.getRowIndex();
								int cl = cell.getCellIndex();
								
								Long id = Long.parseLong(flexTable.getText(rw, 6));
								Window.open(GWT.getModuleBaseURL()+"addimgsource?id="+id, "_blank", null);
							}
							
						});
						flexTable.setWidget(row, 12, viewButton);
						
						
					}
					
					
					
				}
			}
			
		});
        
		
		
		
		
		
	}
	
	
	
////////////////////////////////////////////////////////////		 
	}



