package homework01;
/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */

import java.util.Random;
import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {
		Random ran = new Random();
		int dice = ran.nextInt(3);
		System.out.println("====1가위, 2바위, 3보 게임====");
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		String game ="";
		switch(dice) {
		case 1 :
					switch(user) {
					case 1: game = "비겼습니다.";
					break;
					case 2: game = "이겼습니다";
					break;
					case 3: game = "졌습니다";
					break;
					}System.out.println(game);
					break;
		case 2:	
				switch(user) {
				case 1: game = "졌습니다";
				break;
				case 2: game = "비겼습니다";
				break;
				case 3: game = "이겼습니다";
				break;
				}System.out.println(game);break;
		case 3: 
				switch(user) {
				case 1: game = "이겼습니다";
				break;
				case 2: game = "졌습니다";
				break;
				case 3: game = "비겼습니다";
				break;
				}System.out.println(game);
				break;
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
