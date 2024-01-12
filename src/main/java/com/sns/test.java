package com.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.mapper.PostMapper;
import java.util.List;
import java.util.Map;

@Controller
public class test {
	@Autowired
	private PostMapper postMapper;
	
	@GetMapping("/test1")
	@ResponseBody
	public String test1() {
		return "Hello World!";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test/test";
	}
	
	@GetMapping("/test3")
	@ResponseBody
	public List<Map<String, Object>> test3(){
		return postMapper.selectPostList();
	}
}
