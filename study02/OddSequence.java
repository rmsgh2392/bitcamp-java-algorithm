package study02;

import java.util.Scanner;

public class OddSequence {

	public static void main(String[] args) {
		//1 + 3 + 5 + 7 + 9 =?
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("==========================");
		System.out.println("입력된 시작 값에서 마지막 값까지 홀수 의 합!");
		System.out.println("==========================");
		System.out.println("시작값:");
		int start = scan.nextInt();
		System.out.println("마지막 값");
		int end = scan.nextInt();
		String hang ="";
		for(int i=start; i<=end; i++) {
//			if(i % 2!=0) {
//				if(i !=9) {
//				    hang += i + "+";
//			}else {
//				hang += i +"=";
//			}
//				sum += i;
//			}
//			if(i%2!=0) { 
//				sum += i;
//				hang += i+ " + ";
//            }else if(i!=9){
//            	hang += i+ " = ";
//            }
			
			if(i % 2!=0) {				
				int end2 = 0;
				if(end % 2==0) {
					end2 = end -1;
				}else {
					end2 = end;
				}
				
				if(i!=end2) {
					hang += i+"+";
				}else{
					hang += i+"=";
				}
			}
			sum += i;
		}
		System.out.println(hang + sum);
	}
}
			
				
				
				
				
			
            
		
        	  

