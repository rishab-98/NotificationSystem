package com.nagarro.NotificationSystemBackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.NotificationSystemBackend.model.NotificationModel;



@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, Integer> {

	public NotificationModel findById(int id);
}
