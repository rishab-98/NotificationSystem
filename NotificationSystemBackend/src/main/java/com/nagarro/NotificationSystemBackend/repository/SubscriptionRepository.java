package com.nagarro.NotificationSystemBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.NotificationSystemBackend.model.SubscriptionModel;

@Repository
public interface SubscriptionRepository extends JpaRepository<SubscriptionModel, String> {

	//public SubscriptionModel findByUsername(String username);
	public SubscriptionModel findByUsername(String username);
	public SubscriptionModel findByEvent(String username);
//	public SubscriptionModel findByNagarroNews(String username);
//	public SubscriptionModel findByNewPolicy(String username);
//	public SubscriptionModel findByHoliday(String username);
//	public SubscriptionModel findByUrgentHelp(String username);
	

	
}

