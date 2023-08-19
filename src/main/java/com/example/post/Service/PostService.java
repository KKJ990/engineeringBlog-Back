package com.example.post.Service;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.post.Repository.Post;
import com.example.post.Repository.PostRepository;

@Service
@MapperScan("com.example.post.Repository")
public class PostService {
	
	
	private final PostRepository postRepository;
	
	
	@Autowired
	public PostService(PostRepository postRepository) {
		
		this.postRepository = postRepository;
		
	}
	
	public ArrayList<Post> findAll(){
		
		
		return postRepository.findAll();
	}
	
	public ArrayList<Post> findbyId(Integer postid){
		
		return postRepository.findById(postid);
	}
	
	public void AddPost(Post post) {
		
		
		postRepository.savePost(post);
		
	}
	
	public void deletePost(Integer postid) {
		postRepository.deletePost(postid);


}
}
