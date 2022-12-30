package gui.test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//4. 독립된 ActionListener 클래스를 사용하기
public class JFrameTest5 extends JFrame {
	ImageIcon icon = new ImageIcon();
	JLabel jl = new JLabel(icon, JLabel.CENTER);
			
	JButton jb1 = new JButton("이해원");
	JButton jb2 = new JButton("이서영");
	JButton jb3 = new JButton("조서현");
	JButton jb4 = new JButton("황혜경");
	JButton jb5 = new JButton("김하은");
	JButton jb6 = new JButton("양가윤");
	JButton jb7 = new JButton("최보람");
	
	public JFrameTest5() {
		JPanel jp = new JPanel();
		
		JButtonListener jbListener = new JButtonListener(jb1, jb2, jb3, jb4, jb5, jb6, jb7, jl);
		jb1.addActionListener(jbListener);
		jb2.addActionListener(jbListener);
		jb3.addActionListener(jbListener);
		jb4.addActionListener(jbListener);
		jb5.addActionListener(jbListener);
		jb6.addActionListener(jbListener);
		jb7.addActionListener(jbListener);
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
		new JFrameTest5();
	}//main


}//class
