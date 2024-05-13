
package demologin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class filedemo extends JFrame implements ActionListener{
	JTextArea text;
	String fname;
	
	JButton save;
	filedemo(String fname){
		setLayout(null);
		setSize(1900,1000);
		setLocation(10,10);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		text=new JTextArea();
		text.setBounds(10,20,1900,850);
		add(text);
		save=new JButton("Save");
		add(save);
		save.setBounds(1390,900,390,50);
		save.addActionListener(this);
		this.fname=fname;
		
	}
	public void actionPerformed(ActionEvent ae) {
		new notes().setVisible(false);;
		if(ae.getSource()==save) {
			
			
		File f1=new File(fname+".txt");
		System.out.print(fname);
	
			try {
				FileWriter fw=new FileWriter(f1,true);
				fw.write(text.getText());
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String [] args) {
	
	}

}
