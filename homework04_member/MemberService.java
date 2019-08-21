package homework04_member;

public class MemberService {
	public String getBmi(Member m) {
		String result = "";
		String answer = "";
		String name = m.getName();
		double weight = m.getWeight();
		double height = m.getHeight();
		double bmi = weight /(height*height/10000);
		
		if(bmi >30.0) {
			answer = "고도비만 위험!!";
		}else if(bmi>25.0 && bmi <=30.0) {
			answer = "비만입니다 ";
		}else if(bmi>23.0 && bmi<=25.0) {
			answer = "과체중 조금만 소식";
		}else if(bmi>18.5&&bmi<=23.0) {
			answer = "정상입니다 축하";
		}else if(bmi<=18.5) {
			answer = "저체중 살좀 찌셔야겠어요";
		}
		result = String.format("%s 님의 키 :%.1f 몸무게 :%.1f bmi 지수는 %.1f %s입니다."
				,name,height,weight,bmi,answer);
		return result;
	}
	public String getTax(Member m) {
		String result = "";
		String name = m.getName();
		int anicome = m.getSalary();
		double rate = 9.7;
		double tax = anicome * rate *0.01;
		
		result = String.format("%s님께서 받으시는 %d만원의 세금은 %.1f입니다.",name,anicome,tax);
		return result;
	}
}
