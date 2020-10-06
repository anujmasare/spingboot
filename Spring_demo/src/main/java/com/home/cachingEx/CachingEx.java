package com.home.cachingEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingEx {

	@Autowired
	CacheBean cacheBean;
	
	@RequestMapping("/catch")
	@Cacheable(value ="info")
	public CacheBean getData(){
		System.out.println("TeSTING");
		cacheBean.setAge("10");
		cacheBean.setName("sandeep");
		return cacheBean;
	}
}
