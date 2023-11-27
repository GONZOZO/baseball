package main;

import java.util.Scanner;

import Dao.BaseballDao;
import Dao.BaseballDaoImpl;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// menu			
		BaseballDao dao = new BaseballDaoImpl();


		while(true) {
			System.out.println("========= 선수정보 프로그램 ==========");
			System.out.println("1.선수정보추가");
			System.out.println("2.선수정보삭제");	
			System.out.println("3.선수정보검색");
			System.out.println("4.선수정보수정");
			System.out.println("5.선수모두출력");
			System.out.println("6.타율순위출력");
			System.out.println("7.방어순위출력");
			System.out.println("8.데이터저장하기");
			System.out.println("9.데이터불러오기");
			
			System.out.print("메뉴의 번호 >> ");
			int menuNumber = sc.nextInt();
			
			switch(menuNumber) {
				case 1:	
					dao.insert();
					break;
				case 2:	
					dao.delete();
					break;
				case 3:	
					dao.select();
					break;
				case 4:	
					dao.update();
					break;
				case 5:	
					dao.allPrint();
					break;
				case 6:	
					dao.batSort();
					break;
				case 7:	
					dao.pitchSort();
					break;
				case 8:	
					dao.save();
					break;
				case 9:	
					dao.load();
					break;
			}			
		}	
	}
}