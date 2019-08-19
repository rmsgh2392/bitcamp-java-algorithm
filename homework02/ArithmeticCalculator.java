package homework02;
/*프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
*/
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int rvalue,lvalue,result =0;
		int mok = 0;
		int nam = 0;
		String op ;
		
		System.out.println("사칙연산 계산기 1.덧셈 2.뺼셈 3.곱셈 4.나누기");
		op = sc.next();
		System.out.println("연산 하고 싶은 두 수를 입력하세요");
		lvalue = sc.nextInt();
		rvalue = sc.nextInt();
		
		switch(op) {
		case "+": result = lvalue+rvalue;
				break;
		case "-": result = lvalue-rvalue;
				break;
		case "*": result = lvalue*rvalue;
				break;
		case "/": mok = lvalue/rvalue; nam =lvalue%rvalue;
				break;
		default :
				System.out.println("다시 입력해주세여");
				break;
		}
		if(op.equals("/")) {
			System.out.printf("%d %s %d = %d[%d]",lvalue,op,rvalue,mok,nam);
		}else {
			System.out.printf("%d %s %d = %d",lvalue,op,rvalue,result);
		}
	}

}
