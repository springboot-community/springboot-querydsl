package io.springboot.querydsl.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7054150882445633369L;

	// 创建时间
	@Column(columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'", nullable = false)
	private LocalDateTime createdDate;

	// 最后修改时间
	@Column(columnDefinition = "timestamp NULL DEFAULT NULL COMMENT '最后一次修改时间'")
	private LocalDateTime lastModifiedDate;

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
