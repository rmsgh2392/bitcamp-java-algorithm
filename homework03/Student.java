package homework03;

import java.util.Scanner;

public class Student {
		Scanner sc = new Scanner(System.in);
		public String getAc(int rvalue,int lvalue,String op) {
		
		int sum =0;
		String val = "";
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
			val = String.format("%d %s %d = %d[%d]",lvalue,op,rvalue,sum,lvalue%rvalue);
		}else {
			val =  String.format("%d %s %d = %d",lvalue,op,rvalue,sum);
		}
		return val;
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
	public String getMonthEndDay(int month) {
		String date ="";
		switch(month){
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			date  = "31일 까지 있습니다"; break;
		case 4: case 6: case 9: case 11:
			date = "30일까지 있습니다"; break;
		default : date = "28일까지 있습니다.(운년이면 29일까지 있습니다.)";
			break;
		}
		 String result = String.format("입력하신 %d월은 %s",month,date);
		 return result;
	}
	public String passorfail(String name,int korsc,int engsc,int mathsc) {
		
		int sum = 0 , avg =0;
		String val = "";
		sum = korsc + engsc + mathsc;
		avg = sum /3;
		
		if(avg <70) {
			val = "불합격";
		}else if(avg>=70 && avg <90) {
			val = "합격";
		}else if (avg >=90) {
			val = "장학생";
		}
		
		String result = String.format("%s \t %d \t %d \t %d \t %d \t %d \t %s%n"
				,name,korsc,engsc,mathsc,sum,avg,val);
		
		
		return result;
	}
	public void getRanking() {
	}
	public String getReportCard(String name,int korsc,int engsc,int mathsc) {
		int sum = korsc + engsc + mathsc;
		int avg = sum / 3;
		String val = "";
		if(avg<70) {
			val = "불합격";
		}else if(avg>=10 && avg <90) {
			val = "합격";
		}else if(avg >=90) {
			val = "장학생";
		}
		
		String result = String.format("%s \t %d \t %d \t %d \t %d \t %d \t %s%n",name,korsc,engsc,mathsc,sum,avg,val);
		return result;
	}
	public void getScoreCal() {}
	public String getTax(int anincome,String name) {
		
		double rate = 9.7;
		double tax = anincome * rate*0.01;
		
		String result = String.format("%d만원 연봉을 받으시는 %s님 께서 내실 세금은 %.1f입니다.",anincome,name,tax);
		return result;
	}
	public void getTime() {}
	
}
