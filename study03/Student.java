package study03;

import java.util.Scanner;

public class Student {
// 1.BMI 2.Ranking 3.Howmuch 4.ReportCard
	public String getBmi(String name ,double weight,double height) {
		String val = "";
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
	
	
	
	
		
	
	public  String getRanking(double[]rpt) {

		String[]name = {"A","B","C"};
		for(int i =0;i<rpt.length;i++) {
			if(rpt[0]<rpt[1]&& rpt[1]<rpt[2]&&rpt[0]<rpt[2]) {
				System.out.printf("1등 :A선수 (%.1f초) ",rpt[0]);
				System.out.printf("2등 :B선수 (%.1f초) ",rpt[1]);
				System.out.printf("3등 :C선수 (%.1f초) ",rpt[2]);
			}else if (rpt[1]<rpt[2]&& rpt[2]<rpt[0]&&rpt[1]<rpt[0]) {
				System.out.printf("1등 :B선수 (%.1f초)",rpt[1]);
				System.out.printf("2등 :C선수 (%.1f초)",rpt[2]);
				System.out.printf("3등 :A선수 (%.1f초)",rpt[0]);
			}else if(rpt[2]<rpt[0]&&rpt[2]<rpt[1]&&rpt[0]<rpt[1]) {
				System.out.printf("1등 :C선수 (%.1f초)",rpt[2]);
				System.out.printf("2등 :A선수 (%.1f초)",rpt[0]);
				System.out.printf("3등 :B선수 (%.1f초)",rpt[1]);
			}
		}
		return "등수를 계산중...";
			
	}
		
	
	
	
	public void howmuch() {
		Scanner sc = new Scanner(System.in);
		
		int dc ,total=0;
		
		
		System.out.println("How much muchine");
		System.out.println("얼마입니까 ?");
		int money = sc.nextInt();
		System.out.printf("%d원 입니다\n",money);
		System.out.println("몇 개나 드릴까여?");
		int number = sc.nextInt();
		total = money * number;
		System.out.printf("총 금액은 %d입니다\n 비싸요 깎아주세요.",total);
		System.out.println("얼마나 깎아드릴까여 ?(10%)");
		dc = sc.nextInt();
		
		System.out.printf("그럼 %d원만 주세요",total*(100-dc)/100);
	}
		
		
	
	
	
	public void getReportCard() {
		String [] subject = {"국어","영어","수학"};
		int [] score = new int[3];
		int sum = 0 , avg =0;
		String val = "";
		System.out.println("총점 평균 합격여부를 판단하는 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력해주세여 :");
		String name = sc.next();
		for(int i=0;i<subject.length;i++) {
			System.out.printf("%s의 점수를 입력하세요:\n",subject[i]);
			score [i] = sc.nextInt();
		}
		for(int i = 0;i<score.length;i++) {
			System.out.printf("%s점수 %d\n",subject[i],score[i]);
			sum += score[i];
		}
		avg = sum /3;
		
		if(avg <70) {
			val = "불합격";
		}else if(avg>=70 && avg <90) {
			val = "합격";
		}else if (avg >=90) {
			val = "장학생";
		}
		
		System.out.println("학생 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부");
		System.out.println("============================================");
		System.out.printf("%s \t %d \t %d \t %d \t %d \t %d \t %s%n"
				,name,score[0],score[1],score[2],sum,avg,val);
	}
}	
		
		
		
		
	
	
	
	

