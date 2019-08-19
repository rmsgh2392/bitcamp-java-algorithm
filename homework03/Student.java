package homework03;

import java.util.Scanner;

public class Student {
	public String getAc(int rvalue,int lvalue,String op) {
		
		int sum =0;
			
		switch(op) {
		case "+": sum = lvalue+rvalue;
				break;
		case "-": sum = lvalue-rvalue;
				break;
		case "*": sum = lvalue*rvalue;
				break;
		case "/": sum = lvalue/rvalue; 
				break;
		default :
				System.out.println("다시 입력해주세여");
				break;
				
		}
		if(op.equals("/")) {
			return String.format("%d %s %d = %d[%d]",lvalue,op,rvalue,sum,lvalue%rvalue);
		}else {
			return String.format("%d %s %d = %d",lvalue,op,rvalue,sum);
		}
		}
	public String getBmi(String name,double weight,double height) {
		String val;
		double bmi = weight / ((height*0.01)*(height*0.01));
		
		
		if(bmi >30) {
			val = "고도비만";
		}else if(bmi>25) {
			val = "비만";
		}else if(bmi>23) {
			val = "과체중";
		}else if(bmi>18.5) {
			val = "정상";
		}else {
			val = "저체중";
		}
		String result = String.format("당신의 bmi 지수는 %.2f %s입니다",bmi,val);
		return result;
		
	}
	public String howmuch(int price,int number) {
		
		String result = String.format("가격은 %d 개수는 %d개입니다",price,number);
		return result;
		
	}
	public String getTotal(int total) {
		String result = String.format("총 합은 : %d입니다.",total);
		return result;
	}
	public String getDc(int dc,int total) {
		int total1 = total*(100-dc)/100;
		String result = String.format("%d퍼센트 깎은 금액 %d만 주세요",dc,total1);
		return result;
	}
	
//	public String join(String membership1[],double cm ,double kg) {
//		String[] membership = {"아이디","이름","생년월일","성인여부","혈액형","비밀번호"};
//		if(membership1[3].equals("성인")) {
//			return String.format("아이디 : %s\n비밀번호 : %s\n이름: %s\n생년월일: %s\n성인여부: %s\n키: %.1f\n몸무게: %.1f\n혈액형 :%s"
//					,membership1[0],membership1[5],membership1[1],membership1[2],membership1[3],cm,kg,membership1[4]);
//		}else if(membership1[3].equals("미성년")){
//			return String.format("아이디 : %s\n비밀번호 : %s\n이름: %s\n생년월일: %s\n성인여부: %s\n키: %.1f\n몸무게: %.1f\n혈액형 :%s"
//					,membership1[0],membership1[5],membership1[1],membership1[2],membership1[3],cm,kg,membership1[4]);
//		}
//	}
//	
//		
	
	public String getLeapYear(int year) {
		String diciple = "";
		
//		diciple = (year % 4==0 && year %100 !=0) || (year % 400 ==0) ? "윤년" : "평년" ;
		
		if(year%4==0 && year%100!=0 || year % 400==0) {
			diciple = "윤년입니다.";
		}else {
			diciple = "평년입니다";
		}
		
		String result = String.format("입력하신 %d년은 %s",year,diciple);
		return result;
		
		
	}
	public void getMonthEndDay(int month) {
		
		
	}
	public void passorfail() {}
	public void getRanking() {}
	public void getReportCard() {}
	public void getScoreCal() {}
	public void getTax() {}
	public void getTime() {}
	
}
