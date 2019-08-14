package study02;

public class Sum1to10 {
    // 1+2+3+4+5=
	public static void main(String[] args){
		String eval = "";
		int sum = 0;
		for(int i=1; i <=10; i++){
//			if(i<5) {
//				System.out.print(i+"+");
//				
//			}else {
//				System.out.println(i+"=");
//			}
			
			if(i==10) {
				eval += i+ " = ";
//				sum += i;
				System.out.println(sum);
			}else {
				eval += i+ " + ";
//				sum +=i;
				System.out.println(sum);
			}
			sum +=i;
		}
		System.out.println(eval + sum);	
	}
	

}
