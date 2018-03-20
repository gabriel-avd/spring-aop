package com.in28minutes.springboot.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in28minutes.springboot.aop.springaop.data.*;

@Service
public class Business2 {
	@Autowired
	Dao2 dao2;
	public String calculateSomething() {
		//Business Logic
		return dao2.retreiveData();
	}
}