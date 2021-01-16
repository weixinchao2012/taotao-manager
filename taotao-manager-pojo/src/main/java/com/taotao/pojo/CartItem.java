package com.taotao.pojo;

public class CartItem {

	private long id;
	private String title;
	private Integer num;
	private long price;
	private String image;	
	private String[] images;
	public String[] getImages() {
		if(image==null)
		{ return null; } 
		String[] imges=image.split(","); 
		return imges; 
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	/*
	 * public String[] getImges() { if(image==null) { return null; } String[]
	 * imges=image.split(","); return imges; }
	 */
}
