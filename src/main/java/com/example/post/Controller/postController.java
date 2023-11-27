package com.example.post.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.post.Repository.Post;
import com.example.post.Repository.PostRepository;
import com.example.post.Service.PostService;

import jakarta.websocket.server.PathParam;

@RestController
public class postController {

	@Autowired
	private PostService postService;

	
	@RequestMapping("post")

	public ArrayList<Post> findAll() {

		return postService.findAll();

	}

	@RequestMapping("/")
	public void first() {
		
	}
	
	@RequestMapping("Login.do")
	public String Login() {
		
		System.out.println("로그인동작");
		
		
		return "redirect:/";
	}
	

	@RequestMapping("addpost")
	public ArrayList<Post> AddPost(@RequestBody Post post) {

		System.out.println(post.getPostdate());
		postService.AddPost(post);
		return postService.findAll();
	}

	@RequestMapping("deletepost/{postid}")
	public ArrayList<Post> DeletePost(@PathVariable Integer postid) {
		
		
		System.out.println(postid);
		postService.deletePost(postid);
		
		return postService.findAll();
	}
	
	@RequestMapping("findbyid")
	public ArrayList<Post> findById(@RequestBody Integer postid){
		
		System.out.println(postid);
		return postService.findbyId(postid);
		
	}
	
	
}
