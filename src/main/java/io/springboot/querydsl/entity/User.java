package io.springboot.querydsl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "user", indexes = { 
	@Index(name = "name", columnList = "name", unique = true),
})
@org.hibernate.annotations.Table(appliesTo = "user", comment = "用户")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5342379801159855228L;

	@Id
	@Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// 昵称
	@Column(columnDefinition = "VARCHAR(20) COMMENT '昵称'", nullable = false)
	private String name;

	// 性别
	@Column(columnDefinition = "TINYINT(1) unsigned COMMENT '性别。0：女，1：男，2：未知'", nullable = false)
	private Gender gender;

	// 账户是否已经验证
	@Column(columnDefinition = "TINYINT(1) unsigned COMMENT '账户是否已经验证'", nullable = false)
	private Boolean validated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Boolean getValidated() {
		return validated;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	// 性别枚举
	public static enum Gender {
		GIRL, BOY, UNKNOWN
	}
}
