package demologin;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.*;
import javax.swing.*;
public class tybcs extends JFrame implements ActionListener{
	JButton computernet,oprating,javbut,pythonbut,tcsbut,wbbut,sem2;
	JButton backbutton;
	tybcs(){
		setLayout(null);
		setSize(2000,1000);
		setLocation(0,0);
		setVisible(true);
		JLabel label=new JLabel();
		label.setBounds(0,0,1600,900);
		getContentPane().setBackground(Color.BLACK);
		add(label);
		
		JPanel cn2=new JPanel();
		cn2.setBounds(120,50,340,360);
		label.add(cn2);
		JLabel cn=new JLabel();
		cn.setBounds(0,10,340,340);
		Image cnimg=new ImageIcon(getClass().getResource("/cn2.png")).getImage();
		cn.setBounds(0,10,340,400);
		cn.setIcon(new ImageIcon(cnimg));
		computernet=new JButton("COMPUTER NETWORK -2");
		computernet.setBounds(15,270,290,60);
		computernet.setBackground(Color.BLACK);
		computernet.setForeground(Color.white);
		computernet.addActionListener(this);
		
		cn.add(computernet);
		
		cn2.add(cn);
		
		JPanel os1=new JPanel();
		os1.setBounds(520,50,340,360);
		label.add(os1);
		JLabel os=new JLabel();
		cn.setBounds(0,10,340,340);
		Image osimg=new ImageIcon(getClass().getResource("/os1.png")).getImage();
		os.setBounds(0,10,340,400);
		os.setIcon(new ImageIcon(osimg));
		oprating=new JButton("OSRATING SYSTEM");
		oprating.setBounds(15,270,290,60);
		oprating.setBackground(Color.BLACK);
	    oprating.setForeground(Color.white);
	    oprating.addActionListener(this);
		
		os.add(oprating);
		
		os1.add(os);
		
		
		JPanel java1=new JPanel();
		java1.setBounds(920,50,340,360);
		label.add(java1);
		JLabel java=new JLabel();
		cn.setBounds(0,10,340,340);
		Image javaimg=new ImageIcon(getClass().getResource("/java1.png")).getImage();
		java.setBounds(0,10,340,400);
		java.setIcon(new ImageIcon(javaimg));
		javbut=new JButton("JAVA");
		javbut.setBounds(15,270,290,60);
	    javbut.setBackground(Color.BLACK);
		javbut.setForeground(Color.white);
		javbut.addActionListener(this);
		java.add(javbut);
		
		java1.add(java);
		
		
		JPanel python1=new JPanel();
		python1.setBounds(1340,50,370,360);
		label.add(python1);
		JLabel python=new JLabel();
		python.setBounds(0,10,340,340);
		Image pythonimg=new ImageIcon(getClass().getResource("/python.png")).getImage();
		python.setBounds(0,10,340,400);
		python.setIcon(new ImageIcon(pythonimg));
		pythonbut=new JButton("PYTHON");
		pythonbut.setBounds(15,270,290,60);
	    pythonbut.setBackground(Color.BLACK);
		pythonbut.setForeground(Color.white);
		pythonbut.addActionListener(this);
		
		python.add(pythonbut);
		
		python1.add(python);

		
		JPanel wb1=new JPanel();
		wb1.setBounds(120,450,340,360);
		label.add(wb1);
		JLabel wb=new JLabel();
		wb.setBounds(0,10,340,340);
		Image wbimg=new ImageIcon(getClass().getResource("/wb1.png")).getImage();
		wb.setBounds(0,10,340,400);
		wb.setIcon(new ImageIcon(wbimg));
		wbbut=new JButton("WEB TECHNOLOGY");
		wbbut.setBounds(15,270,290,60);
		wbbut.setBackground(Color.BLACK);
	    wbbut.setForeground(Color.white);
	    wbbut.addActionListener(this);
		
		wb.add(wbbut);
		
		wb1.add(wb);
		
		
		JPanel tcs1=new JPanel();
		tcs1.setBounds(520,450,340,360);
		label.add(tcs1);
		JLabel tcs=new JLabel();
		tcs.setBounds(0,10,340,340);
		Image tcsimg=new ImageIcon(getClass().getResource("/tcs.png")).getImage();
		tcs.setBounds(0,10,340,400);
		tcs.setIcon(new ImageIcon(tcsimg));
		tcsbut=new JButton("THEROTICAL COMPUTER SCIENCE");
		tcsbut.setBounds(15,270,290,60);
		tcsbut.setBackground(Color.BLACK);
	    tcsbut.setForeground(Color.white);
	    tcsbut.addActionListener(this);
		tcs.add(tcsbut);
		
		tcs1.add(tcs);
		
		sem2=new JButton("SECOND SEMISTER");
		sem2.setBounds(1400,850,210,50);
		label.add(sem2);
		sem2.setBackground(Color.decode("#228B22"));
		sem2.setForeground(Color.WHITE);
	    sem2.addActionListener(this);
		
	    backbutton=new JButton("Back");
	    backbutton.setBounds(1200,850,150,50);
	    backbutton.setBackground(Color.decode("#228B22"));
	    backbutton.setForeground(Color.WHITE);
	    backbutton.addActionListener(this);
	    add(backbutton);
	   
		
	    
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==computernet) {
			try {
//       		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
       	  File f=new File("E:\\\\vaishnavi\\\\java project\\\\eclipse-workspace\\\\demologin\\\\pdf\\\\book1ty.pdf");
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
       	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\os1.pdf");
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
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\java1.pdf");
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
		
		if(e.getSource()==pythonbut) {
			try {
//      		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\python.pdf");
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
		
		if(e.getSource()==tcsbut) {
			try {
//      		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
      	  File f=new File("E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\tcs.pdf");
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
		
		
		if(e.getSource()==sem2) {
			setVisible(false);
			new tybcs2().setVisible(true);
		}
		 if(e.getSource()==backbutton) {
			  setVisible(false);
			  new books().setVisible(true);
		  }
	}
	public static void main(String args[]) {
		new tybcs();
	}
}
