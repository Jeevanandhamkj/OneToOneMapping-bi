package com.example.demo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Address")



public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="DoorNum")
	private int doorNum;
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
	private String city;
	@Column(name="PINCODE")
	private String pincode;
	@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL,mappedBy = "address")
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address(int doorNum, String street, String city, String pincode) {
		super();
		this.doorNum = doorNum;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	

}
