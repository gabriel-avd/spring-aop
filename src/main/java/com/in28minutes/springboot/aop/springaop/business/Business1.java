package com.in28minutes.springboot.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in28minutes.springboot.aop.springaop.data.*;

@Service
public class Business1 {
	@Autowired
	Dao1 dao1;
	public String calculateSomething() {
		//Business Logic
		return dao1.retreiveData();
	}
}
