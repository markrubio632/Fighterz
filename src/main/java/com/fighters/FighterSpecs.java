package com.fighters;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="FighterZ_Specs")
public class FighterSpecs {
	
	@Id
	@GeneratedValue
	private int fighterId;
	private String record;
	@Lob
	@Column(name="fighter_img")
	private byte[] image;
	private String style;
	private double height;
	private double weight;
	private String aboutMe;
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public FighterSpecs(int fighterId, String record, byte[] image, String style, double height, double weight,
			String aboutMe) {
		super();
		this.fighterId = fighterId;
		this.record = record;
		this.image = image;
		this.style = style;
		this.height = height;
		this.weight = weight;
		this.aboutMe = aboutMe;
	}
	@Override
	public String toString() {
		return "FighterSpecs [fighterId=" + fighterId + ", record=" + record + ", image=" + Arrays.toString(image)
				+ ", style=" + style + ", height=" + height + ", weight=" + weight + ", aboutMe=" + aboutMe + "]";
	}
	
	

}
