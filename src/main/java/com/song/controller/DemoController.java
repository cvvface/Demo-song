package com.song.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/huhu")
public class DemoController {
	
	
	@RequestMapping("/aa")
	public String tt(){
		return "woshihouhouaaaaa";
	}
	
	@RequestMapping("/bb")
	public String ttw(){
		return "woshihouhoubbbbb";
	}

}
