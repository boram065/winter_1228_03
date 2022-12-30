package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Inner(내부) 클래스로 ActionListener를 구현
public class JFrameTest2 extends JFrame implements ActionListener{
	ImageIcon icon = new ImageIcon();
	JLabel jl = new JLabel(icon, JLabel.CENTER);
	
	JButton jb1 = new JButton("이해원");
	JButton jb2 = new JButton("이서영");
	JButton jb3 = new JButton("조서현");
	JButton jb4 = new JButton("황혜경");
	JButton jb5 = new JButton("김하은");
	JButton jb6 = new JButton("양가윤");
	JButton jb7 = new JButton("최보람");
	
	public JFrameTest2() {
		JPanel jp = new JPanel();
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jp.add(jb1); jp.add(jb2); jp.add(jb3); jp.add(jb4); jp.add(jb5); jp.add(jb6); jp.add(jb7);
		
		add(jp, "North");
		add(jl, "Center"); //Center 생략가능 / 기본값:Center
		
		setTitle("JFrame 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE); //진짜로 종료
		setLocation(500, 50);
		setSize(600, 700);
		setVisible(true);
	}//JFrameTest2

	public static void main(String[] args) {
		new JFrameTest2();
	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object jbSource = e.getSource();
		if(jbSource == jb1) {
			icon = new ImageIcon("images/사랑녀 이해원.jpg");
			
		} else if(jbSource == jb2) {
			icon = new ImageIcon("images/사랑녀 이서영.png");
			
		} else if(jbSource == jb3){
			icon = new ImageIcon("images/사랑녀 조서현.png");
			
		} else if(jbSource == jb4) {
			icon = new ImageIcon("images/사랑녀 황혜경.png");
			
		} else if(jbSource == jb5) {
			icon = new ImageIcon("images/사랑녀 김하은.png");
			
		} else if(jbSource == jb6) {
			icon = new ImageIcon("images/사랑녀 양가윤.jpg");
			
		} else if(jbSource == jb7) {
			icon = new ImageIcon("images/사랑녀 최보람.png");
			
		}//if
		
		jl.setIcon(icon);
		
	}//actionPerformed

}//class
