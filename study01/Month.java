package study01;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Month {

	public static void main(String[] args) {
         Date date = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-mm-dd");
         String today = sdf.format(date);
         
         int month = Integer.parseInt((today.substring(5,7)));
         String val = "";
         switch(month) {
         case 1 : val = "1월입니다";  
        		 break;
         case 2 : val = "2월입니다";
        		 break;
         case 3 : val = "3월입니다";
        		 break;
         case 4 : val = "4월입니다";
        		 break;
         case 5 : val = "5월입니다";
       		     break;
         case 6 : val = "6월입니다"; 
        		 break;
         case 7 : val = "7월입니다.";
        		 break;
         case 8 : val = "8월입니다";
        		 break;
         case 9 : val = "9월입니다";
        		 break;
         case 10 : val = "10월입니다";
        		 break;
         case 11 : val = "11월입니다";
        		 break;
         case 12 : val = "12월입니다";
        		 break;
        		 default : val ="잘못입력하셨습니다";
         }
         System.out.println(val);
	}

}
