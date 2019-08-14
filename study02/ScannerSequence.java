package study02;

import java.util.Scanner;

public class ScannerSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String sequence = "";
	    int series =0;
	    System.out.println("시작 값");
	    int start = scan.nextInt();
	    System.out.println("끝 값");
	    int end = scan.nextInt();
	    for(int i =start; i<=end;i++) {
	    	if(i % 2 ==0) {
	    		if(i!=10) {
	    			sequence += i + "+";
	    			
	    		}else {
	    			sequence += i + "=";
	    		}
	    		series += i;
	    	}
	    }
		System.out.println(sequence + series);
		
		
	}

	
}
