package io.springboot.querydsl.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.querydsl.jpa.impl.JPAQueryFactory;

import io.springboot.querydsl.QueryDslAppliccation;
import io.springboot.querydsl.entity.QUser;
import io.springboot.querydsl.entity.User;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = QueryDslAppliccation.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class QueryDslApplicationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(QueryDslApplicationTest.class);
	
	@Autowired
	private JPAQueryFactory jpaQueryFactory;

	@Test
	public void test () {
		QUser qUser = QUser.user;
		User user = this.jpaQueryFactory.select(qUser).from(qUser).where(qUser.id.eq(1)).fetchFirst();
		LOGGER.info("user={}", user);
	}
}
