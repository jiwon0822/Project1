package com.baekseok;

import java.util.HashMap;

public class Sample004 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = 
				new HashMap<String, String>();
		map.put("52318213", "정용한");
		map.put("20222638", "이지원");
		
		System.out.println(map.get("52318213"));
		
		
	}

}
