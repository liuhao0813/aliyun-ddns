package com.anjiel.aliyun.ddns.aliyunddns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class AliyunDnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliyunDnsApplication.class, args);
	}

}
