
package demologin;
import javax.swing.*;
import java.awt.Event;
import java.awt.*;
import java.net.URL.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class viewpage extends JFrame implements ActionListener{
	JButton join;
	viewpage(){
		setLayout(null);
		setSize(510,450);
		setVisible(true);
		setLocation(650,190);
//		setResizable(false);
//		setUndecorated(true);
		JLabel label=new JLabel();
		Image backimg=new ImageIcon(getClass().getResource("/imgback.gif")).getImage();
		label.setIcon(new ImageIcon(backimg));
		label.setBounds(0,0,510,360);
		getContentPane().add(label);
		
		
		JLabel title=new JLabel("WELCOME TO LEARN WITH VDST");
		title.setBounds(50,60,700,50);
		title.setFont(new Font("OSWARD",Font.BOLD,26));
		label.add(title);
		
		join=new JButton("JOIN NOW");
		join.setBounds(90,220,340,60);
		join.setBackground(Color.CYAN);
		label.add(join);
		join.addActionListener(this);
		
		
		
	}
	public static void main(String args[]) {
		new viewpage();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==join) {
			setVisible(false);
			new logincheck().setVisible(true);
			
		}
		
	}
}
