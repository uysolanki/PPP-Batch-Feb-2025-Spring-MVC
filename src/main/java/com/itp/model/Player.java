package com.itp.model;

public class Player {
	private int pno;
	private String pname;
	private String image;
	private String info;
	
	public Player() {}

	public Player(int pno, String pname, String image, String info) {
		super();
		this.pno=pno;
		this.pname = pname;
		this.image = image;
		this.info = info;
	}
	

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
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
		return "Player [pno=" + pno + ", pname=" + pname + ", image=" + image + ", info=" + info + "]";
	}

	
	
}
