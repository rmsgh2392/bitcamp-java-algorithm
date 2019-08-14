package study02;
/***
 * 배열을 선언 
 * @author user
 *
 */
import java.util.Scanner;
public class IntArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학","과탐","독일어"};
		int[] score = new int[5];
		for(int i=0;i <subjects.length;i++) {
			System.out.printf("%s점수를 입력하세요 \n",subjects[i]);
			score[i] = scanner.nextInt();
			
		}

//		System.out.printf("%s점수를 입력하세요 \n",subjects[1]);

//		System.out.printf("%s점수를 입력하세요 \n",subjects[2]);
//		
//		System.out.printf("%s점수를  입력하세요 \n",subjects[3]);

//		System.out.printf("%s점수를  입력하세요 \n",subjects[4]);
		
		for (int i =0; i<score.length;i++) {
			System.out.printf("%s 점수 %d \n",subjects[i], score[i]);
		}
//		System.out.printf("점수 %d\n", scores[0]);
//		System.out.printf("점수 %d\n", scores[1]);
//		System.out.printf("점수 %d\n", scores[2]);
//		System.out.printf("점수 %d\n", scores[3]);
//		System.out.printf("점수 %d\n", scores[4]);
	}
}
