package program;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ladder {

	/**
	 * 
	 */
	

	public static void main(String[] args) {
		JFrame pyramid=new JFrame("Chess Club Ladder");
		pyramid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pyramid.getContentPane().add(new JLabel(new ImageIcon("src/program/chessladder.JPG")),BorderLayout.PAGE_START);
		pyramid.pack();
		
		
		pyramid.setVisible(true);
		pyramid.setSize(900,925);
	}

}
