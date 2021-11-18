package edu.uc.cech.agrawadv.eventorganizer.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private int userId;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;

	public User() {

	}

	public User(int userId, String name, String username, String password, String role) {
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getRole() {
		return role;
	}

	public Boolean checkPassword(String attempt) {
		return password.equals(attempt);
	}
}
