package homework01;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ssn = "";
		String year = "";
		System.out.println("주민등록번호를 입력하세요");
		ssn = scanner.next();
		String num = ssn.substring(7,8);
		
	    int a = Integer.parseInt(num);
	
		
		switch(a) {
		case 0 : year = "1800 ~ 1899년에 태어난 여성";
			break;
		case 1 : year = "1900 ~ 1999년에 태어난 남성";
			break;
		case 2 : year = "1900 ~ 1999년에 태어난 여성";
			break;
		case 3 : year = "2000 ~ 2099년에 태어난 남성";
			break;
		case 4 : year = "2000 ~ 2099년에 태어난 여성";
			break;
		case 5 : year = "1900 ~ 1999년에 태어난 외국인 남성";
			break;
		case 6 : year = "1900 ~ 1999년에 태어난 외국인 여성";
			break;
		case 7 : year = "2000 ~ 2099년에 태어난 외국인 남성";
			break;
		case 8 : year = "2000 ~ 2099년에 태어난 외국인 여성";
			break;
		case 9 : year = "1800 ~ 1899년에 태어난 남성";
			break;
			default : year = "잘못 입력하셨습니다!!";
		
		}
		System.out.println(year);
	}

}
