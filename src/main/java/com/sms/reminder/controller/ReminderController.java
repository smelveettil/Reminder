package com.sms.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.reminder.model.ReminderInfo;
import com.sms.reminder.service.ReminderService;

@CrossOrigin("*")
@RestController
public class ReminderController {
	@Autowired
    private ReminderService reminderService;

    @PostMapping("/reminder")
    public ResponseEntity<ReminderInfo> saveOrder(@RequestBody ReminderInfo remindrInfo) {
        return new ResponseEntity<>(reminderService.createReminderInfo(remindrInfo), HttpStatus.OK);
    }

    @GetMapping("/reminder")
    public ResponseEntity<List<ReminderInfo>> getAllReminderInfo() {
        return new ResponseEntity<>(reminderService.getAllReminderInfo(), HttpStatus.OK);
    }

    @GetMapping("/reminder/{id}")
    public ResponseEntity<ReminderInfo> getOrderById(@PathVariable Long id) {
        return new ResponseEntity<>(reminderService.getReminderInfoById(id), HttpStatus.OK);

    }

    @DeleteMapping("/reminder/{id}")
    public boolean deleteOrder(@PathVariable String id) {
        return reminderService.deleteReminderInfo(id);
    }
}
