package study02;

public class EvenSequence {

	public static void main(String[] args) {
		int series = 0;
		String seq = "";
		for(int i =1; i <=10; i++) {
			if(i % 2==0) {
				series += i;
				if(i!=10) {
					seq += i + " + ";
				}else {
					seq += i + " = ";
				}
			}//if문끝
		}//for문끝
		System.out.println(seq + series);//single value 값 출력
	}

}
