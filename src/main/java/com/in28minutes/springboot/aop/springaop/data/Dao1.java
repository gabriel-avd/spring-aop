package com.in28minutes.springboot.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retreiveData() {
		return "get Data Dao1";
	}
}
