package com.nagarro.NotificationSystemBackend.interfaces;

import java.util.List;

import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;

public interface Channel {
	public String subscribe(String name);
	public String unSubscribe(String name);
	public String notify(List<SubscriptionModel>list, String content);
}
