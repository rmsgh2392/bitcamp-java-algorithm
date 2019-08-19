package homework02;
/** 프로그램을 하나 개발해야 합니다.
* 교수는 학생과 국어, 영어, 수학점수만 입력하면
* 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
* 오더는 다음과 같이 화면에 출력하라고 합니다.
* 학생           국어        영어        수학        총점        평균        합격여부
* =======================================================
* 홍길동     90       90      90     270      90       (장학생)
* 합격여부는 다음과 같다고 합니다.
* 평균이 90점 이상이면 장학생
* 70점 이상 90점미만 이면 합격
* 70미만이면 불합격이라고 하네요.
* 단) 평균에서 소수점이하는 절삭입니다.
*/
import java.util.Scanner;
public class PassOrFail {
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
