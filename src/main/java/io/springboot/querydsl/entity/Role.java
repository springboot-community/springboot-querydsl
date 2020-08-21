package io.springboot.querydsl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "role", indexes = { 
	@Index(name = "name", columnList = "name", unique = true),
})
@org.hibernate.annotations.Table(appliesTo = "role", comment = "角色")
public class Role extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1749885146919803064L;

	@Id
	@Column(columnDefinition = "INT(11) UNSIGNED COMMENT 'id'")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// 名称
	@Column(columnDefinition = "VARCHAR(20) COMMENT '名称'", nullable = false)
	private String name;

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
}
