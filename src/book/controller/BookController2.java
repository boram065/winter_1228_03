package book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import book.view.BookView2;
import book.vo.BookDAO;
import book.vo.BookVO;

public class BookController2 extends JFrame{
	BookDAO dao;
	ArrayList<BookVO> bookVOList;
	BookView2 view2;
	
	public BookController2() {
		dao = new BookDAO();
		view2 = new BookView2();
		bookVOList = dao.select();
		view2.setBookVOList(bookVOList);
		view2.initView();
		JButton jbAdd = view2.getJbAdd();
		jbAdd.addActionListener(jbAddL);
		add(view2, "Center");
		setTitle("도서관리시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(600, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BookController2();
	}//main
	
	ActionListener jbAddL = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//neededInsertData() : panS에 있는 JTextField에 입력된 값들과 JComboBox의 값 BookVO에 핑드갑슬을 초기화하여 BookVO 객체 참조값을 변환하는 메소드
			BookVO vo = view2.neededInsertData();
			dao.insert(vo);
			bookVOList = dao.select();
			view2.setBookVOList(bookVOList);
			view2.putResult();
			view2.initInsertData();
		}//actionPerformed
		
	};//ActionListener
	
}//class
