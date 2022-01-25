package com.springcore;

public class beanlifecycle {
	private String bookname;
	private double bookprice;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "beanlifecycle [bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	public beanlifecycle(String bookname, double bookprice) {
		super();
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public beanlifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void BookAuthor()
	{
		System.out.println("The author of this book is:Joseph Murphy ");
	}
	public void BookStatus()
	{
		System.out.println("The status of this book is out of stock");
	}
	

}
