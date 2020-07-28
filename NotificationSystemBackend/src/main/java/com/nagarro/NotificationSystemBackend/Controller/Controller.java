package com.nagarro.NotificationSystemBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.NotificationSystemBackend.Enumerator.Type;
import com.nagarro.NotificationSystemBackend.interfaces.Channel;
import com.nagarro.NotificationSystemBackend.model.NotificationModel;
import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;
import com.nagarro.NotificationSystemBackend.service.NotificationFactory;
import com.nagarro.NotificationSystemBackend.service.NotificationService;
import com.nagarro.NotificationSystemBackend.service.SubscriptionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

	@Autowired
	NotificationFactory Nfactory;

	@Autowired
	NotificationService service;
	
	@Autowired
	SubscriptionService subService;
	
	

	@PostMapping("/")
	public String notify(@RequestBody NotificationModel model) {
		Type type = Type.valueOf(model.getType());
		service.saveNotification(model);
		Channel ch = Nfactory.getNotification(type);
		List<SubscriptionModel>list = subService.getAll();
		ch.notify(list, model.getContent());
		return "Data Recieved";
	}

	@GetMapping("/showNotifications")
	public List<NotificationModel> getNotifications() {
		List<NotificationModel> model = service.getData();
		return model;
	}

	@PatchMapping("/deleteNotifications")
	public String removeNotifications(@RequestBody int id) {
		System.out.println(id);
		service.delete(id);
		return "Deleted";
	}
	
	@PatchMapping("/editSubscriptions")
	public String editSubscribers(@RequestBody SubscriptionModel model) {
		subService.Subscribe(model);
		return "Edited Successfully";
		
	}

}
