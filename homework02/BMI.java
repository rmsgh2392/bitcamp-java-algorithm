package homework02;

import java.util.Scanner;

/**사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)

Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86

(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
       이랍니다.
*/
public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		double height =0, BMI = 0;
		int weight = 0;
		System.out.println("당신의 이름을 입력해주세요 :");
		name = scanner.next();
		System.out.println("몸무게는 얼마입니까 ?");
		weight = scanner.nextInt();		
		System.out.println("키는 몇 cm입니까 ?");
		height =scanner.nextDouble();
		System.out.print("BMI는 "+BMI);
		BMI = weight /(height * height)*10/10;
		
		
		if(BMI > 30.0){
			System.out.println("고도비만입니다 당장 살 뺴세요.");
		}else if(BMI > 25.0) {
			System.out.println("당신은 비만입니다 위험합니다.");
		}else if(BMI >23.0){
			System.out.println("과체중입니다 조절하세요");
		}else if(BMI >18.5){
			System.out.println("정상이세요");
		}else {
			System.out.println("저체중입니다 많이 드세요 ");
		}
		
		
		
		
	}

}
