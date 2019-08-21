package homework04_calendar;
import javax.swing.JOptionPane;
public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar mc = new MyCalendar();
		MyCalendarService mcs = new MyCalendarService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.Month 2.LeapYear")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료합니다?");
				return;
			case "1":
				String month = JOptionPane.showInputDialog("월을 입력하세요");
				mc.setMonth(Integer.parseInt(month));
				JOptionPane.showMessageDialog(null,"입력하신 달은 :" + mcs.getEndDay(mc));
			case "2" :
				String year = JOptionPane.showInputDialog("년도를 입력하세요");
				mc.setYear(Integer.parseInt(year));
				JOptionPane.showMessageDialog(null,"입력하신 년도는:" + mcs.isLeapYear(mc));
				break;
			}
		}
	}

}
