package com.busyqa.course;
import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mark = input.nextInt();
		
		if(mark>=50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("DONE");

	}

}
