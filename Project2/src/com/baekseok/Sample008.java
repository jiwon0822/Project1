package com.baekseok;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample008 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		in = new FileInputStream(new File(args[0]));
		out = new FileOutputStream(new File(args[1]));
		
		bis = new BufferedInputStream(in);
		bos = new BufferedOutputStream(out);
		
		int i = bis.read();
		while (i != -1)  {
			bos.write(i);
			i = in.read();
		}
		
		bis.close();
		bos.close(); // 닫는 거 중요!!!
		
	}
	
}


