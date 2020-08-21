package io.springboot.querydsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "io.springboot.querydsl.repository" })
@EntityScan(basePackages = { "io.springboot.querydsl.entity" })
public class QueryDslAppliccation {
	
	public static void main(String[] args) {
		SpringApplication.run(QueryDslAppliccation.class, args);
	}
}
