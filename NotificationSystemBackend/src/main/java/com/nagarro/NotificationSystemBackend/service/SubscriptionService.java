package com.nagarro.NotificationSystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;
import com.nagarro.NotificationSystemBackend.repository.SubscriptionRepository;
@Service
public class SubscriptionService {
	@Autowired
	SubscriptionRepository repository;
	
//	Channel event = new Event();
//	Channel holiday = new Holiday();
//	Channel news = new NagarroNews();
//	Channel help = new UrgentHelp();
//	Channel policy = new NewPolicy();
	
	public void Subscribe(SubscriptionModel model) {
		System.out.println(model.getUsername() + " "+model.getEvent() + " for Email Notification");
		System.out.println(model.getUsername() + " "+model.getHoliday() + " for Holiday Notification");
		System.out.println(model.getUsername() + " "+model.getUrgentHelp() + " for Urgent Help Notification");
		System.out.println(model.getUsername() + " "+model.getNagarroNews() + " for nagarro News Notification");
		System.out.println(model.getUsername() + " "+model.getNewPolicy() + " for New Policy Notification");
	
		repository.save(model);
	}
	
	public SubscriptionModel getEvent(String name) {
		System.out.println(name);
		SubscriptionModel model= repository.findByEvent(name);
		System.out.println(model.getEvent());
		return model;
	}

	public List<SubscriptionModel> getAll() {
		List<SubscriptionModel> list = repository.findAll();
		System.out.println(list.get(0));
		return list;
		
	}
	

}
