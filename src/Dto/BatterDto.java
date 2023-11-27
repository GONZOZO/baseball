package Dto;

public class BatterDto extends HumanDto{
	private String position;
	private int batcount;
	private int hit;
	private double hitAvg;
	
	public BatterDto() {
	}
	
	public BatterDto(String position, int batcount, int hit, double hitAvg) {
		super();
		this.position = position;
		this.batcount = batcount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}
	
	public BatterDto(int number, String name, int age, double height, String position, int batcount, int hit, double hitAvg) {
		super(number, name, age, height);
		this.position = position;
		this.batcount = batcount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getBatcount() {
		return batcount;
	}
	
	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}
	
	public int getHit() {
		return hit;
	}
	
	public void setHit(int hit) {
		this.hit = hit;
	}

	public double gethitAvg() {
		return hitAvg;
	}
	
	public void sethitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}

	@Override
	public String toString() {
		return super.toString() + "-" + position + "-" + batcount + "-" + hit + "-" + hitAvg;
	}
	
	public String print(){
		return super.print() + " 포지션:" + position + " 타수:" + batcount + " 안타수:" + hit + " 타율:" + hitAvg;
	}
}
