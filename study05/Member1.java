package study05;

public class Member1 {
	private String name,Id,pw,ssn,food;
	private double cm , kg ;
	private int kor,eng,math,scince,sport,price;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getId() {
		return this.Id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getFood() {
		return this.food;
	}
	public void setCm(double cm) {
		this.cm = cm;
	}
	public double getCm() {
		return this.cm;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public double getKg() {
		return this.kg;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	public void setScince(int scince) {
		this.scince = scince;
	}
	public int getScince() {
		return this.scince;
	}
	public void setSport(int sport) {
		this.sport = sport;
	}
	public int getport() {
		return this.sport;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price ;
	}
	
	
	@Override
	public String toString() {
		return String.format("회원정보 :\n"
				+ "이름 :%s \n"
				+ "아이디 : %s \n"
				+ "비밀번호 : %s \n"
				+ "주민번호 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f"
				,name,Id,pw,ssn,cm,kg);
	}
	
	
	
}	
