package com.ailogmonitor.repositories;

import com.ailogmonitor.entities.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
    // Buraya özel sorgular eklenebilir, şimdilik CRUD yeterli
}
