package com.admintracker.client.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import com.admintracker.client.Image.ImageData;
import com.admintracker.client.advertisement.AdvImageData;
import com.admintracker.client.exception.LoggedInException;
import com.admintracker.client.login.LoginData;
import com.admintracker.client.login.LoginScreen;
import com.admintracker.client.login.LoginServiceAsync;
import com.admintracker.client.registration.RegistrationData;
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
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HTML;

public class StudentForm extends Composite {
	String pnx;
	ArrayList<String> de;

	private String tfirstName;
	private String tlastName;
	private Image logo = new Image();

	private HorizontalPanel topPanel = new HorizontalPanel();

	private VerticalPanel mainPanel = new VerticalPanel();
	HorizontalPanel nameLogout = new HorizontalPanel();
	Button btnLogout;
	misc mi = new misc();
	DecoratedTabPanel tabPanel = new DecoratedTabPanel();
	private ArrayList<String> CourseList;
	private FlexTable flexSubmittedList = new FlexTable();
	private FlexTable flexStatusList = new FlexTable();

	private final VerticalPanel verticalPanel = new VerticalPanel();
	private final Label lblUp = new Label("");
	private final VerticalPanel vpFileUpload = new VerticalPanel();
	private String[] gid;

	private LoginScreen ls;
	private ListBox cbUnivSchool;
	Sform sf1;
	StudentForm smain;
	private ServiceInitialization sii;
	private LoginScreen lscrr;
	private boolean editClicked;
	private StudentData oldData;
	private boolean editApplicationFlag;
	Sform sf;
	private final Label label = new Label("");
	private final Grid grid = new Grid(15, 9);
	private final Label lblSemester = new Label("Semester 1");
	private final FormPanel formPanel = new FormPanel();
	private final FileUpload fileUpload = new FileUpload();
	private final Button btnAdd = new Button("New button");
	private final Button btnView = new Button("New button");
	private final Label label_1 = new Label("");
	private final Label lblSemester_1 = new Label("Semester 2");
	private final Label label_2 = new Label(" ");
	private final Label lblSemester_2 = new Label("Semester 3");
	private final Label label_4 = new Label(" ");
	private final Label lblSemester_3 = new Label("Semester 4");
	private final Label label_6 = new Label(" ");
	private final Label lblSemester_4 = new Label("Semester 5");
	private final Label label_8 = new Label(" ");
	private final Label lblSemester_5 = new Label("Semester 6");
	private final Label label_10 = new Label(" ");
	private final Label lblSemester_6 = new Label("Semester 7");
	private final Label label_5 = new Label(" ");
	private final Label lblSemester_7 = new Label("Semester 8");
	private final Button btnAdd2 = new Button("New button");
	private final Button btnView2 = new Button("New button");
	private final Button btnAdd3 = new Button("New button");
	private final Button btnAdd4 = new Button("New button");
	private final Button btnAdd5 = new Button("New button");
	private final Button btnAdd6 = new Button("New button");
	private final Button btnAdd7 = new Button("New button");
	private final Button btnAdd8 = new Button("New button");
	private final Button btnView3 = new Button("New button");
	private final Button btnView4 = new Button("New button");
	private final Button btnView5 = new Button("New button");
	private final Button btnView6 = new Button("New button");
	private final Button btnView7 = new Button("New button");
	private final Button btnView8 = new Button("New button");
	private final FormPanel formPanel_1 = new FormPanel();
	private final FormPanel formPanel_2 = new FormPanel();
	private final FormPanel formPanel_3 = new FormPanel();
	private final FormPanel formPanel_4 = new FormPanel();
	private final FormPanel formPanel_5 = new FormPanel();
	private final FormPanel formPanel_6 = new FormPanel();
	private final FormPanel formPanel_7 = new FormPanel();
	private final FileUpload fileUpload_1 = new FileUpload();
	private final FileUpload fileUpload_2 = new FileUpload();
	private final FileUpload fileUpload_3 = new FileUpload();
	private final FileUpload fileUpload_4 = new FileUpload();
	private final FileUpload fileUpload_5 = new FileUpload();
	private final FileUpload fileUpload_6 = new FileUpload();
	private final FileUpload fileUpload_7 = new FileUpload();
	private final VerticalPanel verticalPanel_1 = new VerticalPanel();
	private final Image adImage = new Image("pic/barnes.png");
	private ArrayList<String> ar = new ArrayList<String>();
	private final HTML html = new HTML("<hr/>", true);
	private ArrayList<ArrayList<Integer>> mlist;
	private ArrayList<String> dlist;
	private final Button button_1 = new Button("New button");
	private final Button button_2 = new Button("New button");
	private final Button button_3 = new Button("New button");
	private final Button button_4 = new Button("New button");
	private final Button button_5 = new Button("New button");
	private final Button button_6 = new Button("New button");
	private final Button button_7 = new Button("New button");
	private final Button button_8 = new Button("New button");

	@SuppressWarnings("deprecation")
	public StudentForm(final ServiceInitialization si, final LoginScreen lscr) {
		smain = this;
		this.editClicked = false;

		sii = si;
		lscrr = lscr;

		ls = lscr;
		CourseList = lscr.getCourseList();

		// read department

		si.getGuiDataServiceAsync().readSort("data/department.txt",
				new AsyncCallback<ArrayList<String>>() {

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("server error");

					}

					@Override
					public void onSuccess(ArrayList<String> result) {
						if (result != null) {
							dlist = result;
							// System.out.println("got data");
						}

					}

				});

		// read schoolDept txt
		si.getGuiDataServiceAsync().readList("data/schoolDept.txt",
				new AsyncCallback<ArrayList<ArrayList<Integer>>>() {

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Server error");

					}

					@Override
					public void onSuccess(ArrayList<ArrayList<Integer>> result) {
						if (result != null) {
							mlist = result;
						}

					}
				});

		// Object created for getCurrentEntries edit Item tab
		sf1 = new Sform(si, lscr, tabPanel, smain);

		// Read user informaiton from server based on username and password
		LoginServiceAsync rst = si.getLoginServiceAsync();
		rst.readInfoBasedOnUsernameAndPasswordAndRole(lscr.getLusername(),
				lscr.getLpassword(), lscr.getLrole(),
				new AsyncCallback<RegistrationData>() {

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Exception in StudentForm");

					}

					@Override
					public void onSuccess(RegistrationData result) {
						RegistrationData rdata = (RegistrationData) result;
						if (rdata != null) {
							String firstName = rdata.getFirstName().toString();
							String lastName = rdata.getLastName().toString();
							// System.out.println("firstname= "+firstName+ " "+
							// lastName);
							tfirstName = firstName;
							tlastName = lastName;
							// System.out.println("tfirstname= "+tfirstName+
							// " "+ tlastName);
							String name = "Welcome " + tfirstName + " "
									+ tlastName;

							// lblUp.setStyleName("gwt-Label-up");
							// lblUp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
							// lblUp.setText("Student Application Form");
							nameLogout.add(verticalPanel);
							verticalPanel.add(lblUp);
							lblUp.setWidth("425px");

							Label lbl = new Label(name);
							lbl.setWidth("300px");
							lbl.setStyleName("lbl");
							nameLogout.add(lbl);

							mi.addHGap(nameLogout, "5px");
							btnLogout = new Button("Logout");
							btnLogout.setStyleName("logout");
							nameLogout.add(btnLogout);

							btnLogout.addClickHandler(new ClickHandler() {

								@Override
								public void onClick(ClickEvent event) {
									LoginServiceAsync rst = si
											.getLoginServiceAsync();
									rst.logout(new AsyncCallback<LoginData>() {

										@Override
										public void onFailure(Throwable caught) {

										}

										@Override
										public void onSuccess(LoginData result) {
											LoginScreen ls = new LoginScreen(si);
											RootPanel rootPanel = RootPanel
													.get("login");
											rootPanel.clear();
											rootPanel.add(ls);

										}

									});
								}

							});

						} else {
							Window.alert("Error reading data from server");
						}

					}

				});
		logo.setSize("244px", "62px");

		logo.setUrl("images/Untitled-1.gif");
		topPanel.setSize("1000px", "86px");
		topPanel.add(logo);
		verticalPanel_1.setSize("500px", "53px");

		topPanel.add(verticalPanel_1);

		verticalPanel_1.add(adImage);
		adImage.setSize("750px", "137px");

		verticalPanel_1.add(html);
		verticalPanel_1.add(nameLogout);
		nameLogout.setSize("200px", "24px");
		topPanel.setCellHorizontalAlignment(nameLogout,
				HasHorizontalAlignment.ALIGN_LEFT);
		nameLogout.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

		// VerticalPanel tab1Content = sform(si,lscr);
		sf = new Sform(si, lscr, tabPanel, smain);

		tabPanel.setStyleName("gwt-Label2");
		tabPanel.setSize("1000px", "500px");
		tabPanel.setAnimationEnabled(true);

		tabPanel.add(sf.getMainForm(), "Application");
		tabPanel.selectTab(0);
		tabPanel.add(vpFileUpload, "File Upload");
		label.setHeight("20px");

		// File upload
		vpFileUpload.add(label);

		vpFileUpload.add(grid);
		grid.setWidth("449px");
		lblSemester.setWordWrap(false);

		grid.setWidget(0, 0, lblSemester);

		grid.setWidget(0, 1, formPanel);

		formPanel.setWidget(fileUpload);
		fileUpload.setSize("194px", "100%");

		fileUpload.setName("uploadFormElement");

		formPanel.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem1" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel.setMethod(FormPanel.METHOD_POST);

		formPanel_1.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem2" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_1.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_1.setMethod(FormPanel.METHOD_POST);

		formPanel_2.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem3" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_2.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_2.setMethod(FormPanel.METHOD_POST);

		formPanel_3.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem4" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_3.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_3.setMethod(FormPanel.METHOD_POST);

		formPanel_4.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem5" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_4.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_4.setMethod(FormPanel.METHOD_POST);

		formPanel_5.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem6" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_5.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_5.setMethod(FormPanel.METHOD_POST);

		formPanel_6.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem7" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_6.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_6.setMethod(FormPanel.METHOD_POST);

		formPanel_7.setAction(GWT.getModuleBaseURL() + "imgload?" + "oname="
				+ "sem8" + "&oemail=" + ls.getLemail() + "&ofirstName="
				+ ls.getLfirstName() + "&olastName=" + ls.getLlastName());
		formPanel_7.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel_7.setMethod(FormPanel.METHOD_POST);

		// button 1
		btnAdd.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView.setEnabled(false);
				formPanel.submit();

			}
		});
		btnAdd.setText("Add");

		formPanel.addFormHandler(new FormHandler() {
			public void onSubmit(FormSubmitEvent event) {

			}

			public void onSubmitComplete(FormSubmitCompleteEvent event) {

				// Window.alert(event.getResults());
				String ret = event.getResults();

				String[] sret = ret.split(">");

				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView.setEnabled(true);

			}
		});

		grid.setWidget(0, 2, btnAdd);

		// view 1
		btnView.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem1");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		btnView.setText("View");
		btnView.setEnabled(false);

		grid.setWidget(0, 4, btnView);
		button_1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem1");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_1.setText("x");

		grid.setWidget(0, 8, button_1);

		grid.setWidget(1, 0, label_1);

		grid.setWidget(2, 0, lblSemester_1);

		// button 2
		btnAdd2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView2.setEnabled(false);
				formPanel_1.submit();

			}
		});

		grid.setWidget(2, 1, formPanel_1);

		formPanel_1.setWidget(fileUpload_1);
		fileUpload_1.setSize("100%", "100%");

		fileUpload_1.setName("uploadFormElement1");

		btnAdd2.setText("Add");

		formPanel_1.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");

				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView2.setEnabled(true);

			}

		});

		grid.setWidget(2, 2, btnAdd2);

		// view 2
		btnView2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem2");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		btnView2.setText("View");
		btnView2.setEnabled(false);

		grid.setWidget(2, 4, btnView2);
		button_2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem2");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView2.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_2.setText("x");

		grid.setWidget(2, 8, button_2);

		grid.setWidget(3, 0, label_2);

		grid.setWidget(4, 0, lblSemester_2);

		grid.setWidget(4, 1, formPanel_2);

		formPanel_2.setWidget(fileUpload_2);
		fileUpload_2.setSize("100%", "100%");
		btnAdd3.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView3.setEnabled(false);
				formPanel_2.submit();
			}
		});
		btnAdd3.setText("Add");
		fileUpload_1.setName("uploadFormElement2");

		formPanel_2.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");
				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView3.setEnabled(true);

			}

		});
		fileUpload_2.setName("uploadFormElement3");

		grid.setWidget(4, 2, btnAdd3);
		btnView3.setEnabled(false);
		btnView3.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem3");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
		});
		btnView3.setText("View");

		grid.setWidget(4, 4, btnView3);
		button_3.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem3");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView3.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}

		});
		button_3.setText("x");

		grid.setWidget(4, 8, button_3);

		grid.setWidget(5, 0, label_4);

		grid.setWidget(6, 0, lblSemester_3);

		grid.setWidget(6, 1, formPanel_3);

		formPanel_3.setWidget(fileUpload_3);
		fileUpload_3.setSize("100%", "100%");
		btnAdd4.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView4.setEnabled(false);
				formPanel_3.submit();
			}
		});
		btnAdd4.setText("Add");
		fileUpload_3.setName("uploadFormElement3");

		formPanel_3.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");
				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView4.setEnabled(true);

			}

		});

		grid.setWidget(6, 2, btnAdd4);

		btnView4.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem4");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
		});
		btnView4.setEnabled(false);
		btnView4.setText("View");

		grid.setWidget(6, 4, btnView4);
		button_4.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem4");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView4.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_4.setText("x");

		grid.setWidget(6, 8, button_4);

		grid.setWidget(7, 0, label_6);

		grid.setWidget(8, 0, lblSemester_4);

		grid.setWidget(8, 1, formPanel_4);

		formPanel_4.setWidget(fileUpload_4);
		fileUpload_4.setSize("100%", "100%");
		btnAdd5.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView5.setEnabled(false);
				formPanel_4.submit();
			}
		});
		btnAdd5.setText("Add");

		fileUpload_4.setName("uploadFormElement4");

		formPanel_4.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");
				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView5.setEnabled(true);

			}

		});

		grid.setWidget(8, 2, btnAdd5);
		btnView5.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem5");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
		});
		btnView5.setEnabled(false);
		btnView5.setText("View");

		grid.setWidget(8, 4, btnView5);
		button_5.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem5");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView5.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_5.setText("x");

		grid.setWidget(8, 8, button_5);

		grid.setWidget(9, 0, label_8);

		grid.setWidget(10, 0, lblSemester_5);

		grid.setWidget(10, 1, formPanel_5);

		formPanel_5.setWidget(fileUpload_5);
		fileUpload_5.setSize("100%", "100%");
		btnAdd6.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView6.setEnabled(false);
				formPanel_5.submit();
			}
		});
		btnAdd6.setText("Add");
		fileUpload_5.setName("uploadFormElement5");

		formPanel_5.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");
				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView6.setEnabled(true);

			}

		});

		grid.setWidget(10, 2, btnAdd6);
		btnView6.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem6");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
		});
		btnView6.setEnabled(false);
		btnView6.setText("View");

		grid.setWidget(10, 4, btnView6);
		button_6.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem6");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView6.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_6.setText("x");

		grid.setWidget(10, 8, button_6);

		grid.setWidget(11, 0, label_10);

		grid.setWidget(12, 0, lblSemester_6);

		grid.setWidget(12, 1, formPanel_6);

		formPanel_6.setWidget(fileUpload_6);
		fileUpload_6.setSize("100%", "100%");
		btnAdd7.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView7.setEnabled(false);
				formPanel_6.submit();
			}
		});
		btnAdd7.setText("Add");

		grid.setWidget(12, 2, btnAdd7);
		fileUpload_6.setName("uploadFormElement6");

		formPanel_6.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");
				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView7.setEnabled(true);

			}

		});

		btnView7.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem7");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
		});
		btnView7.setEnabled(false);
		btnView7.setText("View");

		grid.setWidget(12, 4, btnView7);
		button_7.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem7");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView7.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_7.setText("x");

		grid.setWidget(12, 8, button_7);

		grid.setWidget(13, 0, label_5);

		grid.setWidget(14, 0, lblSemester_7);

		grid.setWidget(14, 1, formPanel_7);

		formPanel_7.setWidget(fileUpload_7);
		fileUpload_7.setSize("100%", "100%");
		btnAdd8.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				btnView8.setEnabled(false);
				formPanel_7.submit();
			}
		});
		btnAdd8.setText("Add");
		fileUpload_7.setName("uploadFormElement7");

		formPanel_7.addFormHandler(new FormHandler() {

			@Override
			public void onSubmit(FormSubmitEvent event) {

			}

			@Override
			public void onSubmitComplete(FormSubmitCompleteEvent event) {
				String ret = event.getResults();

				String[] sret = ret.split(">");
				if (sret[1].startsWith("No-File")) {
					Window.alert("Select File");
					return;
				}

				String[] fin = sret[1].split("\n");
				String[] sfin = fin[0].split("=");

				if (Integer.parseInt(sfin[1]) > 0) {

				} else {
					Window.alert("Error adding image to the server");
				}

				btnView8.setEnabled(true);

			}

		});

		grid.setWidget(14, 2, btnAdd8);
		btnView8.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem8");

				try {
					si.getImageDataServiceAsync().readID(id,
							new AsyncCallback<Long>() {

								@Override
								public void onFailure(Throwable caught) {

								}

								@Override
								public void onSuccess(Long result) {
									Long idd = result;
									if (idd != null) {
										String url = GWT.getModuleBaseURL();
										Window.open(GWT.getModuleBaseURL()
												+ "imgsource?id=" + idd,
												"_blank", null);
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}
			}
		});
		btnView8.setEnabled(false);
		btnView8.setText("View");

		grid.setWidget(14, 4, btnView8);
		button_8.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ImageData id = new ImageData();
				id.setEmail(ls.getLemail());
				id.setFirstName(ls.getLfirstName());
				id.setLastName(ls.getLlastName());
				id.setName("sem8");
				try {
					si.getImageDataServiceAsync().deleteFile(id,
							new AsyncCallback<String>() {

								@Override
								public void onFailure(Throwable caught) {
									Window.alert("server error");

								}

								@Override
								public void onSuccess(String result) {
									String vt;
									if (result != null) {
										vt = result;
										if (vt.equals("ok")) {
											btnView8.setEnabled(false);
										} else
											Window.alert("server error");
									}

								}

							});
				} catch (LoggedInException e) {

					e.printStackTrace();
				}

			}
		});
		button_8.setText("x");

		grid.setWidget(14, 8, button_8);

		// Application panel setup
		tabPanel.getTabBar().getTab(0).addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) { // deb
				if (isEditClicked()) {
					// if(isEditApplicationFlag()){
					// Window.alert("nehru clicked");
					tabPanel.remove(sf1.getMainForm());
					tabPanel.selectTab(0);
					// setEditApplicationFlag(false);
					setEditClicked(false);
				}

			}

		});

		// File Upload panel setup
		tabPanel.getTabBar().getTab(1).addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// Window.alert("file upload clicked");

				if (isEditClicked()) {
					tabPanel.remove(sf1.getMainForm());
					tabPanel.selectTab(1);
					setEditClicked(false);
				}

			}

		});

		tabPanel.add(flexSubmittedList, "Submitted");
		// status list update
		tabPanel.add(flexStatusList, "Status");

		// Submitted panel setup
		tabPanel.getTabBar().getTab(2).addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				if (isEditClicked()) {
					tabPanel.remove(sf1.getMainForm());
					tabPanel.selectTab(2);
					setEditClicked(false);
				}

			}

		});

		// Status panel setup
		tabPanel.getTabBar().getTab(3).addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				if (isEditClicked()) {
					tabPanel.remove(sf1.getMainForm());
					tabPanel.selectTab(3);
					setEditClicked(false);
				} else {
					try {
						si.getStudentDataServiceAsync().getEntries(
								lscr.getLemail(),
								new AsyncCallback<Vector<StudentData>>() {

									@Override
									public void onFailure(Throwable caught) {

										Window.alert("Server error");
									}

									@Override
									public void onSuccess(
											Vector<StudentData> result) {
										int row = 0;

										flexStatusList.setText(row, 0, "DATE");
										flexStatusList.setText(row, 1,
												"SCHOOL NAME");
										flexStatusList.setText(row, 2,
												"DEPARTMENT");
										flexStatusList.setText(row, 3, "MAJOR");
										flexStatusList
												.setText(row, 4, "STATUS");
										flexStatusList.setText(row, 5,
												"SUMMARY");

										row = row + 3;

										for (StudentData ted : result) {
											row++;

											// set status panel
											flexStatusList.setText(row, 0,
													ted.getDate());
											flexStatusList.setText(row, 1,
													ted.getAppliedSchoolName());
											flexStatusList.setText(row, 2,
													ted.getDepartment());
											flexStatusList.setText(row, 3,
													ted.getMajor());
											flexStatusList.setText(row, 4,
													ted.getApplicationStatus());
											flexStatusList.setText(row, 5,
													ted.getSummary());

										}

									}

								});
					} catch (LoggedInException e) {

						e.printStackTrace();
					}

				}

			}

		});

		mainPanel.setHeight("223px");
		mainPanel.add(topPanel);
		mainPanel.add(tabPanel);

		initWidget(mainPanel);

		getCurrentEntries(si, lscr, tabPanel);
		// Get Image information to enable or disable the view button
		getImageEntries(si, lscr);

	}

	// /////////////////////////////////////////////////////////

	public void getEntries() {
		getCurrentEntries(this.sii, this.lscrr, tabPanel);

	}

	public void getCurrentEntries(final ServiceInitialization si,
			final LoginScreen lscr, final DecoratedTabPanel tabPanel) {

		/*
		 * StudentData sdl = new StudentData(); sdl.setEmail(lscr.getLemail());
		 * sdl.setFirstName(lscr.getLfirstName());
		 * sdl.setLastName(lscr.getLlastName());
		 * 
		 * try { si.getStudentDataServiceAsync().getStarData(sdl, new
		 * AsyncCallback<Vector<String>>(){
		 * 
		 * @Override public void onFailure(Throwable caught) {
		 * Window.alert("Server error");
		 * 
		 * }
		 * 
		 * @Override public void onSuccess(Vector<String> result) { if(result !=
		 * null){ Vector<String> ret = result; for(int i=0;i<ret.size();i++){
		 * updateListBox(ret.get(i)); } }
		 * 
		 * }
		 * 
		 * }); } catch (LoggedInException e1) {
		 * 
		 * e1.printStackTrace(); }
		 */

		si.getAdverDataServiceAsync().getImgIdEntries(
				new AsyncCallback<Vector<AdvImageData>>() {

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("Error from server");

					}

					public void onSuccess(Vector<AdvImageData> result) {
						if (result != null) {
							for (AdvImageData ted : result) {
								ar.add(ted.getId());
							}
						}

					}

				});

		Timer t = new Timer() {
			int i = 0;

			@Override
			public void run() {

				adImage.setUrl(GWT.getModuleBaseURL() + "addimgsource?id="
						+ ar.get(i));
				i++;
				if (i == ar.size())
					i = 0;

			}

		};
		t.scheduleRepeating(5000);

		// adImage.setUrl(GWT.getModuleBaseURL()+"imgsource?id="+Long.parseLong(gid[5]));
		// adImage.setUrl(GWT.getModuleBaseURL()+"imgsource?id=28005");

		// update comboBox's course list from the server

		try {
			si.getStudentDataServiceAsync().getEntries(lscr.getLemail(),
					new AsyncCallback<Vector<StudentData>>() {

						@Override
						public void onFailure(Throwable caught) {
							Window.alert("Error from server***");

						}

						public void onSuccess(Vector<StudentData> result) {
							// int row = flexSubmittedList.getRowCount();
							int row = 0;

							flexSubmittedList.setText(row, 0, "DATE");
							flexSubmittedList.setText(row, 1, "SCHOOL NAME");
							flexSubmittedList.setText(row, 2, "DEPARTMENT");
							flexSubmittedList.setText(row, 3, "MAJOR");
							flexSubmittedList.setText(row, 4, "EMAIL");
							flexSubmittedList.setText(row, 5, "CODE");

							flexStatusList.setText(row, 0, "DATE");
							flexStatusList.setText(row, 1, "SCHOOL NAME");
							flexStatusList.setText(row, 2, "DEPARTMENT");
							flexStatusList.setText(row, 3, "MAJOR");
							flexStatusList.setText(row, 4, "STATUS");
							flexStatusList.setText(row, 5, "SUMMARY");

							row = row + 3;

							for (StudentData ted : result) {
								row++;
								flexSubmittedList.setText(row, 0, ted.getDate());
								flexSubmittedList.setText(row, 1,
										ted.getAppliedSchoolName());
								flexSubmittedList.setText(row, 2,
										ted.getDepartment());
								flexSubmittedList.setText(row, 3,
										ted.getMajor());
								flexSubmittedList.setText(row, 4,
										ted.getLemail());
								flexSubmittedList.setText(row, 5,
										ted.getUcode());

								// set status panel
								flexStatusList.setText(row, 0, ted.getDate());
								flexStatusList.setText(row, 1,
										ted.getAppliedSchoolName());
								flexStatusList.setText(row, 2,
										ted.getDepartment());
								flexStatusList.setText(row, 3, ted.getMajor());
								flexStatusList.setText(row, 4,
										ted.getApplicationStatus());
								flexStatusList.setText(row, 5, ted.getSummary());

								Button delButton = new Button("x");
								delButton.addClickHandler(new ClickHandler() {

									@Override
									public void onClick(ClickEvent event) {
										com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexSubmittedList
												.getCellForEvent(event);
										int rw = cell.getRowIndex();
										int cl = cell.getCellIndex();

										/*
										 * String date =
										 * flexSubmittedList.getText(rw, 0);
										 * String schoolName =
										 * flexSubmittedList.getText(rw, 1);
										 * String department =
										 * flexSubmittedList.getText(rw, 2);
										 * String major =
										 * flexSubmittedList.getText(rw, 3);
										 * String email =
										 * flexSubmittedList.getText(rw, 4);
										 * String ucode =
										 * flexSubmittedList.getText(rw, 5);
										 */

										StudentData sdd = new StudentData();
										sdd.setDate(flexSubmittedList.getText(
												rw, 0));
										sdd.setDepartment(flexSubmittedList
												.getText(rw, 2));
										sdd.setMajor(flexSubmittedList.getText(
												rw, 3));
										sdd.setLemail(flexSubmittedList
												.getText(rw, 4));
										sdd.setUcode(flexSubmittedList.getText(
												rw, 5));

										try {
											si.getStudentDataServiceAsync()
													.deleteData(
															sdd,
															new AsyncCallback<String>() {

																@Override
																public void onFailure(
																		Throwable caught) {

																}

																@Override
																public void onSuccess(
																		String result) {
																	if (result != null) {
																		System.out
																				.println("got data");
																		getCurrentEntries(
																				si,
																				lscr,
																				tabPanel);
																	}

																}

															});
										} catch (LoggedInException e) {

											e.printStackTrace();
										}

										flexSubmittedList.removeRow(rw);

									}

								});
								flexSubmittedList.setWidget(row, 6, delButton);

								Anchor achor = new Anchor("Edit");

								achor.addClickHandler(new ClickHandler() {

									@Override
									public void onClick(ClickEvent event) {

										setEditClicked(true);
										setEditApplicationFlag(true);

										sf1.getCbUnivDepartment().setEnabled(
												true);

										// Sform sf1 = new
										// Sform(si,lscr,tabPanel);
										tabPanel.add(sf1.getMainForm(),
												"Edit Item");
										tabPanel.selectTab(4);

										/*
										 * ListBox lb = sf1.getCbUnivSchool();
										 * int x = lb.getItemCount();
										 * System.out.println("item = "+x);
										 * System
										 * .out.println("itemtext = "+lb.getItemText
										 * (3)); lb.setItemSelected(4, true);
										 */

										com.google.gwt.user.client.ui.HTMLTable.Cell cell = flexSubmittedList
												.getCellForEvent(event);
										int rw = cell.getRowIndex();
										int cl = cell.getCellIndex();

										/*
										 * String date =
										 * flexSubmittedList.getText(rw, 0);
										 * String schoolName =
										 * flexSubmittedList.getText(rw, 1);
										 * String department =
										 * flexSubmittedList.getText(rw, 2);
										 * String major =
										 * flexSubmittedList.getText(rw, 3);
										 * String email =
										 * flexSubmittedList.getText(rw, 4);
										 * String ucode =
										 * flexSubmittedList.getText(rw, 5);
										 */

										StudentData sdd = new StudentData();
										sdd.setDate(flexSubmittedList.getText(
												rw, 0));
										sdd.setDepartment(flexSubmittedList
												.getText(rw, 2));
										sdd.setMajor(flexSubmittedList.getText(
												rw, 3));
										sdd.setLemail(flexSubmittedList
												.getText(rw, 4));
										sdd.setUcode(flexSubmittedList.getText(
												rw, 5));

										// setting old student for later
										// deletion
										setOldData(sdd);

										try {
											// Clicked Student data from server
											// [Edit item]
											si.getStudentDataServiceAsync()
													.updateData(
															sdd,
															new AsyncCallback<Vector<StudentData>>() {

																@Override
																public void onFailure(
																		Throwable caught) {

																}

																@Override
																public void onSuccess(
																		Vector<StudentData> result) {
																	Vector<StudentData> lda = result;

																	if (result != null) {
																		// Select
																		// item
																		// from
																		// the
																		// list
																		si.getGuiDataServiceAsync()
																				.getIndex(
																						lda.get(0)
																								.getUcode(),
																						"data/school.txt",
																						new AsyncCallback<Integer>() {

																							@Override
																							public void onFailure(
																									Throwable caught) {

																							}

																							@SuppressWarnings("deprecation")
																							@Override
																							public void onSuccess(
																									Integer result) {
																								if (result != -1) {
																									// System.out.println("index= "+result);
																									ListBox lb = sf1
																											.getCbUnivSchool();
																									lb.setMultipleSelect(false);
																									lb.setItemSelected(
																											result,
																											true);
																								}

																							}

																						});

																		// /////////////////////////////////////////////////
																		// Update
																		// department
																		final String dept = lda
																				.get(0)
																				.getDepartment();
																		String school = lda
																				.get(0)
																				.getAppliedSchoolName();
																		// String[]
																		// sch =
																		// school.split("-");
																		// int
																		// idx =
																		// Integer.parseInt(sch[1]);

																		final ArrayList<ArrayList<Integer>> mlist = getMlist();
																		final ArrayList<String> dlist = getDlist();

																		/*
																		 * si.
																		 * getGuiDataServiceAsync
																		 * (
																		 * ).read
																		 * (
																		 * "data/school.txt"
																		 * , new
																		 * AsyncCallback
																		 * <
																		 * ArrayList
																		 * <
																		 * String
																		 * >>(){
																		 * 
																		 * 
																		 * @Override
																		 * public
																		 * void
																		 * onFailure
																		 * (
																		 * Throwable
																		 * caught
																		 * ) {
																		 * 
																		 * 
																		 * }
																		 * 
																		 * @Override
																		 * public
																		 * void
																		 * onSuccess
																		 * (
																		 * ArrayList
																		 * <
																		 * String
																		 * >
																		 * result
																		 * ) {
																		 * if
																		 * (result
																		 * !=
																		 * null
																		 * ){ de
																		 * =
																		 * result
																		 * ;
																		 * 
																		 * }
																		 * 
																		 * }
																		 * 
																		 * });
																		 */

																		si.getGuiDataServiceAsync()
																				.getCode(
																						lda.get(0)
																								.getAppliedSchoolName(),
																						"data/school.txt",
																						new AsyncCallback<String>() {

																							@Override
																							public void onFailure(
																									Throwable caught) {
																								Window.alert("server error");

																							}

																							@Override
																							public void onSuccess(
																									String result) {
																								System.out
																										.println("onsuccess inside");
																								if (result != null) {
																									pnx = result;
																									System.out
																											.println("inx ="
																													+ pnx);

																									int ix = Integer
																											.parseInt(pnx) % 1000;
																									ArrayList<Integer> ml = mlist
																											.get(ix - 1);
																									ArrayList<String> te = new ArrayList<String>();

																									for (int i = 0; i < ml
																											.size(); i++) {
																										te.add(dlist
																												.get(ml.get(i)));
																									}

																									Collections
																											.sort(te);

																									int idx = 0;
																									for (int j = 0; j < te
																											.size(); j++) {
																										if (te.get(
																												j)
																												.equals(dept)) {
																											break;
																										}
																										idx++;
																									}

																									System.out
																											.println("idx ="
																													+ idx);

																									sf1.getCbUnivDepartment()
																											.clear();
																									for (int i = 0; i < ml
																											.size(); i++) {
																										sf1.getCbUnivDepartment()
																												.insertItem(
																														te.get(i),
																														i);
																									}

																									ListBox lb = sf1
																											.getCbUnivDepartment();
																									lb.setItemSelected(
																											idx,
																											true);

																								}

																							}

																						});

																		// /////////////////////////////////////////////////

																		// updating
																		// department
																		// index
																		/*
																		 * si.
																		 * getGuiDataServiceAsync
																		 * ().
																		 * getDepartmentIndex
																		 * (
																		 * lda.get
																		 * (0).
																		 * getDepartment
																		 * (),
																		 * "data/department.txt"
																		 * , new
																		 * AsyncCallback
																		 * <
																		 * Integer
																		 * >() {
																		 * 
																		 * @Override
																		 * public
																		 * void
																		 * onFailure
																		 * (
																		 * Throwable
																		 * caught
																		 * ) {
																		 * 
																		 * }
																		 * 
																		 * @Override
																		 * public
																		 * void
																		 * onSuccess
																		 * (
																		 * Integer
																		 * result
																		 * ) {
																		 * if
																		 * (result
																		 * !=
																		 * -1) {
																		 * ListBox
																		 * lb =
																		 * sf1.
																		 * getCbUnivDepartment
																		 * ();
																		 * lb.
																		 * setItemSelected
																		 * (
																		 * result
																		 * ,
																		 * true)
																		 * ; }
																		 * 
																		 * }
																		 * 
																		 * });
																		 */

																		si.getGuiDataServiceAsync()
																				.getDepartmentIndex(
																						lda.get(0)
																								.getMajor(),
																						"data/major.txt",
																						new AsyncCallback<Integer>() {

																							@Override
																							public void onFailure(
																									Throwable caught) {

																							}

																							@Override
																							public void onSuccess(
																									Integer result) {
																								if (result != -1) {

																									ListBox lb = sf1
																											.getCbUnivMajor();

																									lb.setItemSelected(
																											result,
																											true);
																								}
																							}

																						});

																		// update
																		// first
																		// name

																		sf1.getTbFirstName()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getFirstName()) ? lda
																								.get(0)
																								.getFirstName()
																								: "");
																		sf1.getTbMiddleName()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getMiddleName()) ? lda
																								.get(0)
																								.getMiddleName()
																								: "");
																		sf1.getTbLastName()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getLastName()) ? lda
																								.get(0)
																								.getLastName()
																								: "");
																		sf1.getTbAddress()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getAddress()) ? lda
																								.get(0)
																								.getAddress()
																								: "");
																		sf1.getTbState()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getState()) ? lda
																								.get(0)
																								.getState()
																								: "");
																		sf1.getTbCity()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getCity()) ? lda
																								.get(0)
																								.getCity()
																								: "");
																		sf1.getTbZip()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getZip()) ? lda
																								.get(0)
																								.getZip()
																								: "");
																		sf1.getTbCountry()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getCountry()) ? lda
																								.get(0)
																								.getCountry()
																								: "");
																		sf1.getTbEmail()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getEmail()) ? lda
																								.get(0)
																								.getEmail()
																								: "");
																		sf1.getTbSchoolName()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getStudiedSchoolName()) ? lda
																								.get(0)
																								.getStudiedSchoolName()
																								: "");
																		sf1.getTbSchoolCity()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getStudiedSchoolCity()) ? lda
																								.get(0)
																								.getStudiedSchoolCity()
																								: "");
																		sf1.getTbSchoolCountry()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getStudiedSchoolCountry()) ? lda
																								.get(0)
																								.getStudiedSchoolCountry()
																								: "");

																		sf1.getTxtComment()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTxtComment()) ? lda
																								.get(0)
																								.getTxtComment()
																								: "");
																		// sf1.getDateGraduation().setValue(mi.isNullDate(lda.get(0).getDateGraduation())?
																		// lda.get(0).getDateGraduation():
																		// "");

																		sf1.getDateGraduation()
																				.setValue(
																						lda.get(0)
																								.getDateGraduation());

																		sf1.getComboBox_1_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_1())
																								: 0,
																						true);
																		sf1.getComboBox_1_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_2())
																								: 0,
																						true);
																		sf1.getComboBox_1_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_3())
																								: 0,
																						true);
																		sf1.getComboBox_1_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_4())
																								: 0,
																						true);
																		sf1.getComboBox_1_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_5())
																								: 0,
																						true);
																		sf1.getComboBox_1_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_6())
																								: 0,
																						true);
																		sf1.getComboBox_1_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_7())
																								: 0,
																						true);
																		sf1.getComboBox_1_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_1_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_1_8())
																								: 0,
																						true);

																		sf1.getComboBox_2_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_1())
																								: 0,
																						true);
																		sf1.getComboBox_2_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_2())
																								: 0,
																						true);
																		sf1.getComboBox_2_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_3())
																								: 0,
																						true);
																		sf1.getComboBox_2_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_4())
																								: 0,
																						true);
																		sf1.getComboBox_2_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_5())
																								: 0,
																						true);
																		sf1.getComboBox_2_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_6())
																								: 0,
																						true);
																		sf1.getComboBox_2_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_7())
																								: 0,
																						true);
																		sf1.getComboBox_2_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_2_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_2_8())
																								: 0,
																						true);

																		sf1.getComboBox_3_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_1())
																								: 0,
																						true);
																		sf1.getComboBox_3_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_2())
																								: 0,
																						true);
																		sf1.getComboBox_3_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_3())
																								: 0,
																						true);
																		sf1.getComboBox_3_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_4())
																								: 0,
																						true);
																		sf1.getComboBox_3_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_5())
																								: 0,
																						true);
																		sf1.getComboBox_3_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_6())
																								: 0,
																						true);
																		sf1.getComboBox_3_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_7())
																								: 0,
																						true);
																		sf1.getComboBox_3_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_3_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_3_8())
																								: 0,
																						true);

																		sf1.getComboBox_4_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_1())
																								: 0,
																						true);
																		sf1.getComboBox_4_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_2())
																								: 0,
																						true);
																		sf1.getComboBox_4_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_3())
																								: 0,
																						true);
																		sf1.getComboBox_4_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_4())
																								: 0,
																						true);
																		sf1.getComboBox_4_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_5())
																								: 0,
																						true);
																		sf1.getComboBox_4_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_6())
																								: 0,
																						true);
																		sf1.getComboBox_4_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_7())
																								: 0,
																						true);
																		sf1.getComboBox_4_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_4_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_4_8())
																								: 0,
																						true);

																		sf1.getComboBox_5_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_1())
																								: 0,
																						true);
																		sf1.getComboBox_5_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_2())
																								: 0,
																						true);
																		sf1.getComboBox_5_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_3())
																								: 0,
																						true);
																		sf1.getComboBox_5_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_4())
																								: 0,
																						true);
																		sf1.getComboBox_5_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_5())
																								: 0,
																						true);
																		sf1.getComboBox_5_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_6())
																								: 0,
																						true);
																		sf1.getComboBox_5_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_7())
																								: 0,
																						true);
																		sf1.getComboBox_5_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_5_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_5_8())
																								: 0,
																						true);

																		sf1.getComboBox_6_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_1())
																								: 0,
																						true);
																		sf1.getComboBox_6_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_2())
																								: 0,
																						true);
																		sf1.getComboBox_6_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_3())
																								: 0,
																						true);
																		sf1.getComboBox_6_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_4())
																								: 0,
																						true);
																		sf1.getComboBox_6_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_5())
																								: 0,
																						true);
																		sf1.getComboBox_6_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_6())
																								: 0,
																						true);
																		sf1.getComboBox_6_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_7())
																								: 0,
																						true);
																		sf1.getComboBox_6_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_6_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_6_8())
																								: 0,
																						true);

																		sf1.getComboBox_7_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_1())
																								: 0,
																						true);
																		sf1.getComboBox_7_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_2())
																								: 0,
																						true);
																		sf1.getComboBox_7_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_3())
																								: 0,
																						true);
																		sf1.getComboBox_7_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_4())
																								: 0,
																						true);
																		sf1.getComboBox_7_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_5())
																								: 0,
																						true);
																		sf1.getComboBox_7_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_6())
																								: 0,
																						true);
																		sf1.getComboBox_7_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_7())
																								: 0,
																						true);
																		sf1.getComboBox_7_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_7_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_7_8())
																								: 0,
																						true);

																		sf1.getComboBox_8_1()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_1()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_1())
																								: 0,
																						true);
																		sf1.getComboBox_8_2()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_2()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_2())
																								: 0,
																						true);
																		sf1.getComboBox_8_3()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_3()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_3())
																								: 0,
																						true);
																		sf1.getComboBox_8_4()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_4()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_4())
																								: 0,
																						true);
																		sf1.getComboBox_8_5()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_5()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_5())
																								: 0,
																						true);
																		sf1.getComboBox_8_6()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_6()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_6())
																								: 0,
																						true);
																		sf1.getComboBox_8_7()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_7()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_7())
																								: 0,
																						true);
																		sf1.getComboBox_8_8()
																				.setItemSelected(
																						mi.isNull(lda
																								.get(0)
																								.getComboBox_8_8()) ? getCourseIndex(lda
																								.get(0)
																								.getComboBox_8_8())
																								: 0,
																						true);

																		sf1.getTextBox_1_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_1()) ? lda
																								.get(0)
																								.getTextBox_1_1()
																								: "");
																		sf1.getTextBox_1_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_2()) ? lda
																								.get(0)
																								.getTextBox_1_2()
																								: "");
																		sf1.getTextBox_1_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_3()) ? lda
																								.get(0)
																								.getTextBox_1_3()
																								: "");
																		sf1.getTextBox_1_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_4()) ? lda
																								.get(0)
																								.getTextBox_1_4()
																								: "");
																		sf1.getTextBox_1_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_5()) ? lda
																								.get(0)
																								.getTextBox_1_5()
																								: "");
																		sf1.getTextBox_1_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_6()) ? lda
																								.get(0)
																								.getTextBox_1_6()
																								: "");
																		sf1.getTextBox_1_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_7()) ? lda
																								.get(0)
																								.getTextBox_1_7()
																								: "");
																		sf1.getTextBox_1_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_1_8()) ? lda
																								.get(0)
																								.getTextBox_1_8()
																								: "");

																		sf1.getTextBox_2_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_1()) ? lda
																								.get(0)
																								.getTextBox_2_1()
																								: "");
																		sf1.getTextBox_2_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_2()) ? lda
																								.get(0)
																								.getTextBox_2_2()
																								: "");
																		sf1.getTextBox_2_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_3()) ? lda
																								.get(0)
																								.getTextBox_2_3()
																								: "");
																		sf1.getTextBox_2_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_4()) ? lda
																								.get(0)
																								.getTextBox_2_4()
																								: "");
																		sf1.getTextBox_2_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_5()) ? lda
																								.get(0)
																								.getTextBox_2_5()
																								: "");
																		sf1.getTextBox_2_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_6()) ? lda
																								.get(0)
																								.getTextBox_2_6()
																								: "");
																		sf1.getTextBox_2_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_7()) ? lda
																								.get(0)
																								.getTextBox_2_7()
																								: "");
																		sf1.getTextBox_2_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_2_8()) ? lda
																								.get(0)
																								.getTextBox_2_8()
																								: "");

																		sf1.getTextBox_3_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_1()) ? lda
																								.get(0)
																								.getTextBox_3_1()
																								: "");
																		sf1.getTextBox_3_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_2()) ? lda
																								.get(0)
																								.getTextBox_3_2()
																								: "");
																		sf1.getTextBox_3_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_3()) ? lda
																								.get(0)
																								.getTextBox_3_3()
																								: "");
																		sf1.getTextBox_3_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_4()) ? lda
																								.get(0)
																								.getTextBox_3_4()
																								: "");
																		sf1.getTextBox_3_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_5()) ? lda
																								.get(0)
																								.getTextBox_3_5()
																								: "");
																		sf1.getTextBox_3_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_6()) ? lda
																								.get(0)
																								.getTextBox_3_6()
																								: "");
																		sf1.getTextBox_3_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_7()) ? lda
																								.get(0)
																								.getTextBox_3_7()
																								: "");
																		sf1.getTextBox_3_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_3_8()) ? lda
																								.get(0)
																								.getTextBox_3_8()
																								: "");

																		sf1.getTextBox_4_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_1()) ? lda
																								.get(0)
																								.getTextBox_4_1()
																								: "");
																		sf1.getTextBox_4_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_2()) ? lda
																								.get(0)
																								.getTextBox_4_2()
																								: "");
																		sf1.getTextBox_4_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_3()) ? lda
																								.get(0)
																								.getTextBox_4_3()
																								: "");
																		sf1.getTextBox_4_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_4()) ? lda
																								.get(0)
																								.getTextBox_4_4()
																								: "");
																		sf1.getTextBox_4_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_5()) ? lda
																								.get(0)
																								.getTextBox_4_5()
																								: "");
																		sf1.getTextBox_4_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_6()) ? lda
																								.get(0)
																								.getTextBox_4_6()
																								: "");
																		sf1.getTextBox_4_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_7()) ? lda
																								.get(0)
																								.getTextBox_4_7()
																								: "");
																		sf1.getTextBox_4_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_4_8()) ? lda
																								.get(0)
																								.getTextBox_4_8()
																								: "");

																		sf1.getTextBox_5_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_1()) ? lda
																								.get(0)
																								.getTextBox_5_1()
																								: "");
																		sf1.getTextBox_5_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_2()) ? lda
																								.get(0)
																								.getTextBox_5_2()
																								: "");
																		sf1.getTextBox_5_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_3()) ? lda
																								.get(0)
																								.getTextBox_5_3()
																								: "");
																		sf1.getTextBox_5_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_4()) ? lda
																								.get(0)
																								.getTextBox_5_4()
																								: "");
																		sf1.getTextBox_5_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_5()) ? lda
																								.get(0)
																								.getTextBox_5_5()
																								: "");
																		sf1.getTextBox_5_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_6()) ? lda
																								.get(0)
																								.getTextBox_5_6()
																								: "");
																		sf1.getTextBox_5_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_7()) ? lda
																								.get(0)
																								.getTextBox_5_7()
																								: "");
																		sf1.getTextBox_5_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_5_8()) ? lda
																								.get(0)
																								.getTextBox_5_8()
																								: "");

																		sf1.getTextBox_6_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_1()) ? lda
																								.get(0)
																								.getTextBox_6_1()
																								: "");
																		sf1.getTextBox_6_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_2()) ? lda
																								.get(0)
																								.getTextBox_6_2()
																								: "");
																		sf1.getTextBox_6_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_3()) ? lda
																								.get(0)
																								.getTextBox_6_3()
																								: "");
																		sf1.getTextBox_6_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_4()) ? lda
																								.get(0)
																								.getTextBox_6_4()
																								: "");
																		sf1.getTextBox_6_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_5()) ? lda
																								.get(0)
																								.getTextBox_6_5()
																								: "");
																		sf1.getTextBox_6_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_6()) ? lda
																								.get(0)
																								.getTextBox_6_6()
																								: "");
																		sf1.getTextBox_6_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_7()) ? lda
																								.get(0)
																								.getTextBox_6_7()
																								: "");
																		sf1.getTextBox_6_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_6_8()) ? lda
																								.get(0)
																								.getTextBox_6_8()
																								: "");

																		sf1.getTextBox_7_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_1()) ? lda
																								.get(0)
																								.getTextBox_7_1()
																								: "");
																		sf1.getTextBox_7_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_2()) ? lda
																								.get(0)
																								.getTextBox_7_2()
																								: "");
																		sf1.getTextBox_7_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_3()) ? lda
																								.get(0)
																								.getTextBox_7_3()
																								: "");
																		sf1.getTextBox_7_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_4()) ? lda
																								.get(0)
																								.getTextBox_7_4()
																								: "");
																		sf1.getTextBox_7_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_5()) ? lda
																								.get(0)
																								.getTextBox_7_5()
																								: "");
																		sf1.getTextBox_7_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_6()) ? lda
																								.get(0)
																								.getTextBox_7_6()
																								: "");
																		sf1.getTextBox_7_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_7()) ? lda
																								.get(0)
																								.getTextBox_7_7()
																								: "");
																		sf1.getTextBox_7_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_7_8()) ? lda
																								.get(0)
																								.getTextBox_7_8()
																								: "");

																		sf1.getTextBox_8_1()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_1()) ? lda
																								.get(0)
																								.getTextBox_8_1()
																								: "");
																		sf1.getTextBox_8_2()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_2()) ? lda
																								.get(0)
																								.getTextBox_8_2()
																								: "");
																		sf1.getTextBox_8_3()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_3()) ? lda
																								.get(0)
																								.getTextBox_8_3()
																								: "");
																		sf1.getTextBox_8_4()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_4()) ? lda
																								.get(0)
																								.getTextBox_8_4()
																								: "");
																		sf1.getTextBox_8_5()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_5()) ? lda
																								.get(0)
																								.getTextBox_8_5()
																								: "");
																		sf1.getTextBox_8_6()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_6()) ? lda
																								.get(0)
																								.getTextBox_8_6()
																								: "");
																		sf1.getTextBox_8_7()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_7()) ? lda
																								.get(0)
																								.getTextBox_8_7()
																								: "");
																		sf1.getTextBox_8_8()
																				.setText(
																						mi.isNull(lda
																								.get(0)
																								.getTextBox_8_8()) ? lda
																								.get(0)
																								.getTextBox_8_8()
																								: "");

																	}

																}

															});
										} catch (LoggedInException e) {

											e.printStackTrace();
										}

										/*
										 * StudentForm sf = new StudentForm(si,
										 * ls); VerticalPanel vpp = sf.sform(si,
										 * ls);
										 * 
										 * 
										 * 
										 * 
										 * //sf.setNameOfSchool("Thaigaranarjdjdj"
										 * );
										 * 
										 * System.out.println("debug");
										 * tabPanel.add(vpp, "Edit Item");
										 * tabPanel.selectTab(2);
										 * 
										 * ListBox lb = sf.getNameOfSchool(); //
										 * String val =
										 * lb.getValue(lb.getSelectedIndex());
										 * lb.setItemSelected(4, true);
										 */

									}

								});

								flexSubmittedList.setWidget(row, 7, achor);
							}
						}

					});

		} catch (LoggedInException e) {

			e.printStackTrace();
		}

	}

	public void fillComboBox(final ListBox lb) {

		ArrayList<String> val = CourseList;
		for (int i = 0; i < val.size(); i++) {
			// System.out.println("val = "+val.get(i));

			Collections.sort(val);
			lb.insertItem(val.get(i), i);

		}
	}

	// //////////////////////////////////////////////////////
	public ListBox getNameOfSchool() {

		return cbUnivSchool;
	}

	int getCourseIndex(String name) {
		int idx = -1;

		ArrayList<String> clist = CourseList;

		for (int i = 0; i < clist.size(); i++) {
			if (name.equals(clist.get(i))) {
				idx = i;
				break;
			}

		}

		return idx;
	}

	public boolean isEditClicked() {
		return editClicked;
	}

	public void setEditClicked(boolean editClicked) {
		this.editClicked = editClicked;
	}

	public StudentData getOldData() {
		return oldData;
	}

	public void setOldData(StudentData oldData) {
		this.oldData = oldData;
	}

	public boolean isEditApplicationFlag() {
		return editApplicationFlag;
	}

	public void setEditApplicationFlag(boolean editApplicationFlag) {
		this.editApplicationFlag = editApplicationFlag;
	}

	// ////////////////////////////////////////////////////////////
	public void getImageEntries(final ServiceInitialization si,
			final LoginScreen lscr) {

		// retrieve image from server
		ImageData id = new ImageData();
		id.setEmail(lscr.getLemail());
		id.setFirstName(lscr.getLfirstName());
		id.setLastName(lscr.getLlastName());
		id.setName("sem1");

		try {
			si.getImageDataServiceAsync().readAllImage(id,
					new AsyncCallback<String[]>() {

						@Override
						public void onFailure(Throwable caught) {

							Window.alert("server error");
						}

						@Override
						public void onSuccess(String[] result) {
							String[] vid = result;
							gid = result;

							if (vid != null) {

								for (int i = 0; i < vid.length; i++) {

									if (vid[i] == null) {
										continue;
									}

									long img = Long.parseLong(vid[i]);

									switch (i) {

									case 0: {
										if (img != 0L) {
											btnView.setEnabled(true);
										}
										break;
									}

									case 1: {
										if (img != 0L) {
											btnView2.setEnabled(true);
										}
										break;
									}

									case 2: {
										if (img != 0L) {
											btnView3.setEnabled(true);
										}
										break;
									}

									case 3: {
										if (img != 0L) {
											btnView4.setEnabled(true);
										}
										break;
									}

									case 4: {
										if (img != 0L) {
											btnView5.setEnabled(true);
										}
										break;
									}

									case 5: {
										if (img != 0L) {
											btnView6.setEnabled(true);
										}
										break;
									}

									case 6: {
										if (img != 0L) {
											btnView7.setEnabled(true);
										}
										break;
									}

									case 7: {
										if (img != 0L) {
											btnView8.setEnabled(true);
										}
										break;
									}

									}

								}

							}

						}

					});
		} catch (LoggedInException e) {

			e.printStackTrace();
		}

	}

	void updateListBox(String st) {

		// If item is in the list then just return
		String fstr = st;

		int i = 0;
		for (i = 0; i < sf1.getComboBox_1_1().getItemCount(); i++) {
			String ss = sf1.getComboBox_1_1().getItemText(i);
			System.out.println("str = " + ss);

			if (fstr.equals(sf1.getComboBox_1_1().getItemText(i))) {
				Window.alert("found in list");
				return;
			}
		}

		sf1.getComboBox_1_1().insertItem(st, i);

		sf1.getComboBox_1_1().addItem(st);
		sf1.getComboBox_1_2().addItem(st);
		sf1.getComboBox_1_3().addItem(st);
		sf1.getComboBox_1_4().addItem(st);
		sf1.getComboBox_1_5().addItem(st);
		sf1.getComboBox_1_6().addItem(st);
		sf1.getComboBox_1_7().addItem(st);
		sf1.getComboBox_1_8().addItem(st);

		sf1.getComboBox_2_1().addItem(st);
		sf1.getComboBox_2_2().addItem(st);
		sf1.getComboBox_2_3().addItem(st);
		sf1.getComboBox_2_4().addItem(st);
		sf1.getComboBox_2_5().addItem(st);
		sf1.getComboBox_2_6().addItem(st);
		sf1.getComboBox_2_7().addItem(st);
		sf1.getComboBox_2_8().addItem(st);

		sf1.getComboBox_3_1().addItem(st);
		sf1.getComboBox_3_2().addItem(st);
		sf1.getComboBox_3_3().addItem(st);
		sf1.getComboBox_3_4().addItem(st);
		sf1.getComboBox_3_5().addItem(st);
		sf1.getComboBox_3_6().addItem(st);
		sf1.getComboBox_3_7().addItem(st);
		sf1.getComboBox_3_8().addItem(st);

		sf1.getComboBox_4_1().addItem(st);
		sf1.getComboBox_4_2().addItem(st);
		sf1.getComboBox_4_3().addItem(st);
		sf1.getComboBox_4_4().addItem(st);
		sf1.getComboBox_4_5().addItem(st);
		sf1.getComboBox_4_6().addItem(st);
		sf1.getComboBox_4_7().addItem(st);
		sf1.getComboBox_4_8().addItem(st);

		sf1.getComboBox_5_1().addItem(st);
		sf1.getComboBox_5_2().addItem(st);
		sf1.getComboBox_5_3().addItem(st);
		sf1.getComboBox_5_4().addItem(st);
		sf1.getComboBox_5_5().addItem(st);
		sf1.getComboBox_5_6().addItem(st);
		sf1.getComboBox_5_7().addItem(st);
		sf1.getComboBox_5_8().addItem(st);

		sf1.getComboBox_6_1().addItem(st);
		sf1.getComboBox_6_2().addItem(st);
		sf1.getComboBox_6_3().addItem(st);
		sf1.getComboBox_6_4().addItem(st);
		sf1.getComboBox_6_5().addItem(st);
		sf1.getComboBox_6_6().addItem(st);
		sf1.getComboBox_6_7().addItem(st);
		sf1.getComboBox_6_8().addItem(st);

		sf1.getComboBox_7_1().addItem(st);
		sf1.getComboBox_7_2().addItem(st);
		sf1.getComboBox_7_3().addItem(st);
		sf1.getComboBox_7_4().addItem(st);
		sf1.getComboBox_7_5().addItem(st);
		sf1.getComboBox_7_6().addItem(st);
		sf1.getComboBox_7_7().addItem(st);
		sf1.getComboBox_7_8().addItem(st);

		sf1.getComboBox_8_1().addItem(st);
		sf1.getComboBox_8_2().addItem(st);
		sf1.getComboBox_8_3().addItem(st);
		sf1.getComboBox_8_4().addItem(st);
		sf1.getComboBox_8_5().addItem(st);
		sf1.getComboBox_8_6().addItem(st);
		sf1.getComboBox_8_7().addItem(st);
		sf1.getComboBox_8_8().addItem(st);
	}

	public ArrayList<ArrayList<Integer>> getMlist() {
		return mlist;
	}

	public ArrayList<String> getDlist() {
		return dlist;
	}

}
