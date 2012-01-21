package com.admintracker.client.university;

import java.util.ArrayList;
import java.util.Vector;

import com.admintracker.client.advertisement.AdvImageData;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginData;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.client.login.LoginServiceAsync;
import com.admintracker.client.student.StudentData;
import com.admintracker.server.AdvImageObject;
import com.admintracker.server.StudentDataEntity;
import com.admintracker.shared.ServiceInitialization;
import com.admintracker.shared.misc;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.i18n.client.HasDirection.Direction;

public class UniversityForm extends Composite {
	private Image logo = new Image();
	private HorizontalPanel topPanel = new HorizontalPanel();
	private VerticalPanel mainPanel = new VerticalPanel();
	DecoratedTabPanel tabPanel = new DecoratedTabPanel();
	misc mi = new misc();
	Button btnLogout;
	private FlexTable flexRegistararTable = new FlexTable();
	private UniversityForm univMainForm;
	//Vector<StudentData> sdata;
	Rform rf ;
	StudentData sdata;
	private final VerticalPanel verticalPanel = new VerticalPanel();
	private final Image rimage = new Image("images/hp.png");
	private final HTML html = new HTML("<hr width=100% size=3 color=blue>", true);
	private final HorizontalPanel horizontalPanel = new HorizontalPanel();
	ArrayList<ArrayList<Integer>> ret;
	Vector<AdvImageData> vec = null;
	//ArrayList<AdvImageData> vr = new ArrayList<AdvImageData>();
	
	public UniversityForm(final ServiceInitialization si, final LoginScreen lscr) {
		 
		setUnivMainForm(this);
		logo.setSize("244px", "62px");
		logo.setUrl("images/Untitled-1.gif");
		topPanel.setSize("1000px", "170px");
		topPanel.add(logo);
		
		topPanel.add(verticalPanel);
		verticalPanel.setSize("509px", "127px");
		
		verticalPanel.add(rimage);
		rimage.setSize("750px", "137px");
		
		verticalPanel.add(html);
		
		verticalPanel.add(horizontalPanel);
		horizontalPanel.setSize("748px", "31px");
		
		String name = "Welcome " + lscr.getLfirstName() +" "+lscr.getLlastName();
		Label lbl = new Label(name);
		lbl.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		horizontalPanel.add(lbl);
		lbl.setWidth("600px");
		lbl.setStyleName("lbl");
		btnLogout = new Button("Logout");
		btnLogout.setHeight("22px");
		horizontalPanel.add(btnLogout);
		btnLogout.setStyleName("logout");
		
				
		/*si.getAdverDataServiceAsync().getImgEntries(new AsyncCallback<Vector<AdvImageData>>(){

			@Override
			public void onFailure(Throwable caught) {
				 Window.alert("server error");
				
			}

			@Override
			public void onSuccess(Vector<AdvImageData> result) {
				 if(result != null){
					 vec = result;
										 
				 }
				
			}
			
			
		});*/
				
		
		si.getGuiDataServiceAsync().readList("data/regAdd.txt", new AsyncCallback<ArrayList<ArrayList<Integer>>>(){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("server error"); 
				
			}

			@Override
			public void onSuccess(ArrayList<ArrayList<Integer>> result) {
				 if(result != null){
					 final ArrayList<ArrayList<Integer>> olist = result;
					 
					 si.getAdverDataServiceAsync().getImgEntries(new AsyncCallback<Vector<AdvImageData>>(){

							@Override
							public void onFailure(Throwable caught) {
								 Window.alert("server error");
								
							}

							@Override
							public void onSuccess(Vector<AdvImageData> result) {
								 if(result != null){
									 Vector<AdvImageData> vec = result;
									 
									String mschoolCode = lscr.getLschool();
									String[] mscode = mschoolCode.split("-");
									int idx = Integer.parseInt(mscode[1])%1000;
									
									ArrayList<Integer> at = new ArrayList<Integer>();
									at.addAll(olist.get(idx-1));
									
									final ArrayList<String> ar = new ArrayList<String>();
									
									for(int i=0;i<at.size();i++){
										for(int j=0;j<vec.size();j++){
											//System.out.println("vv= "+vec.get(j).getSno());
											//System.out.println("val= "+String.valueOf(at.get(i)));
											
											if(Integer.parseInt(vec.get(j).getSno()) == at.get(i))
											{
												ar.add(vec.get(j).getId());
												break;
											}
										}
										
									}
									 
									Timer t = new Timer(){
										int i = 0;
										@Override
										public void run() {
											 
											rimage.setUrl(GWT.getModuleBaseURL()+"addimgsource?id="+ar.get(i));
											i++;
											if(i == ar.size())
												i = 0;
										
										}
										
									};
									t.scheduleRepeating(5000);
														 
								 }
								
							}
							
							
						}); 
			 
				 }
				
			}
			
		});
	
		//logout button handler
		btnLogout.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				LoginServiceAsync rst = si.getLoginServiceAsync();
				rst.logout(new AsyncCallback<LoginData>(){

					@Override
					public void onFailure(Throwable caught) {
						 
						
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
		
		VerticalPanel tab1Content = new VerticalPanel();
		tabPanel.setStyleName("gwt-Label2");
		
		tabPanel.setSize("100%", "500px");
		tabPanel.setAnimationEnabled(true);
		tabPanel.add(flexRegistararTable, "Application");
		tabPanel.selectTab(0);
	 		
		
		String schoolCode = lscr.getLschool();
		String[] scode = schoolCode.split("-");
		
				
		mainPanel.setHeight("223px");
		mainPanel.add(topPanel);
		mainPanel.add(tabPanel);
		
		initWidget(mainPanel); 
		
		
		schoolCode = lscr.getLschool();
		scode = schoolCode.split("-");
		
		  try {
			si.getRegistararDataServiceAsync().getAdminSchool(scode[1], new AsyncCallback<Vector<StudentData>>(){

				@Override
				public void onFailure(Throwable caught) {
					 Window.alert("error registarar server");
					
				}

				public void onSuccess(Vector<StudentData> result) {
					//int row = flexRegistararTable.getRowCount();
					int row = 0;
					
					for (StudentData ted : result) {
						row++;
						flexRegistararTable.setText(row, 0, ted.getDate());
						flexRegistararTable.setText(row, 1, ted.getAppliedSchoolName());
						flexRegistararTable.setText(row, 2, ted.getDepartment());
						 
						flexRegistararTable.setText(row, 3, ted.getMajor());
						flexRegistararTable.setText(row, 4, ted.getLemail());
						flexRegistararTable.setText(row, 5, ted.getUcode());
						
						Anchor achor = new Anchor("View");
						
						achor.addClickHandler(new ClickHandler(){

							@Override
							public void onClick(ClickEvent event) {
								 
								//Window.alert("view clicked8888");
								//tabPanel.add(sf1.getMainForm(),	"Edit Item");
								//tabPanel.selectTab(2);
								
								
								
								
								com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexRegistararTable.getCellForEvent(event);
								int rw = cell.getRowIndex();
								int cl = cell.getCellIndex();

								StudentData sdd = new StudentData();
								sdd.setDate(flexRegistararTable.getText(rw, 0));
								sdd.setDepartment(flexRegistararTable.getText(rw, 2));
								sdd.setMajor(flexRegistararTable.getText(rw, 3));
								sdd.setLemail(flexRegistararTable.getText(rw, 4));
								sdd.setUcode(flexRegistararTable.getText(rw, 5));
								
								try {
									si.getStudentDataServiceAsync().updateData(sdd,	new AsyncCallback<Vector<StudentData>>() {

										@Override
										public void onFailure(Throwable caught) {
											 
											
										}

										@Override
										public void onSuccess(Vector<StudentData> result) {
											
											if(result != null){
												
											//	Vector<StudentData> sdata = result;
												
												for (StudentData data : result) {
													sdata = data;
												}
												
												
												rf = new Rform(si, lscr,getUnivMainForm(),sdata);
												tabPanel.add(rf.getMainForm(), "View");
												tabPanel.selectTab(1);
												
												//Remove view from the panel and go to Application panel
												tabPanel.getTabBar().getTab(0).addClickHandler(new ClickHandler(){

													@Override
													public void onClick(ClickEvent event) {   
														 
														univMainForm.getTabPanel().remove(rf.getMainForm());
														univMainForm.getTabPanel().selectTab(0);
														
													}
													
												}); 
											
											}
										}
										
									});
								} catch (LoggedInException e) {
									 
									e.printStackTrace();
								}
								
								
								
							}
							
						});
						
						flexRegistararTable.setWidget(row, 6, achor); 
						
						
					
					}
					
				}
				 
			 });
		} catch (LoggedInException e) {
			 
			e.printStackTrace();
		}
	 
	 
		
		
		
		
		
		
		
		
		
		 
		
		
		
		 
		
		
		
		
	}


	public UniversityForm getUnivMainForm() {
		return univMainForm;
	}


	public void setUnivMainForm(UniversityForm univMainForm) {
		this.univMainForm = univMainForm;
	}


	public DecoratedTabPanel getTabPanel() {
		return tabPanel;
	}


	public void setTabPanel(DecoratedTabPanel tabPanel) {
		this.tabPanel = tabPanel;
	}


	public  StudentData  getSdata() {
		return sdata;
	}


	public void setSdata(StudentData  sdata) {
		this.sdata = sdata;
	}

}
