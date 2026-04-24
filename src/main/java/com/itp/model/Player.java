package com.itp.model;

public class Player {
	private String pname;
	private String image;
	private String info;
	
	public Player() {}

	public Player(String pname, String image, String info) {
		super();
		this.pname = pname;
		this.image = image;
		this.info = info;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Player [pname=" + pname + ", image=" + image + ", info=" + info + "]";
	}
	
}
