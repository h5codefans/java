package com.bjsxt.singleton;


public class Client {

    public static void main(String[] args) {
		SingletonDemo3 s1=SingletonDemo3.getInstance();
		SingletonDemo3 s2=SingletonDemo3.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(SingletonDemo4.INSTANCE==SingletonDemo4.INSTANCE);
		
		
	}
}
