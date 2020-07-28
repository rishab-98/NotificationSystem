package com.nagarro.NotificationSystemBackend.service;

import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.DerivedClasses.Event;
import com.nagarro.NotificationSystemBackend.DerivedClasses.Holiday;
import com.nagarro.NotificationSystemBackend.DerivedClasses.NagarroNews;
import com.nagarro.NotificationSystemBackend.DerivedClasses.NewPolicy;
import com.nagarro.NotificationSystemBackend.DerivedClasses.UrgentHelp;
import com.nagarro.NotificationSystemBackend.Enumerator.Type;
import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.model.NotificationModel;

@Service
public class NotificationFactory {
	
	public Channel getNotification(Type type) {
		//String Ntype=model.getType();
		switch(type) {
		
		case Event:{
			return new Event();
		}
		case Holiday:{
			return new Holiday();
		}
		case UrgentHelp:{
			return new UrgentHelp();
		}
		case NagarroNews:{
			return new NagarroNews();
		}
		case NewPolicy:{
			return new NewPolicy();
		}
	}
		return null;
	
	}

}
