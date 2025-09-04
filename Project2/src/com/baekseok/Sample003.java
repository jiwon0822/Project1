package com.baekseok;

import java.util.HashSet;

public class Sample003 {

	public static void main(String[] args) {
		
		HashSet<String> bookset = new HashSet<String>();
		bookset.add("책100");
		bookset.add("책2");
		bookset.add("책3");
		bookset.add("책3");
		for (String b : bookset) {
			System.out.println(b);
		}
		
		
	}

}
