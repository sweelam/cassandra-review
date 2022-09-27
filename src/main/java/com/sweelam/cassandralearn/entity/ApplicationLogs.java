package com.sweelam.cassandralearn.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;

@Data
@Builder
@EqualsAndHashCode
@Table("application_logs")
public class ApplicationLogs {
    @PrimaryKey
    private ApplicationLogsPK applicationLogsPK;

    @Column(value = "log_line")
    private String logLine;

    @Column(value = "event_time")
    @Builder.Default
    private Instant eventTime = Instant.now();
}
