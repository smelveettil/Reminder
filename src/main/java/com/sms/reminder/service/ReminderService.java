package com.sms.reminder.service;

import java.util.List;

import com.sms.reminder.model.ReminderInfo;

public interface ReminderService {

	ReminderInfo createReminderInfo(ReminderInfo reminder);

    List<ReminderInfo> getAllReminderInfo();

    ReminderInfo getReminderInfoById(Long id);

    boolean deleteReminderInfo(String id);
}
