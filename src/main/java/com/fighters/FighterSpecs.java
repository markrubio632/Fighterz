package com.fighters;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "FighterZ_Specs")
public class FighterSpecs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "spec_id")
	private int specId;
	@Column(name = "user_record")
	private String record;
	@Lob
	@Column(name = "user_img")
	private byte[] image;
	@Column(name = "user_style")
	private String style;
	@Column(name = "user_height")
	private double height;
	@Column(name = "user_weight")
	private double weight;
	@Column(name = "user_about")
	private String about;

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

	public String getAbout() {
		return about;
	}

	public void setAboutMe(String aboutMe) {
		this.about = aboutMe;
	}

	public FighterSpecs(int specId, String record, byte[] image, String style, double height, double weight,
			String about) {
		super();
		this.specId = specId;
		this.record = record;
		this.image = image;
		this.style = style;
		this.height = height;
		this.weight = weight;
		this.about = about;
	}

	@Override
	public String toString() {
		return "FighterSpecs [specId=" + specId + ", record=" + record + ", image=" + Arrays.toString(image)
				+ ", style=" + style + ", height=" + height + ", weight=" + weight + ", about=" + about + "]";
	}

}
