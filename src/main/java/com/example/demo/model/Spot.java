package com.example.demo.model;

import com.example.demo.data.SpotDataInterface;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	//	@Column(nullable = true)
	//	private String SpotPicture;

	//	@Column(updatable = false, insertable = false)
	//	private int UserId;
	//
	//	@ManyToOne
	//	@JoinColumn(name = "UserId")
	//	private User user;

	//	public int getUserId() {
	//		return UserId;
	//	}
	//
	//	public void setUserId(int userId) {
	//		UserId = userId;
	//	}
	//
	//	public User getUser() {
	//		return user;
	//	}
	//
	//	public void setUser(User user) {
	//		this.user = user;
	//	}

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

	//	public String getSpotPicture() {
	//		return SpotPicture;
	//	}
	//
	//	public void setSpotPicture(String spotPicture) {
	//		SpotPicture = spotPicture;
	//	}

}
