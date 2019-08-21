package homework04_member;
import javax.swing.JOptionPane;
public class MemberController {

	public static void main(String[] args) {
		Member m = null;
		MemberService s = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.Mypage 3.BMI 4.Tax")) {
			case "0": System.out.println("시스템 종료하겠습니다.");
						return;
			case "1":
				m = new Member();
				m.setId(JOptionPane.showInputDialog("ID입력 :"));
				m.setName(JOptionPane.showInputDialog("이름입력 :"));
				m.setPass(JOptionPane.showInputDialog("Password 입력:"));
				m.setYear(JOptionPane.showInputDialog("주민번호 입력:"));
				m.setBlood(JOptionPane.showInputDialog("혈액형 입력 :"));
				String height = JOptionPane.showInputDialog("키 입력:");
				m.setHeight(Double.parseDouble(height));
				String weight = JOptionPane.showInputDialog("몸무게 입력:");
				m.setWeight(Double.parseDouble(weight));
				String  salary = JOptionPane.showInputDialog("연봉입력:");
				m.setSalary(Integer.parseInt(salary));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,"2.마이페이지\n" + m.toString());
				break;
			case "3":
				JOptionPane.showMessageDialog(null ,"3.BMI\n" + s.getBmi(m));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "4.Tax\n "+ s.getTax(m));
				break;
			}
			
			
			
		}
	}

}
