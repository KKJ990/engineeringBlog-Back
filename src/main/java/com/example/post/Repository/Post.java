package com.example.post.Repository;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Post {
	
	private int postid;
	private String posttitle;
	private String postdetail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate postdate;
	
	
	
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getPosttitle() {
		return posttitle;
	}
	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}
	public String getPostdetail() {
		return postdetail;
	}
	public void setPostdetail(String postdetail) {
		this.postdetail = postdetail;
	}
	public LocalDate getPostdate() {
		return postdate;
	}
	public void setPostdate(LocalDate postdate) {
		this.postdate = postdate;
	}
	
	
	
	
	

}
