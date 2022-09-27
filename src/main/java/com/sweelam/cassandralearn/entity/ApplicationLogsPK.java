package com.sweelam.cassandralearn.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
@Data
@Builder
@PrimaryKeyClass
@EqualsAndHashCode
public class ApplicationLogsPK implements Serializable {
    @PrimaryKeyColumn(name = "app_name", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String applicationName;

    @PrimaryKeyColumn(name = "env", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String environment;

    @PrimaryKeyColumn(name = "host_name", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    private String hostName;
}
