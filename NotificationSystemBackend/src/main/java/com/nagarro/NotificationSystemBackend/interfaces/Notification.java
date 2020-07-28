package com.nagarro.NotificationSystemBackend.interfaces;

import java.util.ArrayList;

public interface Notification {
	public String sendEmail(ArrayList list, String content);
	public String sendSMS(ArrayList list, String content);
	public String sendPortalMsg(ArrayList list, String content);
	
	
}
