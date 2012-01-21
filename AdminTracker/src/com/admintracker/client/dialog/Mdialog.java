package com.admintracker.client.dialog;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;

public class Mdialog extends DialogBox {
	private Mdialog md;
	private Button btnOk;
	private Button btnCancel;
	private boolean flg;
	private boolean nflag;
	
	public Mdialog() {
		md = this;
		
		//setHTML(name);
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		setWidget(horizontalPanel);
		horizontalPanel.setSize("100%", "100%");
		
		btnOk = new Button("New button");
		btnOk.setText("Ok");
		horizontalPanel.add(btnOk);
		
		Label label = new Label("");
		horizontalPanel.add(label);
		label.setWidth("20px");
		
		btnCancel = new Button("New button");
		btnCancel.setText("Cancel");
		horizontalPanel.add(btnCancel);
		
				
	}
	public Mdialog getMd() {
		return md;
	}
	public void setMd(Mdialog md) {
		this.md = md;
	}
	public Button getBtnOk() {
		return btnOk;
	}
	public void setBtnOk(Button btnOk) {
		this.btnOk = btnOk;
	}
	public Button getBtnCancel() {
		return btnCancel;
	}
	public void setBtnCancel(Button btnCancel) {
		this.btnCancel = btnCancel;
	}
	public boolean isFlg() {
		return flg;
	}
	public void setFlg(boolean flg) {
		this.flg = flg;
	}
	public boolean isNflag() {
		return nflag;
	}
	public void setNflag(boolean nflag) {
		this.nflag = nflag;
	}

	 
}
