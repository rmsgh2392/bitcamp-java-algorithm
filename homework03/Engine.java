package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		while(true) {
			System.out.println("0:종료 1.AC 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassorFail 8.Ranking 9.ReportCard 10.scoreCal 11.Tax 12.Time");
			int flag = sc.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료하겠습니다.");
			return;
			case 1: System.out.println("사칙연산 계산기 1.덧셈 2.뺼셈 3.곱셈 4.나누기");
					System.out.println("연산 하고 싶은 두 수를 입력하세요");
					
					int lvalue = sc.nextInt();
					int rvalue = sc.nextInt();
					String op = sc.next();
					
				String val = s.getAc(rvalue,lvalue,op);
				System.out.println(val);
				break;
			case 2:System.out.println("2.BMI");
					System.out.println("이름 ,몸무게,키입력(175->1.75) :");
					String name = sc.next();
					double weight = sc.nextDouble();
					double height = sc.nextDouble();
			
			
					String result = s.getBmi(name,weight,height);
					System.out.println(result);
					break;
			case 3: System.out.println("3.HowMuch");
					System.out.println("차례대로 가격 , 개수 ,");
					int price = sc.nextInt();
					int number = sc.nextInt();
					result = s.howmuch(price,number);
					System.out.println(result);
					
					int total = price * number ;
					result = s.getTotal(total);
					System.out.println(result);
					
					System.out.println("얼마나 깎아드릴까여?");
					int dc = sc.nextInt();
					total = price * number;
					result = s.getDc(dc,total);
					System.out.println(result);
				break;
//			case 4: System.out.println("4,join(헬스클럽 회원등록 서비스)");
//				 	System.out.println("아이디, 비밀번호, 이름, 생년월일, 성인여부, 키, 몸무게, 혈액형 차례대로 입력:");
//				 	String[] membership= {"아이디","이름","생년월일","성인여부","혈액형","비밀번호"};
//				 	membership[0] = sc.next();
//				 	membership[1] = sc.next();
//				 	membership[2] = sc.next();
//				 	membership[3] = sc.next();
//				 	membership[4] = sc.next();
//				 	double cm = sc.nextDouble();
//				 	double kg = sc.nextDouble();
//				 	
//				 	result = s.join(membership,cm, kg);
//				 	System.out.println(result);
//				 	break;
			case 5 : System.out.println("5.LeapYear(입력하신 년도가 윤년인지 평년인지)");
					int year = sc.nextInt();
					result = s.getLeapYear(year);
					System.out.println(result);
					break;
			case 6: System.out.println("6.MonthEndDay(입력하신 월이 몇일까지 있는지)");
					int month = sc.nextInt();
					result = s.getMonthEndDay(month);
					System.out.println(result);
					break;
			case 7: System.out.println("7.PassOrFail");
			
					System.out.println("학생 이름 입력 :");
					name = sc.next();
					System.out.println("점수를 차례대로 입력하세여 1.국어2.영어3.수학");
					int korsc = sc.nextInt();
					int engsc = sc.nextInt();
					int mathsc = sc.nextInt();		
					System.out.println("학생 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부");
					System.out.println("============================================");
					result = s.passorfail(name,korsc,engsc,mathsc);
					System.out.println(result);
					break;

			case 8: System.out.println("8.Ranking(A선수 B선수 C선수 기록 등수 매기기)");
					System.out.println();
					
					s.getRanking();
					break;
			case 9: System.out.println("ReportCard");
					System.out.println("학생 이름 입력 :");
					name = sc.next();
					System.out.println("1.국어2.영어3.수학 차례대로 점수를 입력하세여:");
					korsc = sc.nextInt();
					engsc = sc.nextInt();
					mathsc = sc.nextInt();
					System.out.println("학생 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부");
					System.out.println("============================================");
					result = s.getReportCard(name,korsc,engsc,mathsc);
					System.out.println(result);
					break;
			case 10: System.out.println("ScoreCal");
			
			
			case 11: System.out.println("Tax (세금내는 프로그램)");
					System.out.println("사용자의 연봉과 이름을 각각 입력해주세요>");
					int anincome = sc.nextInt();
					name = sc.next();
					result = s.getTax(anincome,name);
					System.out.println(result);
			}		
			
			
		}
	}

}
