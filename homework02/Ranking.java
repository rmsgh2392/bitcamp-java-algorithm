package homework02;

import java.util.Scanner;

/**
 * To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

라고 출력시켜주세요.

 * @author user
 *
 */
public class Ranking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] player = {"kor", "usa" ,"amc"};
		double rpt1,rpt2,rpt3 = 0;
		System.out.println("3명 선수의 100미터 기록");
		System.out.printf("%s선수의 기록 :\n",player[0]);
		rpt1 =scanner.nextDouble();
		System.out.printf("%s선수의 기록 :\n",player[1]);
		rpt2 =scanner.nextDouble();
		System.out.printf("%s선수의 기록 :\n",player[2]);
		rpt3 =scanner.nextDouble();
		System.out.println("####성적랭킹####");
		
		
		if(rpt1<rpt2 && rpt1<rpt3 && rpt2<rpt3) {
			System.out.printf("1등: %s선수기록 :(%f초)",player[0],rpt1);
			System.out.printf("2등: %s선수기록 :(%f초)",player[1],rpt2);
			System.out.printf("3등: %s선수기록 :(%f초)",player[2],rpt3);
		}else if(rpt2<rpt1 && rpt2<rpt3 && rpt1>rpt3) {
			System.out.printf("1등: %s선수기록 :(%f초)",player[1],rpt2);
			System.out.printf("2등: %s선수기록 :(%f초)",player[2],rpt3);
			System.out.printf("3등: %s선수기록 :(%f초)",player[0],rpt1);
		}else if (rpt3<rpt1 && rpt3<rpt2 && rpt1<rpt2) {
		System.out.printf("1등: %s선수기록 :(%f초)",player[1],rpt2);
		System.out.printf("1등: %s선수기록 :(%f초)",player[1],rpt2);
		System.out.printf("1등: %s선수기록 :(%f초)",player[1],rpt2);
	}
	
		
	}
		
}
		
		
		
		
		
		
		

