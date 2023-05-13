package com.skilldistillery.sneakercollection.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Sneaker {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	private String brand;
	private String style;
	
	@Column(name="primary_color")
	private String primaryColor;
	
	@Column(name="secondary_color")
	private String secondaryColor;
	
	private String size;
	
	@Column(name="resale_value")
	private Double resaleValue;
	
	@Column(name="sneaker_image")
	private String sneakerImage;

	public Sneaker() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public String getSecondaryColor() {
		return secondaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getResaleValue() {
		return resaleValue;
	}

	public void setResaleValue(Double resaleValue) {
		this.resaleValue = resaleValue;
	}
	

	public String getSneakerImage() {
		return sneakerImage;
	}

	public void setSneakerImage(String sneakerImage) {
		this.sneakerImage = sneakerImage;
	}

	@Override
	public String toString() {
		return "Sneaker [id=" + id + ", brand=" + brand + ", style=" + style + ", primaryColor=" + primaryColor
				+ ", secondaryColor=" + secondaryColor + ", size=" + size + ", resaleValue=" + resaleValue + "]";
	}
	
	
}
