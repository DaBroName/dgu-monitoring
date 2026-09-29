package com.dabro.dgu.dgu_monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Включаем планировщик для опроса контроллеров
public class DguMonitoringApplication {

	public static void main(String[] args) {

		SpringApplication.run(DguMonitoringApplication.class, args);
	}

}
