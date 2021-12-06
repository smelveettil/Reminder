package com.sms.reminder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reminder_Info")
public class ReminderInfo {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "reminder_type")
	private String reminderType;
	@Column(name = "reminder_desc")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReminderType() {
		return reminderType;
	}

	public void setReminderType(String reminderType) {
		this.reminderType = reminderType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ReminderInfo [id=" + id + ", reminderType=" + reminderType + ", description=" + description + "]";
	}
	
	

}
