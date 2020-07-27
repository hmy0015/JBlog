package com.javaex.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BlogDao;
import com.javaex.vo.BlogVo;
import com.javaex.vo.CategoryVo;
import com.javaex.vo.PostVo;

@Service
public class BlogService {
	@Autowired
	private BlogDao blogDao;

	// service - 블로그 정보 가져오기
	public BlogVo getBlogInfo(String id) {
		System.out.println("1. service - 블로그 정보 가져오기");

		return blogDao.getBlogInfo(id);
	}
	
	// service
	
}
