package study05;

import java.util.Scanner;

public class Engine1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member1 m = new Member1();
		
		while(true) {
			System.out.println("0.종료 1.join 2.bmi 3.PassOrFail 4.Menu");
			switch(sc.nextInt()) {
			case 0: System.out.println("시스템 종료하겠습니다.");
					return;
			case 1: System.out.println("1.Join(회원가입)");
					
					break;
			case 2: System.out.println("2.bmi(당신의 체질량 지수는?)");
			
					break;
			case 3: System.out.println("PassOrFail(당신의 시험 점수 평가하기)");
			
					break;
			case 4: System.out.println("Menu(먹고싶은 음식 선택 결제하기)");
			
					break;
			}
		}
	}
}
