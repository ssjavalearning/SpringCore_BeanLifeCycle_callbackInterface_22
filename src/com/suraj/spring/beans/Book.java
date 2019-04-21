package com.suraj.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean{

	private Integer bookId;
	private String bookName;
	
	public Integer getBookId() {
		return bookId;
	}
	
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("book deposited to Library after reading the book...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Before book issued get authrized by Librarian...");
	}
	
}
