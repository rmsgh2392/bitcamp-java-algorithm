package study01;

import java.util.Scanner;

public class Prnt5Time {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("=====1.진행  2.스탑======");
			int number = scan.nextInt();
			switch(number) {
			case 1 : 
				System.out.println("시스템 진행");
				break;
			case 2 :
				System.out.println("====시스템 종료====");
				return;
			}
			System.out.println("안녕");
		}
	}

}
