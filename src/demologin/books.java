package demologin;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class books extends JFrame implements ActionListener {
	JButton fy,sy,ty;
	JButton backbutton;
   books(){
	   setLayout(null);
	   setSize(1500,900);
	   setLocation(240,50);
	   setVisible(true);
	   setResizable(false);
	   JLabel main=new JLabel();
	   Image back=new ImageIcon(getClass().getResource("/demo.jpeg")).getImage();
	   main.setIcon(new ImageIcon(back));
	   main.setBounds(0,0,1500,900);
	   getContentPane().add(main);
	   
	   JLabel title=new JLabel("SELECT THE YEAR");
	   title.setBounds(470,100,800,600);
		title.setFont(new Font("OSWARD",Font.BOLD,32));
		title.setForeground(Color.RED);
		title.setVerticalAlignment(JLabel.TOP);
		main.add(title);
	   
	   fy= new JButton("FYBCS");
	   fy.setBounds(160,280,320,60);
	   main.add(fy);
	   sy= new JButton("SYBCS");
	   sy.setBounds(160,380,320,60);
	   main.add(sy);
	   ty= new JButton("TYBCS");
	   ty.setBounds(160,480,320,60);
	   ty.addActionListener(this);
	   main.add(ty);
	   JLabel bookimg=new JLabel();
	   Image book=new ImageIcon(getClass().getResource("/back5.png")).getImage();
	   bookimg.setIcon(new ImageIcon(book));
	   bookimg.setBounds(590,160,950,700);
	   
	   main.add(bookimg);
	    backbutton=new JButton("Back");
	    backbutton.setBounds(1200,760,150,40);
	    backbutton.setBackground(Color.decode("#228B22"));
	    backbutton.setForeground(Color.WHITE);
	    backbutton.addActionListener(this);
	    add(backbutton);
	   
	   
   }
   public static void main(String args[]) {
	   new books();
   }
   public void actionPerformed(ActionEvent e) {
	   if(e.getSource()==ty) {
		   setVisible(false);
		   new tybcs().setVisible(true);
	   }
	   if(e.getSource()==backbutton) {
			  setVisible(false);
			  new select().setVisible(true);
		  }
   }
}
