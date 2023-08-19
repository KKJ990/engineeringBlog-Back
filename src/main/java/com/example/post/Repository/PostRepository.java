package com.example.post.Repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostRepository {
	
	
	public ArrayList<Post> findAll();
	public void savePost(Post post);
	public void deletePost(Integer postid);
	public ArrayList<Post> findById(Integer postid);
	public ArrayList<Post> Updatepost(Post post);

}
