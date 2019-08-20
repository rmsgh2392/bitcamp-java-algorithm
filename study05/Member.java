package study05;

public class Member {
	private String name,id,pass,year,blood;
	private double height,weight;
	private int kor,eng,math,salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setId(String id){
		this.id = id;
	}
	public String getId() {
		return this.id = id;
	}
	
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return this.pass = pass;
	}
	
	
	public void setYear(String year) {
		this.year = year;
	}
	public String getYear() {
		return this.year = year;
	}
	
	
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood = blood;
	}
	
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height = height;
	}
	
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight = weight;
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
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary; 
	}
	
	@Override
	public String toString() {
		
		return String.format("회원정보:\n"
				+ "이름:%s \n"
				+ "아이디:%s\n"
				+ "비밀번호:%s\n"
				+ "주민번호:%s\n"
				+ "혈액형:%s\n"
				+ "키:%.1f\n"
				+ "몸무게:%.1f"
				,name,id,pass,year,blood,height,weight);
	}
	
}
