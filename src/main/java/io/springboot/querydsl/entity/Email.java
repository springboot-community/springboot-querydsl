package io.springboot.querydsl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "email", indexes = { 
	@Index(name = "userEmailAccount", columnList = "user_id,account", unique = true), 
	@Index(name = "account", columnList = "account")
})
@org.hibernate.annotations.Table(appliesTo = "email", comment = "用户邮箱")
public class Email extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -730436482990380359L;

	@Id
	@Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// 用户id
	@Column(name = "user_id", columnDefinition = "INT(11) UNSIGNED COMMENT '用户id'")
	private Integer userId;

	// 邮箱账户
	@Column(name = "account", columnDefinition = "VARCHAR(20) COMMENT '昵称'", nullable = false)
	private String account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
