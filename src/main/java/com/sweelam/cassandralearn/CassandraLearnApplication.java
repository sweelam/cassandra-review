package com.sweelam.cassandralearn;

import com.sweelam.cassandralearn.entity.ApplicationLogs;
import com.sweelam.cassandralearn.entity.ApplicationLogsPK;
import com.sweelam.cassandralearn.repository.ApplicationLogsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraLearnApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(CassandraLearnApplication.class, args);
	}

	@Autowired
	ApplicationLogsRepo applicationLogsRepo;


	@Override
	public void run(ApplicationArguments args) throws Exception {
		applicationLogsRepo.save(
				ApplicationLogs.builder()
						.applicationLogsPK(
								ApplicationLogsPK.builder()
										.applicationName("cassandra-demo")
										.hostName("msweelam-machine")
										.environment("development")
										.build())
						.logLine("Warn this if for testing !!!")
						.build()
		);
	}
}
