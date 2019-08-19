package study04;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
			while(true) {
				
				System.out.println("0은 종료 1.BMI 2.이해못할문제");
				switch(sc.nextInt()) {
				case 0 :System.out.println("종료"); return;//메소드를 종료해라  ==>void(그냥 끝내라)
				case 1 : System.out.println("1.BMI : 이름 , 키 , 몸무게 입력:");
				String name = sc.next();
				double weight = sc.nextDouble();
				double height = sc.nextDouble();
				
				String result = student.getBmi( name, weight,height);
				System.out.println(result);
				break;
				
				case 2: System.out.println("2.이해못할문제");
					//이름 , 주소 , 나이, 은행잔고, 신용도
					//결과가 뭘 넣든간데 1억 대출
				name = sc.next();
				String adress = sc.next();
				int age = sc.nextInt();
				int money = sc.nextInt();
				String credit = sc.next();
					
				result = student.daechul(name,adress,age,money,credit);
				System.out.println(result);
				break;
				
				}
			}
	}

}
