package com.itp.model;

public class Player {
	private int jno;
	private String pname;
	
	public Player() {}
	public Player(int jno, String pname) {
		this.jno = jno;
		this.pname = pname;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + "]";
	}
	
	
}
