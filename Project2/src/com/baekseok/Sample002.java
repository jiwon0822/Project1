package com.baekseok;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Sample002 {

	public static void main(String[] args) {
		int i = 10;
		Integer j = 100; // Auto Boxing
		j = 200;
		System.out.println(i + 10);
//		System.out.println(j + 30);
		System.out.println(j); // Unboxing

//		 null : 값이 없음, 미정

		Date date = new Date(); // 현재 시간
		System.out.println(date.toString());
		System.out.println(date.getTime()); //에폭시
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date));
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.MONTH, 7); //8월
			
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("오늘은 " + year + "/" +month + "/" + day);
		String[] weekArr = {"일", " 월 ", "화", "수", "목", "금", "토"};
	    System.out.println("요일은" + weekArr[yoil-1]);
	
	   String myWish = "집에 가고싶다";
	   System.out.println(myWish);
	   
	  LocalDate date2 = LocalDate.now();
	  System.out.println(date2);
	  
	  LocalDateTime date3 = LocalDateTime.now();
	  System.out.println(date3);
	  
	  LocalDate date4 = LocalDate.of(2023, 03, 22);
	  System.out.println(date4);
	  
	  System.out.println("년도:" + date2.getYear());
	  System.out.println("월:" + date2.getMonthValue());
	  System.out.println("일:" + date2.getDayOfMonth());
	  System.out.println("요일:" + date2.getDayOfWeek());
	  
	  System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
			  .format(date3));


	  
	}
				
		}


