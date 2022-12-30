package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class JButtonListener implements ActionListener {
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	JLabel jl;

	public JButtonListener(JButton jb1, JButton jb2, JButton jb3, JButton jb4, JButton jb5, JButton jb6, JButton jb7, JLabel jl) {
		super();
		this.jb1 = jb1;
		this.jb2 = jb2;
		this.jb3 = jb3;
		this.jb4 = jb4;
		this.jb5 = jb5;
		this.jb6 = jb6;
		this.jb7 = jb7;
		this.jl = jl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon icon = null;
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

}
