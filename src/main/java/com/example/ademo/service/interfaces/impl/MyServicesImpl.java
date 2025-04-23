package com.example.ademo.service.interfaces.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.ademo.service.interfaces.IMyService;

@Service
public class MyServicesImpl implements IMyService {
	
		private Random random;
	
		public MyServicesImpl(Random random) {
		System.out.println("MyServiceImpl || Constructor Invoked!!");
		this.random = random;
	}

	@Override
	public int add(int num1, int num2) {
		System.out.println("MyServiceImpl || add() invoked| num1: " + num1 + "| num2:" + num2);
		
		int sum = num1 + num2;
		System.out.println("MyServicesImpl||sum:" + sum);
		
		System.out.println("MyServicesImpl||hashCode:" + random.hashCode());
		sum  = sum + random.nextInt(100);
		
		return sum;
	}

}
