package com.nagarro.NotificationSystemBackend.DerivedClasses;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.interfaces.Notification;
import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;

public class NagarroNews implements Channel{
	String content;
	ArrayList<String> newsList = new ArrayList<>();
	NotificationManager manager = new NotificationManager();

	public NagarroNews() {

	}

	@Override
	public String subscribe(String name) {
		newsList.add(name);
		return null;
	}

	@Override
	public String unSubscribe(String name) {
		newsList.remove(name);
		return null;
	}

	@Override
	public String notify(List<SubscriptionModel> list, String content) {
		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i).getNagarroNews()) {
			case "Subscribe": {
				subscribe(list.get(i).getUsername());
			}

			}
		}
		manager.sendEmail(newsList, content);
		manager.sendPortalMsg(newsList, content);
		return null;
	}

	
}
