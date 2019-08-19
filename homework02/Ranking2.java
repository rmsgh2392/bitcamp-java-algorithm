package homework02;

import java.util.Scanner;

public class Ranking2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[]name = {"A","B","C"};
		double [] rpt = new double[3];
		
		for(int i =0;i<name.length;i++) {
			System.out.printf("%s선수 기록을 입력하세요.\n",name[i]);
			rpt[i] = sc.nextDouble();
		}
		
		for(int i =0;i<rpt.length;i++) {
			if(rpt[0]<rpt[1]&& rpt[1]<rpt[2]&&rpt[0]<rpt[2]) {
				System.out.printf("1등 :A선수 (%.1f초) ",rpt[0]);
				System.out.printf("2등 :B선수 (%.1f초) ",rpt[1]);
				System.out.printf("3등 :C선수 (%.1f초) ",rpt[2]);
			}else if (rpt[1]<rpt[2]&& rpt[2]<rpt[0]&&rpt[1]<rpt[0]) {
				System.out.printf("1등 :B선수 (%.1f초)",rpt[1]);
				System.out.printf("2등 :C선수 (%.1f초)",rpt[2]);
				System.out.printf("3등 :A선수 (%.1f초)",rpt[0]);
			}else if(rpt[2]<rpt[0]&&rpt[2]<rpt[1]&&rpt[0]<rpt[1]) {
				System.out.printf("1등 :C선수 (%.1f초)",rpt[2]);
				System.out.printf("2등 :A선수 (%.1f초)",rpt[0]);
				System.out.printf("3등 :B선수 (%.1f초)",rpt[1]);
			}
		}
	}
}
