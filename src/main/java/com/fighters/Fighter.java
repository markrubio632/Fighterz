package com.fighters;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FighterZ")
public class Fighter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_pass")
	private String pass;
	@Column(name = "user_first")
	private String fName;
	@Column(name = "user_last")
	private String lName;
	@Column(name = "user_nick")
	private String nickName;
	// int 1=male, 2=female, etc.
	@Column(name = "user_gender")
	private String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Fighter() {
		super();
	}

	@Override
	public String toString() {
		return "Fighter [id=" + id + ", userName=" + userName + ", pass=" + pass + ", fName=" + fName + ", lName="
				+ lName + ", nickName=" + nickName + ", gender=" + gender + "]";
	}

	public Fighter(Integer id, String userName, String pass, String fName, String lName, String nickName, String gender) {

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