package com.spring.boot.all.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")
public class UserAddress {

	@Id
	@Column(name = "id_address")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String address;

	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", address=" + address + "]";
	}

}
