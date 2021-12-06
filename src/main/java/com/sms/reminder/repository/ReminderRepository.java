package com.sms.reminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.reminder.model.ReminderInfo;

@Repository
public interface  ReminderRepository extends JpaRepository<ReminderInfo, Long>{
	
}
