package com.kosmo.project;

import java.io.Serializable;

public class ProjectVO implements Serializable{
	
	private String cname;
	private	int crispy;
	private	int price;
	private	int amount;
	private	int type;
	private	int kind;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCrispy() {
		return crispy;
	}
	public void setCrispy(int crispy) {
		this.crispy = crispy;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}

}
