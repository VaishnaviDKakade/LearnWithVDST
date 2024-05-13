package demologin;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
public class tybcs2 extends JFrame implements ActionListener{
	JButton ccbut,oprating,javbut,dataanalyticbut,stbut,wbbut;
	JButton backbutton;
	tybcs2(){
		setLayout(null);
		setSize(2000,1000);
		setLocation(0,0);
		setVisible(true);
		setResizable(false);
		JLabel label=new JLabel();
		label.setBounds(0,0,1600,900);
		getContentPane().setBackground(Color.BLACK);
		add(label);
		
		JPanel compilerconstruction1=new JPanel();
		compilerconstruction1.setBounds(120,50,340,360);
		label.add(compilerconstruction1);
		JLabel compilerconstruct=new JLabel();
		compilerconstruct.setBounds(0,10,340,340);
		Image ccimg=new ImageIcon(getClass().getResource("/compilerconstruction.png")).getImage();
		compilerconstruct.setBounds(0,10,340,400);
		compilerconstruct.setIcon(new ImageIcon(ccimg));
		ccbut=new JButton("COMPILER CONSTRUCTION");
		ccbut.setBounds(15,270,290,60);
		ccbut.setBackground(Color.BLACK);
		ccbut.setForeground(Color.white);
		ccbut.addActionListener(this);
		
		compilerconstruct.add(ccbut);
		
		compilerconstruction1.add(compilerconstruct);
		
		JPanel os2=new JPanel();
		os2.setBounds(520,50,340,360);
		label.add(os2);
		JLabel os=new JLabel();
		compilerconstruct.setBounds(0,10,340,340);
		Image osimg=new ImageIcon(getClass().getResource("/os2.png")).getImage();
		os.setBounds(0,10,340,400);
		os.setIcon(new ImageIcon(osimg));
		oprating=new JButton("OSRATING SYSTEM 2");
		oprating.setBounds(15,270,290,60);
		oprating.setBackground(Color.BLACK);
	    oprating.setForeground(Color.white);
	    oprating.addActionListener(this);
		
		os.add(oprating);
		
		os2.add(os);
		
		
		JPanel java2=new JPanel();
		java2.setBounds(920,50,340,360);
		label.add(java2);
		JLabel java=new JLabel();
		java.setBounds(0,10,340,340);
		Image javaimg=new ImageIcon(getClass().getResource("/java2.png")).getImage();
		java.setBounds(0,10,340,400);
		java.setIcon(new ImageIcon(javaimg));
		javbut=new JButton("JAVA");
		javbut.setBounds(15,270,290,60);
	    javbut.setBackground(Color.BLACK);
		javbut.setForeground(Color.white);
		javbut.addActionListener(this);
		java.add(javbut);
		
		java2.add(java);
		
		
		JPanel dataanalytic1=new JPanel();
		dataanalytic1.setBounds(1340,50,370,360);
		label.add(dataanalytic1);
		JLabel dataanalytic=new JLabel();
		dataanalytic.setBounds(0,10,340,340);
		Image dataanalyticimg=new ImageIcon(getClass().getResource("/dataanalytics.png")).getImage();
		dataanalytic.setBounds(0,10,340,400);
		dataanalytic.setIcon(new ImageIcon(dataanalyticimg));
		dataanalyticbut=new JButton("PYTHON");
		dataanalyticbut.setBounds(15,270,290,60);
	    dataanalyticbut.setBackground(Color.BLACK);
		dataanalyticbut.setForeground(Color.white);
		dataanalyticbut.addActionListener(this);
		
		dataanalytic.add(dataanalyticbut);
		
		dataanalytic1.add(dataanalytic);

		
		JPanel wb2=new JPanel();
		wb2.setBounds(120,450,340,360);
		label.add(wb2);
		JLabel wb=new JLabel();
		wb.setBounds(0,10,340,340);
		Image wbimg=new ImageIcon(getClass().getResource("/wb2.png")).getImage();
		wb.setBounds(0,10,340,400);
		wb.setIcon(new ImageIcon(wbimg));
		wbbut=new JButton("WEB TECHNOLOGY");
		wbbut.setBounds(15,270,290,60);
		wbbut.setBackground(Color.BLACK);
	    wbbut.setForeground(Color.white);
	    wbbut.addActionListener(this);
		
		wb.add(wbbut);
		
		wb2.add(wb);
		
		
		JPanel st1=new JPanel();
		st1.setBounds(520,450,340,360);
		label.add(st1);
		JLabel st=new JLabel();
	    st.setBounds(0,10,340,340);
		Image tcsimg=new ImageIcon(getClass().getResource("/softwaretesting.png")).getImage();
		st.setBounds(0,10,340,400);
		st.setIcon(new ImageIcon(tcsimg));
		stbut=new JButton("THEROTICAL COMPUTER SCIENCE");
		stbut.setBounds(15,270,290,60);
		stbut.setBackground(Color.BLACK);
	    stbut.setForeground(Color.white);
	    stbut.addActionListener(this);
		st.add(stbut);
		
		st1.add(st);
		
		 backbutton=new JButton("Back");
		    backbutton.setBounds(1500,860,150,40);
		    backbutton.setBackground(Color.decode("#228B22"));
		    backbutton.setForeground(Color.WHITE);
		    backbutton.addActionListener(this);
		    add(backbutton);
		   
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ccbut) {
			try {
//       		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
       	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\Compiler construction.pdf");
       	  if(f.exists()) {
       		  if(Desktop.isDesktopSupported()) {
       			  Desktop.getDesktop().open(f);
       		  }
       		  else {
       			  JOptionPane.showMessageDialog(null,"not Supported");
       		  }
       	  }
       	  else {
       		  JOptionPane.showMessageDialog(null,"file not exist");
       	  }
       	  
       	
   		 }
       	 catch(Exception ei) {
       		 JOptionPane.showMessageDialog(null,"check file details");
       	 } 
		}
		
		if(e.getSource()==oprating) {
			try {
//       		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
       	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\Operating system 2.pdf");
       	  if(f.exists()) {
       		  if(Desktop.isDesktopSupported()) {
       			  Desktop.getDesktop().open(f);
       		  }
       		  else {
       			  JOptionPane.showMessageDialog(null,"not Supported");
       		  }
       	  }
       	  else {
       		  JOptionPane.showMessageDialog(null,"file not exist");
       	  }
       	  
       	
   		 }
       	 catch(Exception ei) {
       		 JOptionPane.showMessageDialog(null,"check file details");
       	 } 
		}
		
		
		
		if(e.getSource()==javbut) {
			try {
//      		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\Obect orented java 2 (3).pdf");
      	  if(f.exists()) {
      		  if(Desktop.isDesktopSupported()) {
      			  Desktop.getDesktop().open(f);
      		  }
      		  else {
      			  JOptionPane.showMessageDialog(null,"not Supported");
      		  }
      	  }
      	  else {
      		  JOptionPane.showMessageDialog(null,"file not exist");
      	  }
      	  
      	
  		 }
      	 catch(Exception ei) {
      		 JOptionPane.showMessageDialog(null,"check file details");
      	 } 
		}
		
		if(e.getSource()==dataanalyticbut) {
			try {
//      		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\Data analatic.pdf");
      	  if(f.exists()) {
      		  if(Desktop.isDesktopSupported()) {
      			  Desktop.getDesktop().open(f);
      		  }
      		  else {
      			  JOptionPane.showMessageDialog(null,"not Supported");
      		  }
      	  }
      	  else {
      		  JOptionPane.showMessageDialog(null,"file not exist");
      	  }
      	  
      	
  		 }
      	 catch(Exception ei) {
      		 JOptionPane.showMessageDialog(null,"check file details");
      	 } 
		}
		
		if(e.getSource()==wbbut) {
			try {
//      		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\wb1.pdf");
      	  if(f.exists()) {
      		  if(Desktop.isDesktopSupported()) {
      			  Desktop.getDesktop().open(f);
      		  }
      		  else {
      			  JOptionPane.showMessageDialog(null,"not Supported");
      		  }
      	  }
      	  else {
      		  JOptionPane.showMessageDialog(null,"file not exist");
      	  }
      	  
      	
  		 }
      	 catch(Exception ei) {
      		 JOptionPane.showMessageDialog(null,"check file details");
      	 } 
		}
		
		if(e.getSource()==stbut) {
			try {
//      		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\Software testing.pdf");
      	  if(f.exists()) {
      		  if(Desktop.isDesktopSupported()) {
      			  Desktop.getDesktop().open(f);
      		  }
      		  else {
      			  JOptionPane.showMessageDialog(null,"not Supported");
      		  }
      	  }
      	  else {
      		  JOptionPane.showMessageDialog(null,"file not exist");
      	  }
      	  
      	
  		 }
      	 catch(Exception ei) {
      		 JOptionPane.showMessageDialog(null,"check file details");
      	 } 
		}
		 if(e.getSource()==backbutton) {
			  setVisible(false);
			  new tybcs().setVisible(true);
		  }
	}
	public static void main(String args[]) {
		new tybcs2();
	}
}
