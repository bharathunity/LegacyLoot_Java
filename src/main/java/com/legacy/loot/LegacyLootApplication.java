package com.legacy.loot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@ComponentScan("com.legacy.loot")
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class LegacyLootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegacyLootApplication.class, args);
	}

}
