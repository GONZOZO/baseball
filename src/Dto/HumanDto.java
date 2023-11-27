package Dto;

public class HumanDto {
	private int number; // 등 번호
	private String name;
	private int age;
	private double height;
	
	public HumanDto() {
	}
	
	public HumanDto(int number, String name, int age, double height) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return number + "-" + name + "-" + age + "-" + height;
	}
	
	public String print() {
		return "등 번호: " + number + " 이름:" + name + " 나이:" + age + " 신장:" + height + "cm";
	}
}