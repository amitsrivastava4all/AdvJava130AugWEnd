package com.srivastava.apps;

public class ProductDTO {
	private int id;
	private String name;
	private String desc;
	private double price;
	private String imagePath;
	public ProductDTO(int id, String name, String desc , double price, String imagePath){
		this.id = id;
		this.name = name;
		this.desc =desc;
		this.price = price;
		this.imagePath = imagePath;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + ", imagePath="
				+ imagePath + "]";
	}
	

}
