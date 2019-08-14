package study02;

import java.util.Scanner;

public class SequenceOdd {
	public static void main(String[] args) {
		String sequence = "";
		int series = 0;
		for(int i=1;i<=10;i++) {
			if(i % 3==0){
				if(i!=10){
					sequence += i +"+";
					
				}else {
					sequence += i +"=";
					
				}
			}
			series +=i;
		}
		System.out.println(sequence + series);
	}
}
				
			
