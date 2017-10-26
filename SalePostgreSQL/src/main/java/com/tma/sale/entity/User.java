package com.tma.sale.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = "password"),
		@UniqueConstraint(columnNames = "username") })
public class User {
	private int userId;
	private String name;
	private String username;
	private String password;
	private Set<Role> roles = new HashSet<Role>(0);

	public User() {
	}

	public User(int userId, String username, String password) {
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public User(int userId, String name, String username, String password, Set<Role> roles) {
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "name", length = 1)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "username", unique = true, nullable = false, length = 1)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", unique = true, nullable = false, length = 1)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", schema = "public", joinColumns = {
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
