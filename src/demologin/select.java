package demologin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class select extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4;
	JButton backbutton;
   select(){
	   setLayout(null);
	   setSize(900,900);
	   setLocation(540,50);
	   setResizable(false);
	   setVisible(true);
	   JLabel label=new JLabel();
	   
		Image selectimg=new ImageIcon(getClass().getResource("/demo.jpeg")).getImage();
		label.setIcon(new ImageIcon(selectimg));
		label.setBounds(0,0,880,880);
		getContentPane().add(label);
		JLabel sub=new JLabel("WELCOME TO BACHLER OF COMPUTER SCIENCE DEPARTMENT");
		sub.setBounds(50,50,800,600);
		sub.setFont(new Font("OSWARD",Font.BOLD,23));
		sub.setForeground(Color.BLUE);
		sub.setVerticalAlignment(JLabel.TOP);
		label.add(sub);
		
	    b1=new JButton("BOOKS");
		b1.setBounds(150,140,520,50);
		b1.setFocusable(true);
		b1.setBackground(Color.decode("#8080ff"));
		b1.setFont(new Font("RAILWAY",Font.BOLD,17));
		label.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("QUIZ");
		b2.setBounds(150,200,520,50);
		b2.setFocusable(true);
		b2.setBackground(Color.decode("#8080ff"));
		b2.setFont(new Font("RAILWAY",Font.BOLD,17));
		b2.addActionListener(this);
		label.add(b2);
	    b3=new JButton("GENRATE ID CARD");
		b3.setBounds(150,270,520,50);
		b3.setFocusable(true);
		b3.setBackground(Color.decode("#8080ff"));
		b3.addActionListener(this);
		b3.setFont(new Font("RAILWAY",Font.BOLD,17));
		label.add(b3);
		
		b4=new JButton("NOTES WRITING");
		b4.setBounds(150,340,520,50);
		b4.setFocusable(true);
		b4.setBackground(Color.decode("#8080ff"));
		b4.addActionListener(this);
		b4.setFont(new Font("RAILWAY",Font.BOLD,17));
		label.add(b4);
		
		backbutton=new JButton("Back");
	    backbutton.setBounds(700,810,150,40);
	    backbutton.setBackground(Color.black);
	    backbutton.setForeground(Color.WHITE);
	    backbutton.addActionListener(this);
	    add(backbutton);
	    
		JLabel down=new JLabel();
		Image downimg=new ImageIcon(getClass().getResource("/selecting.png")).getImage();
		down.setIcon(new ImageIcon(downimg));
		down.setBounds(120,360,880,600);
		label.add(down);
		
   }
   public static void main(String args[]) {
	   new select();
   }
   public void actionPerformed(ActionEvent e){
	   if(e.getSource()==b1) {
		   setVisible(false);
		   new books().setVisible(true);
	   }
	   if(e.getSource()==b2) {
		   setVisible(false);
		   new Quizapp().setVisible(true);
	   }
	   if(e.getSource()==b3) {
		   setVisible(false);
		   new id().setVisible(true);
	   }
	   if(e.getSource()==b4) {
		   setVisible(false);
		   new notes().setVisible(true);
	   }
		  if(e.getSource()==backbutton) {
			  setVisible(false);
			  new logincheck().setVisible(true);
		  }
   }
}
