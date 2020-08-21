package io.springboot.querydsl.configuration;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Configuration
public class JPAQueryFactoryConfiguration {
	
	@Bean
	public JPAQueryFactory jpaQueryFactory(@Autowired EntityManager entityManager) {
		return new JPAQueryFactory(entityManager);
	}
}
