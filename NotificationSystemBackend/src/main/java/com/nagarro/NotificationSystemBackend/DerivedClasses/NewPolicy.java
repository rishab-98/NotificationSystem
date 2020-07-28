package com.nagarro.NotificationSystemBackend.DerivedClasses;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.interfaces.Notification;
import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;

public class NewPolicy implements Channel{
	String content;
	ArrayList<String> policyList = new ArrayList<>();
	NotificationManager manager = new NotificationManager();
	public NewPolicy() {

	}

	@Override
	public String subscribe(String name) {
		policyList.add(name);
		return null;
	}

	@Override
	public String unSubscribe(String name) {
		policyList.remove(name);
		return null;
	}

	@Override
	public String notify(List<SubscriptionModel> list, String content) {
		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i).getNewPolicy()) {
			case "Subscribe": {
				subscribe(list.get(i).getUsername());
			}

			}
		}
		manager.sendEmail(policyList, content);
		manager.sendPortalMsg(policyList, content);
		return null;
	}


}
