package homework02;
/**
 * To. 개발자님
안녕하세요. 비트대학입니다.
사용자가 입력한 숫자를 더하다가 끝내고 싶은 순간에 스톱이 되면서 그동안 입력된
숫자값(점수)을 전부 더한 결과값이 나오는 프로그램이 필요합니다.
그런데 교수님께서 자꾸 결과값만 보니까 잘 연산이 되었는지 의심이 된다하시네요.
그래서 결과만 보이지 말고 입력한 값이 전부 보이게 해달랍니다. 

화면은 아래와 같습니다.

더하시려는 숫자를 입력하세요(종료는 -1)
> 50
더하시려는 숫자를 입력하세요(종료는 -1)
> 36
더하시려는 숫자를 입력하세요(종료는 -1)
> 78
더하시려는 숫자를 입력하세요(종료는 -1)
> 77
더하시려는 숫자를 입력하세요(종료는 -1)
> -1
현재까지의 누적값은 50 + 36 + 78 + 77 = 348 이고, 평균은 87 입니다. (소수점이하는 절삭)

 * @author user
 *
 */
import java.util.Scanner; 
public class ScoreCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("========무한 덧셈 계산기=======");
		
		
		String sequence = "";
		int series = 0;
		int avg = 0;
		
		while (true) {
			System.out.print("더하시고 싶은 수를 입력하세요.(종료는 -1) \n>");
			int number = scan.nextInt();
			if(number == -1) {
				sequence = sequence.substring(0,sequence.length()-1);
				System.out.printf("현재까지 누적 값 %s = %d 이고 ,평균은 %d입니다",sequence,series,series/avg);
				break;
			
			}
			series += number;
			sequence += number +"+";
			avg +=1;
			
		
		
		}
	}

}
