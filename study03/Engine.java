package study03;

import java.util.Scanner;
import study03.Student;


public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		String result = "";
		int flag = 0;
		while(true) {
			System.out.println("메뉴:0.종료 1.BMI 2.Ranking 3.Howmuch 4.ReportCard");
			flag = scanner.nextInt();
			
			switch(flag) {
			case 0: System.out.println("종료");
			return;
			
			case 1:  
			System.out.println("1.BMI");
			double height =0.0 ,weight =0.0;
			System.out.println("이름을 입력하세요:");
			String name = scanner.next();
			System.out.println("몸무게 입력");
			 weight = scanner.nextDouble();
			System.out.println("키 입력");
			height = scanner.nextDouble();
			 result = s.getBmi(name,weight,height);
			System.out.println(result);
			break;
			
			case 2: System.out.println("2.Ranking"); 
			double [] rpt = new double[3];
			
			for(int i =0;i<3;i++) {
				System.out.println("선수돌의 스코어를 입력해주세여:");
				rpt[i] = scanner.nextDouble();
			
			}
				result = s.getRanking(rpt);
				System.out.println(result);
				break;
			
			
			
			
			
			
			
			
				
			
			
			case 3: System.out.println("3.Howmuch");
					s.howmuch();
			break;
			
			
			case 4: System.out.println("4.ReportCard");
					s.getReportCard();
			
			break;
			
			}
		}
	}
}
