package com.baekseok;

import java.net.MalformedURLException;
import java.net.URL;

public class Sample007 {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("https://www.naver.com");
			System.out.println(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("URL형식이 잘못되었습니다.");
			e.printStackTrace();
		}
		
	
	}

}
