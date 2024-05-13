package demologin;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.*;


import javax.swing.*;
public class fybcs extends JFrame implements ActionListener  {
	JButton book1;
     fybcs(){
    	 setLayout(null);
         setSize(1800,900);
         setVisible(true);
         setResizable(false);
         JLabel main=new JLabel();
         ImageIcon img=new ImageIcon(getClass().getResource("/bookback2.jpg"));
         main.setIcon(img);
         main.setBounds(90,0,1200,900);
         getContentPane().add(main);
         
          book1=new JButton("book1");
          book1.setBounds(120,50,320,50);
          main.add(book1);
          book1.addActionListener(this);
    	 
    	 
     }
     public void actionPerformed(ActionEvent e) {
    	 if(e.getSource()==book1)
    	 {
    		 try {
//        		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandelr"+"E:\\vaishnavi\\java project\\eclipse-workspace\\demologin\\pdf\\book1ty.pdf");
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
    	 
     }
     public static void main(String args[]) {
    	 new fybcs();
     }
}
