package com.nagarro.NotificationSystemBackend.DerivedClasses;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;

public class UrgentHelp implements Channel {
	String content;
	ArrayList<String> helpList = new ArrayList<>();
	NotificationManager manager = new NotificationManager();

	public UrgentHelp() {

	}

	@Override
	public String subscribe(String name) {
		helpList.add(name);
		return null;
	}

	@Override
	public String unSubscribe(String name) {
		helpList.remove(name);
		return null;
	}

	@Override
	public String notify(List<SubscriptionModel> list, String content) {
		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i).getUrgentHelp()) {
			case "Subscribe": {
				subscribe(list.get(i).getUsername());
			}

			}
		}
		manager.sendEmail(helpList, content);
		manager.sendSMS(helpList, content);
		return null;
	}

}
