package com.sms.reminder.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.reminder.model.ReminderInfo;
import com.sms.reminder.repository.ReminderRepository;
import com.sms.reminder.service.ReminderService;

@Service
public class ReminderServiceImpl implements ReminderService {

	@Autowired
	private ReminderRepository reminderRepository;

	@Override
	public ReminderInfo createReminderInfo(ReminderInfo reminder) {
		return reminderRepository.save(reminder);
	}

	@Override
	public List<ReminderInfo> getAllReminderInfo() {
		return (List<ReminderInfo>) reminderRepository.findAll();
	}

	@Override
	public ReminderInfo getReminderInfoById(Long id) {
		//Long idL = id.matches("\\d*") ? Long.valueOf(id) : 0;
		Optional<ReminderInfo> reminder = reminderRepository.findById(id);
		return reminder.orElse(null);
	}

	@Override
	public boolean deleteReminderInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
