package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
public void setDate(Date date) {
	System.out.println("WishMessageGenerator.setDate(-)");
	this.date=date;
}
public WishMessageGenerator(Date date) {
	System.out.println("WishMessageGenerator:1-param constructor");
	this.date=date;
}
public String generateWishMessage(String user) {
	System.out.println("WishMessageGenerator.generateWishMessage():::"+date);
	int hour=date.getHours();
	if(hour<12)
	return "Good Morning::"+user;
	else if(hour<16)
		return "Good AfterNoon::"+user;
	else if(hour<20)
		return "Good Evening::"+user;
	else
		return "Good Night::"+user;
	}
}
