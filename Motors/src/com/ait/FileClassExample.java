package com.ait;

import java.io.File;

public class FileClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath=".src/com/ait/restaurant.txt";
		String anotherfilepath=".src/com/ait/restaurant.txt";
		File currentfile = new File (filepath);
		File anotherfile = new File(anotherfilepath);
		boolean available= currentfile.exists();
		if(available)
			System.out.println("the file"+filepath+"available");
		else
			System.out.println("the file"+filepath +"not available");
		boolean isfile =currentfile.isFile();
		if(isfile)
			System.out.println("it is a file");
		
		isfile =anotherfile.isFile();
		if(isfile)
			System.out.println("it is a file");
		
		System.out.println("hi");
	}

}
