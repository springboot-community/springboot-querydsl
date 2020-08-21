package io.springboot.querydsl.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "user_role", indexes = { 
	@Index(name = "roleId", columnList = "role_id"),
})
@org.hibernate.annotations.Table(appliesTo = "user_role", comment = "用户角色关联")
@IdClass(UserRole.Id.class)
public class UserRole extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1782979029236838525L;

	@Column(name = "user_id", columnDefinition = "INT(11) UNSIGNED COMMENT '用户ID'", nullable = false)
	@javax.persistence.Id
	private Integer userId;
	
	@javax.persistence.Id
	@Column(name = "role_id", columnDefinition = "INT(11) UNSIGNED COMMENT '角色ID'", nullable = false)
	private Integer roleId;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public static class Id implements Serializable {
		private static final long serialVersionUID = 2751217704686895162L;
		private Integer userId;
		private Integer roleId;
		public Id() {
		}
		public Id(Integer userId, Integer roleId) {
			super();
			this.userId = userId;
			this.roleId = roleId;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public Integer getRoleId() {
			return roleId;
		}
		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Id other = (Id) obj;
			if (roleId == null) {
				if (other.roleId != null)
					return false;
			} else if (!roleId.equals(other.roleId))
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			return true;
		}
	}
}
