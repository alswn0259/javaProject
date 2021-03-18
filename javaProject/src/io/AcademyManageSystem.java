package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AcademyManageSystem {
	public static void main(String[] args) throws IOException {
		File namelist = new File("C:/Temp/namelist.txt");
		if(namelist.exists() == false) { namelist.createNewFile(); }
		
		Scanner scn = new Scanner(System.in);
		String name;
		String phoneNum;
		

		
		System.out.print("이름> ");
		name = scn.nextLine();
		System.out.print("전화번호> ");
		phoneNum = scn.nextLine();
		
		
	}
}
