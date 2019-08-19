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
public class ArithmeticCalculator2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String op = "";
       int result = 0;
       int fir,sec =0;
       System.out.println("사칙연산 프로그램 1.덧셈 2.뺼셈 3.곱셉 4.나눗셈");
       op = sc.next();
       System.out.println("입력하실 두 수를 입력하세여");
       fir = sc.nextInt();
       sec = sc.nextInt();
       
       
       
       
       switch(op) {
       case "+" : result = fir + sec ;
       break;
       case "-" : result = fir - sec ;
       break;
       case "*" : result = fir * sec ;
       break;
       case "/" : result = fir / sec ;
       break;
       
       }
       if(op.equals("/")) {
    	   System.out.printf("입력하신 사칙연산의 결과는 %d %s %d = %d[%d]",fir,op,sec,result,fir%sec);
       }else {
    	  System.out.printf("입력하신 사칙연산의 결과는 %d %s %d = %d",fir,op,sec,result);
       }
	}

}
