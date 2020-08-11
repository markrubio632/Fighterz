package com.fighters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FighterZ")
public class Fighter {

	@Id
	@GeneratedValue
	private int id;
	private String fName;
	private String lName;
	private String nickName;
	// int 1=male, 2=female, etc.
	private int gender;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Fighter(int id, String fName, String nickName, String lName, int gender) {
		super();
		this.id = id;
		this.fName = fName;
		this.nickName = nickName;
		this.lName = lName;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Fighter [id=" + id + ", fName=" + fName + ", nickName=" + nickName + ", lName=" + lName + ", gender="
				+ gender + "]";
	}
	
	
}