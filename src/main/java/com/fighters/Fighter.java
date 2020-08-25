package com.fighters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FighterZ")
public class Fighter {

	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String pass;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public Fighter() {
		super();
	}

	@Override
	public String toString() {
		return "Fighter [id=" + id + ", userName=" + userName + ", pass=" + pass + ", fName=" + fName + ", lName="
				+ lName + ", nickName=" + nickName + ", gender=" + gender + "]";
	}
	
	public Fighter(int id, String userName, String pass, String fName,
			String lName, String nickName, int gender) {
		
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
		this.fName = fName;
		this.lName = lName;
		this.nickName = nickName;
		this.gender = gender;
		
	}

}