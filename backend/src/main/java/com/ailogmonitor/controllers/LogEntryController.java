package com.ailogmonitor.controllers;

import com.ailogmonitor.entities.LogEntry;
import com.ailogmonitor.repositories.LogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogEntryController {

    @Autowired
    private LogEntryRepository logEntryRepository;

    // Tüm logları getirir
    @GetMapping
    public List<LogEntry> getAllLogs() {
        return logEntryRepository.findAll();
    }

    // Yeni log ekler
    @PostMapping
    public LogEntry createLog(@RequestBody LogEntry logEntry) {
        return logEntryRepository.save(logEntry);
    }
}
