package com.admintracker.client.mail;

import com.admintracker.client.exception.LoggedInException;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MailServiceAsync {
	void sendMail(MailServiceData ms,AsyncCallback<String> callback)throws LoggedInException;
}
