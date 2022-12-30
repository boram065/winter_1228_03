package book.view;

import java.util.ArrayList;

import book.vo.BookVO;

public class BookView {
	ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
	public void view(ArrayList<BookVO> bookList) {
		//개선된 for문
		for (BookVO book : bookList) {
			
			System.out.print("도서번호 : " + book.getIsbn() + "\t");
			System.out.print("책 이름 : " + book.getBookName() + "\t");
			System.out.print("출판사 : " + book.getPublicsh() + "\t");
			System.out.print("저자 : " + book.getAuthor() + "\t");
			System.out.print("가격 : " + book.getPrice() + "\t");
			System.out.print("카테고리 : " + book.getCategory() + "\n");
			
		}//for
		
	}//void
	
	public ArrayList<BookVO> select() {
		return bookList;
	}
	
}//class
