package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.Join 2.정보보기 3.아이디 찾기 4.BMI 5.ReportCard 6.Tax세금구하기");
			switch(sc.nextInt()) {
			case 0 :System.out.println("시스템 종료 "); return;
			case 1 : System.out.println("1,Join");
			
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디");
				member.setId(sc.next());
				System.out.println("비밀번호");
				member.setPass(sc.next());
				System.out.println("이름");
				member.setName(sc.next());
				System.out.println("주민번호");
				member.setYear(sc.next());
				System.out.println("키");
				member.setHeight(sc.nextDouble());
				System.out.println("몸무게");
				member.setWeight(sc.nextDouble());
				System.out.println("혈액형");
				member.setBlood(sc.next());
				System.out.println("국어점수");
				member.setKor(sc.nextInt());
				System.out.println("영어점수");
				member.setEng(sc.nextInt());
				System.out.println("수학점수");
				member.setMath(sc.nextInt());
				System.out.println("연봉을 입력하세요");
				member.setSalary(sc.nextInt());
				break;
				
			case 2: 
			System.out.println(member.toString());
				break;
			case 3:
				System.out.println("아이디,이름을 입력하면 주민번호 알려줌");
				String searchName = sc.next();
				String searchId = sc.next();
				if(searchName.equals(member.getName())&&searchId.equals(member.getId())){
					System.out.printf("찾는 아이디 : %s\n"
							+ "주민번호: %s\n",member.getId(),member.getYear());
						
			     }else {
			    	 System.out.println("찾는 아이디가 없습니다.");
			     }
				break;
			     
			case 4:
				System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
				break;
			case 5: 
				System.out.println("ReportCard 점수 입력해 기록하기");
				System.out.println("학생 \t 국어 \t 영어 \t 수학 \t 총점 \t 평점 \t 합격여부 ");
				System.out.println("===========================================");
				System.out.println(service.getReportCard(member));
				break;
			
			case 6:
				System.out.println("받는 연봉의 세금 구하기");
				System.out.println(service.getTax(member));
				break;
		}
	}
	}
}

