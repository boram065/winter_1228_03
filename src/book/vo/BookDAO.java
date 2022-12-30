package book.vo;

import java.util.ArrayList;

public class BookDAO {
	ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
	public void insert(BookVO book) {
		bookList.add(book);
	}
	
	public ArrayList<BookVO> select() {
		return bookList;
	}
}
