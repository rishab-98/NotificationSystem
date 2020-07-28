package com.nagarro.NotificationSystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.model.NotificationModel;
import com.nagarro.NotificationSystemBackend.repository.NotificationRepository;

@Service
public class NotificationService {
//
	@Autowired
	NotificationRepository repository ;
	
	public void saveNotification(NotificationModel model) {
		repository.save(model);
		
	}

	public List<NotificationModel> getData() {
		List<NotificationModel> model = repository.findAll();
		return model;
		
	}

	public void delete(int i) {
		// TODO Auto-generated method stub
		repository.deleteById(i);
		
	}

}
