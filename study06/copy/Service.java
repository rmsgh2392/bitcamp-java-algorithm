package study06.copy;

public class Service {
	public String getBmi(Member member) {
		String result = "";
		String answer = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight / (height*0.01*height*0.01);
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
		result = String.format("%s님의 키:%.1f 몸무게 :%.1f의 bmi 지수는 %.1f %s입니다"
				,member.getName(),member.getHeight(),member.getWeight(),bmi,answer);
		return result;
	}
	public String getReportCard(Member member) {
		String result ="";
		String answer = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int sum = kor + eng + math;
		int avg = sum / 3;
		
		if(avg <70) {
			answer = "불합격입니다 ㅜ";
		}else if(avg >=70 && avg<90) {
			answer = "합격입니다 축하축하";
		}else if(avg>=90){
			answer = "장학생 훌륭하시군요!";
		}
		
		result = String.format("%s \t %d \t %d \t %d \t %d \t %d \t %s"
				,member.getName(),member.getKor(),member.getEng(),member.getMath(),sum,avg,answer);
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		double tax = 0.0;
		double taxrate = 9.7;
		tax = member.getSalary() * (taxrate*0.01);
		result = String.format("%s님께서 받으시는 연봉은 %d만원이고 내실 세금은 %.1f입니다"
				,member.getName(),member.getSalary(),tax);
		return result;
	}
}
