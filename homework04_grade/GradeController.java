package homework04_grade;
import javax.swing.JOptionPane;
public class GradeController {

	public static void main(String[] args) {
		Grade g = new Grade();
		GradeService gs = new GradeService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.국어,영어,수학점수 입력 2.국,영,수 총점 3.국,영,수 평균")) {
			case "0":
				System.out.println("시스템 종료하겠습니다.");
				return;
			case "1":
				String kor = JOptionPane.showInputDialog("국어점수 입력 :");
				g.setKor(Integer.parseInt(kor));
				String eng = JOptionPane.showInputDialog("영어점수 입력:");
				g.setEng(Integer.parseInt(eng));
				String math = JOptionPane.showInputDialog("수학점수 입력:");
				g.setMath(Integer.parseInt(math));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,"국,영,수 총점" + gs.getTotal(g));
				break;
			case "3":
				JOptionPane.showMessageDialog(null,"국,영,수 평균" + gs.getAvg(g));
				break;
			}
		}
	}

}
