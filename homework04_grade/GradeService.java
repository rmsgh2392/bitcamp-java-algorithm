package homework04_grade;

public class GradeService {
	public String getTotal(Grade g) {
		String total = "";
		int kor = g.getKor();
		int eng = g.getEng();
		int math = g.getMath();

		total = String.format("%d",kor+eng+math);
		return total;
	}
	public String getAvg(Grade g) {
		String avg = "";
		int kor = g.getKor();
		int eng = g.getEng();
		int math = g.getMath();
		
		avg = String.format("%d",(kor+eng+math)/3);
		return avg;
	}
}
