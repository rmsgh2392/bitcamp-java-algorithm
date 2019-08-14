package study02;

public class Sum1to5 {
    // 1+2+3+4+5=
	public static void main(String[] args){
		String eval = "";
		int sum = 0;
		for(int i=1; i <=5; i++){
//			if(i<5) {
//				System.out.print(i+"+");
//				
//			}else {
//				System.out.println(i+"=");
//			}

		  eval += (i==5) ? i+ "=" : i+ "+";// 3항연산자
					sum += i;
//			System.out.print((i==5) ? i+ "=" : i+ "+");
		}
			System.out.println(eval + sum);
		
	}

}
