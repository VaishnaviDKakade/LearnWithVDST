package demologin;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;


public class card extends JFrame {
	JLabel img;
card(String path,String name,String phone,String email,String city){
	setSize(1200,800);
	setVisible(true);
	setLayout(null);
	setResizable(false);
	setLocation(380,100);
	getContentPane().setBackground(Color.decode("#6600cc"));
	JPanel backPanel=new JPanel();
	backPanel.setBounds(360,80,450,550);
	backPanel.setBackground(Color.white);
	add(backPanel);
	
	JLabel cname=new JLabel("New Arts,Commerce and Science College shevgaon");
	cname.setBounds(20,16,500,30);
	cname.setFont(new Font("OSWARD",Font.BOLD,20));
	cname.setForeground(Color.RED);
	backPanel.add(cname);
	img=new JLabel();
	img.setBounds(130,70,170,200);
	img.setBackground(Color.LIGHT_GRAY);
	img.setOpaque(true);
	backPanel.setBorder(null);
	backPanel.add(img);
	try {
		ImageIcon imageicon=new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH ));
		img.setIcon(imageicon);
		File image=new File(path);
		FileInputStream fis=new FileInputStream(image);
	
	}catch(Exception e) {
		System.out.print(e);
	}
//    id i1=new id();
	backPanel.setLayout(null);
	JLabel n=new JLabel("Name:                        "+name);
	n.setBounds(40,320,520,30);
	n.setFont(new Font("OSWARD",Font.BOLD,16));
	backPanel.add(n);
	
	JLabel p=new JLabel("Phone number :       "+phone);
	p.setBounds(40,350,520,30);
	p.setFont(new Font("OSWARD",Font.BOLD,16));
	backPanel.add(p);
	
	JLabel e=new JLabel("Email :                        "+email);
	e.setBounds(40,380,520,30);
	e.setFont(new Font("OSWARD",Font.BOLD,16));
	backPanel.add(e);
	
	JLabel c=new JLabel("City  :                          "+city);
	c.setBounds(40,410,520,30);
	c.setFont(new Font("OSWARD",Font.BOLD,16));
	backPanel.add(c);
}
public static void main(String [] args) {
//	new card();
}
}
