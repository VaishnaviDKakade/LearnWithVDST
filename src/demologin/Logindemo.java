package demologin;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import demologin.database;


public class Logindemo extends JFrame implements ActionListener{
	  JTextField namefeild,fnamefeild,lnamefeild,emailfeild,cityfeild;
	  JRadioButton male,female;
	  JButton next,backbutton;
	  JPasswordField password;
	  Logindemo(){
		  setLayout(null);
		  setSize(1200,800);
		  setVisible(true);
		  setLocation(400,150);
//		  setResizable(false);
		  getContentPane().setBackground(Color.WHITE);
		  JLabel l1=new JLabel();
		  l1.setBounds(0,0,450,800);
		  l1.setLayout(null);
		  l1.setBackground(Color.decode("#228B22"));
		  l1.setOpaque(true);
		  add(l1);
		  JLabel img=new JLabel();
		  Image loginimg=new ImageIcon(getClass().getResource("/login.png")).getImage();
		  l1.setIcon(new ImageIcon(loginimg));
		  img.setBounds(50,40,100,100);
		  getContentPane().add(img);
		  l1.setVerticalAlignment(JLabel.TOP);
		
		    JLabel name=new JLabel("First Name :");
		    name.setBounds(40,130,140,30);
		    name.setForeground(Color.WHITE);
		    name.setFont(new Font("Raleway",Font.BOLD,13));
		    l1.add(name);

		    namefeild=new JTextField();
		    namefeild.setBounds(50,160,350,30);
		    l1.add(namefeild);

		    JLabel fname=new JLabel("Father's Name :");
		    fname.setBounds(40,200,350,30);
		    fname.setForeground(Color.WHITE);
		    fname.setFont(new Font("Raleway",Font.BOLD,13));
		    l1.add(fname);

		    fnamefeild=new JTextField();
		    fnamefeild.setBounds(50,230,350,30);
		    l1.add(fnamefeild);

		    JLabel lname=new JLabel("Last Name :");
		    lname.setBounds(40,260,350,30);
		    lname.setForeground(Color.WHITE);
		    lname.setFont(new Font("Raleway",Font.BOLD,13));
		    l1.add(lname);
		    
		    lnamefeild=new JTextField();
		    lnamefeild.setBounds(50,290,350,30);
		    l1.add(lnamefeild);

		    JLabel email=new JLabel("Email Id :");
		    email.setBounds(40,340,350,30);
		    email.setForeground(Color.WHITE);
		    email.setFont(new Font("Raleway",Font.BOLD,13));
		    l1.add(email);

		    emailfeild=new JTextField();
		    emailfeild.setBounds(50,373,350,30);
		    l1.add(emailfeild);
		    
		    JLabel city=new JLabel("city :");
		    city.setBounds(40,400,350,30);
		    city.setForeground(Color.WHITE);
		    city.setFont(new Font("Raleway",Font.BOLD,13));
		    l1.add(city);
		    

		    cityfeild=new JTextField();
		    cityfeild.setBounds(50,433,350,30);
		    l1.add(cityfeild);
		    
		    JLabel pass=new JLabel("Enter password :");
		    pass.setBounds(40,480,350,30);
		    pass.setForeground(Color.WHITE);
		    pass.setFont(new Font("Raleway",Font.BOLD,13));
		    l1.add(pass);
		    
		    password=new JPasswordField();
		    password.setBounds(50,510,350,30);
		    l1.add(password);
		    System.out.print(password.getPassword());
		    
		    next=new JButton("NEXT");
		    next.setBounds(600,710,150,40);
		    next.setBackground(Color.decode("#228B22"));
		    next.setForeground(Color.WHITE);
		    
		    backbutton=new JButton("Back");
		    backbutton.setBounds(400,710,150,40);
		    backbutton.setBackground(Color.decode("#228B22"));
		    backbutton.setForeground(Color.WHITE);
		    backbutton.addActionListener(this);
		     
		     JLabel backimg=new JLabel();
		     
		     
		     
		     Image back=new ImageIcon(getClass().getResource("/back2.gif")).getImage();
			 backimg.setIcon(new ImageIcon(back));
			 backimg.setBounds(400,0,800,800);
			 add(backimg);
			 backimg.add(next);
			 backimg.add(backbutton);
			 next.addActionListener((ActionListener) this);
			 
			 
	  }
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==next) {
			  setVisible(false);
			  new select().setVisible(true);
		  }
		  else {
			   new select().setVisible(true);
		  }
		  if(e.getSource()==backbutton) {
			  setVisible(false);
			  new logincheck().setVisible(true);
		  }
		  
		  String name=namefeild.getText();
		  String fname=fnamefeild.getText();
		  String lname=lnamefeild.getText();
		  String email=emailfeild.getText();
		  String city=cityfeild.getText();
		  String pin=password.getText();
		
		  try {
			  if(name.equals("")) {
				  JOptionPane.showMessageDialog(null, "Enter your name");
				  setVisible(true);
			  }
			  else {
				  database signin=new database();
				  
				  String query="insert into signin (password,name,fname,Lname,email,city)values ('"+pin+"','"+name+"','"+fname+"','"+lname+"','"+email+"','"+city+"')";
				  signin.s.executeUpdate(query);
//				  System.out.println(name);
			  }
		  }
		  catch(Exception ei) {
			  System.out.print(ei);
		  }
		  
	  }
	
	  public static void main(String args[]) {
		new Logindemo();
	  }
}
