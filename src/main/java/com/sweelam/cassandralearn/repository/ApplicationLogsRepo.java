package com.sweelam.cassandralearn.repository;

import com.sweelam.cassandralearn.entity.ApplicationLogs;
import com.sweelam.cassandralearn.entity.ApplicationLogsPK;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationLogsRepo extends CrudRepository<ApplicationLogs, ApplicationLogsPK> {
}
