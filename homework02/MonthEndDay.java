package homework02;
/**
 * 월을 입력하면 해당 월이 몇일까지인지
알려주는 프로그램을 작성해 주세요.
단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
출력문장 : "??월은 **일 까지 입니다."
 */
import java.util.Scanner;
public class MonthEndDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month = "";
		String date = "";
		int number = 0;
		System.out.println("===알고 싶은 월을 입력하세요===");
		month = scan.next();
		number = Integer.parseInt(month);
		
		switch(number) {
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12:
			date = "31일 까지입니다.";
			break;
		case 4: case 6: case 9: case 11:
			date = "30일 까지입니다.";
			break;
		default : date = "28일 까지 있습니다(윤년이면 29일까지 있습니다)";
		break;
				
		}
		System.out.println(String.format("요청하신 월의 일자는 : %s월은  %s",month,date));
		
	
}

}


