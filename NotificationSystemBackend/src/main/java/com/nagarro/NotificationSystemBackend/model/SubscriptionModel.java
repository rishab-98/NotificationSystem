package com.nagarro.NotificationSystemBackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "subscription_data")
public class SubscriptionModel {
	@Id
	private String username;
	private String event;
	private String holiday;
	private String newPolicy;
	private String nagarroNews;
	private String urgentHelp;
	
	public SubscriptionModel() {
		
	}

	public SubscriptionModel(String username, String event, String holiday, String newPolicy, String nagarroNews,
			String urgentHelp) {
		super();
		this.username = username;
		this.event = event;
		this.holiday = holiday;
		this.newPolicy = newPolicy;
		this.nagarroNews = nagarroNews;
		this.urgentHelp = urgentHelp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getNewPolicy() {
		return newPolicy;
	}

	public void setNewPolicy(String newPolicy) {
		this.newPolicy = newPolicy;
	}

	public String getNagarroNews() {
		return nagarroNews;
	}

	public void setNagarroNews(String nagarroNews) {
		this.nagarroNews = nagarroNews;
	}

	public String getUrgentHelp() {
		return urgentHelp;
	}

	public void setUrgentHelp(String urgentHelp) {
		this.urgentHelp = urgentHelp;
	}
	

	
}
