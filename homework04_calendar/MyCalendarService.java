package homework04_calendar;

public class MyCalendarService {
	public String getEndDay(MyCalendar mc) {
		String endDay = "";
		String answer = "";
		int month = mc.getMonth();
		
		switch(month) {
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12:
			answer = "31일까지 있습니다."	; break;
		case 4: case 6: case 9: case 11:
			answer = "30일까지 있습니다."; break;
			default : 
			answer = "28일까지 있습니다(윤년이면 29일까지 있습니다).";
			break;
		}
		endDay = String.format("%d월은 %s",month,answer);
		return endDay;
	}
	public String isLeapYear(MyCalendar mc) {
		String leapYear = "";
		String answer ="";
		int leapyear = mc.getYear();
		
		if(leapyear % 4==0 && leapyear % 100!=0 || leapyear % 400==0) {
			answer = "윤년입니다.";
		}else {
			answer = "평년입니다";
		}
		
		leapYear = String.format("입력하신 %d년도는 %s",leapyear,answer);
		return leapYear;
	}
}
