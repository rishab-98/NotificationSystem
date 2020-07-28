package com.nagarro.NotificationSystemBackend.DerivedClasses;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;
import com.nagarro.NotificationSystemBackend.service.SubscriptionService;

public class Event implements Channel {
	String content;
	public ArrayList<String> emailList = new ArrayList<>();

	NotificationManager manager = new NotificationManager();

	public Event() {

	}

	public Event(String content) {
	}

	@Override
	public String subscribe(String name) {
		emailList.add(name);
		return null;
	}

	@Override
	public String unSubscribe(String name) {
		emailList.remove(name);
		return null;
	}

	@Override
	public String notify(List<SubscriptionModel> list, String content) {
		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i).getEvent()) {
			case "Subscribe": {
				subscribe(list.get(i).getUsername());
			}

			}
		}

		manager.sendEmail(emailList, content);
		manager.sendPortalMsg(emailList, content);
		return null;
	}

}
