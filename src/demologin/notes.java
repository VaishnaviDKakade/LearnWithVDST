package demologin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class notes extends JFrame implements ActionListener{
	JTextField filenfield;
	JButton create;
	JButton backbutton;
	public String fname;
	notes(){
		setLayout(null);
		setSize(1000,650);
		setLocation(500,150);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		JLabel back=new JLabel();
		back.setBounds(0,-200,1140,1000);
		Image img=new ImageIcon(getClass().getResource("/fileback.jpg")).getImage();
		back.setIcon(new ImageIcon(img));
		add(back);
		
		
		JLabel filename=new JLabel("Enter FileName :");
		filename.setBounds(120,350,270,50);
		filename.setForeground(Color.white);
		filename.setFont(new Font("OSWARD",Font.BOLD,26));
		filenfield=new JTextField();
		filenfield.setBounds(400,350,390,40);
		back.add(filename);
		back.add(filenfield);
		create =new JButton("CREATE");
		create.setBounds(300,500,350,50);
		create.addActionListener(this);
		back.add(create);
		
		backbutton=new JButton("Back");
	    backbutton.setBounds(700,510,150,40);
	    backbutton.setBackground(Color.decode("#228B22"));
	    backbutton.setForeground(Color.WHITE);
	    backbutton.addActionListener(this);
	    add(backbutton);
	    
		
		
		
	}
	
	public void actionPerformed(ActionEvent acv) {
		if(acv.getSource()==create) {
			
			setVisible(false);
			fname=filenfield.getText();
			System.out.print(fname);
			new filedemo(fname).setVisible(true);
		}
		  if(acv.getSource()==backbutton) {
			  setVisible(false);
			  new select().setVisible(true);
		  }
	}
	public static void main(String [] args) {
		new notes();
	}

}
