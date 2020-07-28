package com.nagarro.NotificationSystemBackend.DerivedClasses;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.interfaces.Notification;
import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;

public class Holiday implements Channel{
String content;
ArrayList<String> holidayList = new ArrayList<>();
NotificationManager manager = new NotificationManager();

	public Holiday() {

	}

	@Override
	public String subscribe(String name) {
		holidayList.add(name);
		return null;
	}

	@Override
	public String unSubscribe(String name) {
		holidayList.remove(name);
		return null;
	}

	@Override
	public String notify(List<SubscriptionModel> list, String content) {
		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i).getHoliday()) {
			case "Subscribe": {
				subscribe(list.get(i).getUsername());
			}

			}
		}

		manager.sendPortalMsg(holidayList, content);
	
		return null;
	}

	



}
