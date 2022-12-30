package book.controller;

import java.util.ArrayList;
import java.util.Scanner;

import book.view.BookView;
import book.vo.BookDAO;
import book.vo.BookVO;


public class BookController {
	
	public static final int CONTINUE = 1;
	public static final int STOP = 0;

	public static void main(String[] args) {

		ArrayList<Integer> isbnes = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
	 	ArrayList<String> publicshes = new ArrayList<String>();
	 	ArrayList<String> authores = new ArrayList<String>();
	 	ArrayList<Integer> prices = new ArrayList<Integer>();
	 	ArrayList<String> categories = new ArrayList<String>();
	 	
	 	Scanner s1 = new Scanner(System.in); //정수입력
	 	Scanner s2 = new Scanner(System.in); //문자열 입력
	 	
	 	int flag = CONTINUE;
	 	while(true) {
	 		//개선된(enhanced) for문
	 		if(flag == CONTINUE) {
	 			//책 정보 입력
	 			System.out.print("도서번호 : ");
				isbnes.add(s1.nextInt());
				System.out.print("책 이름 : ");
				names.add(s2.nextLine());
				System.out.print("출판사 : ");
				publicshes.add(s2.nextLine());
				System.out.print("저자 : ");
				authores.add(s2.nextLine());
				System.out.print("가격 : ");
				prices.add(s1.nextInt());
				System.out.print("카테고리 : ");
				categories.add(s2.nextLine());
	 		} else if(flag == STOP) {
	 			break;
	 		}//if
	 		
	 		//1번 : 반복 / 0번 : 종료
	 		System.out.print("계속 입력하시겠습니까?(계속:1, 종료:0) : ");
	 		flag = s1.nextInt();
	 		System.out.println("=====================================");
	 	}//while
		
	 	//BookDAO클래스 불러오기
		BookDAO dao = new BookDAO();
		
		//입력된 학생 정보 출력
		for(int i = 0; i < names.size(); i++) {
			//i번째 방에 있는 ArrayList를 넘기기
			BookVO svo = new BookVO(isbnes.get(i), names.get(i), publicshes.get(i), authores.get(i), prices.get(i), categories.get(i));
			dao.insert(svo);
		}//for
		
		//화면 출력
		BookView stuview = new BookView();
		stuview.view(dao.select());
		s1.close();
		s2.close();
		
	}

}
