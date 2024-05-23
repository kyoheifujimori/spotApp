package com.example.demo.model;

import com.example.demo.data.UserDataInterface;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User implements UserDataInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int UserId;

	@Column(nullable = false)
	private String UserName;

	@Column(nullable = false)
	private String UserPassword;

	@Column(nullable = false)
	private String Email;

	//	@OneToMany(mappedBy = "user")
	//	private List<Spot> spotDataList;

	//	public List<Spot> getSpotDataList() {
	//		return spotDataList;
	//	}
	//
	//	public void setSpotDataList(List<Spot> spotDataList) {
	//		this.spotDataList = spotDataList;
	//	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
