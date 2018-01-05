package org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user")
public class Users {
	@Id
	private String username;
	private String password;
	@Column(name="BOOK_IMAGE", nullable=false, columnDefinition="mediumblob")
	private  byte[] photo;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] bFile) {
		this.photo = bFile;
	}
	
}
