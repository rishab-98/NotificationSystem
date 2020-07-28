package com.nagarro.NotificationSystemBackend.DerivedClasses;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.interfaces.Notification;

@Service
public class NotificationManager implements Notification {

	@Override
	public String sendEmail(ArrayList list, String content) {
	
		for(int i=0;i<list.size();i++) {
			
			System.out.println("EMail sent to " + list.get(i)+ " Content: "+ content);
		}
		
		return "Email Sent";
	}

	@Override
	public String sendSMS(ArrayList list, String content) {
		for(int i=0;i<list.size();i++) {
			System.out.println("SMS sent to " + list.get(i)+ " Content: "+ content);
		}
		
		return "SMS Sent";
	}

	@Override
	public String sendPortalMsg(ArrayList list, String content) {
		for(int i=0;i<list.size();i++) {
			System.out.println("Portal Message sent to " + list.get(i)+ " Content: "+ content);
		}
		return "Portal Notification Sent";
	}

}
