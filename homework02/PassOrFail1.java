package homework02;
import java.util.Scanner;
public class PassOrFail1 {

	public static void main(String[] args) {
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
