package com.tma.sale.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "role", schema = "public")
public class Role{

	private int roleId;
	private String roleName;
	private Date createdDate;
	private Set<User> users = new HashSet<User>(0);

	public Role() {
	}

	public Role(int roleId) {
		this.roleId = roleId;
	}

	public Role(int roleId, String roleName, Date createdDate, Set<User> users) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.createdDate = createdDate;
		this.users = users;
	}

	public Role(int roleId, String roleName, Date createdDate) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.createdDate = createdDate;
	}

	@Id
	@Column(name = "role_id", unique = true, nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "role_name", length = 0)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", length = 4)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
