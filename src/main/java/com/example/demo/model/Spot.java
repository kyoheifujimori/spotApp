package com.example.demo.model;

import com.example.demo.data.SpotDataInterface;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "spot")
public class Spot implements SpotDataInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "spot_id")
	private int SpotId;

	@Column(nullable = false)
	private String SpotName;

	@Column(nullable = false)
	private String SpotAddress;

	@Column(nullable = false)
	private String SpotExplanation;

	@Column(nullable = true)
	private String SpotPicture;

	@Column(updatable = false, insertable = false)
	private String UserName;

	@ManyToOne
	@JoinColumn(name = "UserName")
	private User user;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getSpotId() {
		return SpotId;
	}

	public void setSpotId(int spotId) {
		SpotId = spotId;
	}

	public String getSpotName() {
		return SpotName;
	}

	public void setSpotName(String spotName) {
		SpotName = spotName;
	}

	public String getSpotAddress() {
		return SpotAddress;
	}

	public void setSpotAddress(String spotAddress) {
		SpotAddress = spotAddress;
	}

	public String getSpotExplanation() {
		return SpotExplanation;
	}

	public void setSpotExplanation(String spotExplanation) {
		SpotExplanation = spotExplanation;
	}

	public String getSpotPicture() {
		return SpotPicture;
	}

	public void setSpotPicture(String spotPicture) {
		SpotPicture = spotPicture;
	}

}
