package demologin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import demologin.cardbackend;
import javax.swing.*;
public class id extends JFrame implements ActionListener{
	JTextField namefield,phonefield,emailfield,cityfield;
	JButton browser,create,backbtn;
	JLabel img;
	Byte personimage=null;
	String filename=null;
	public id() {
		setLayout(null);
		setSize(1300,900);
		setVisible(true);
		setLocation(350,80);
		setResizable(false);
		JLabel frontview=new JLabel("      GENRATE YOUR ID CARD    ");
		frontview.setBounds(380,40,400,30);
		frontview.setForeground(Color.BLUE);
		frontview.setFont(new Font("RUSSO ONE",Font.BOLD,32));
		frontview.setBackground(Color.white);
		frontview.setOpaque(true);
		add(frontview);
		getContentPane().setBackground(Color.white);
		
		JLabel name=new JLabel("Enter Name of Student : ");
		name.setBounds(120,190,560,50);
		name.setFont(new Font("RUSSO ONE",Font.BOLD,15));
		add(name);
		
		namefield=new JTextField();
		namefield.setBounds(350,190,460,40);
		add(namefield);
		
		JLabel phone=new JLabel("Enter Mobile Number : ");
		phone.setBounds(120,260,560,50);
		phone.setFont(new Font("RUSSO ONE",Font.BOLD,15));
		add(phone);
		
		phonefield=new JTextField();
		phonefield.setBounds(350,260,460,40);
		add(phonefield);
		
		JLabel email=new JLabel("Enter Email of Student : ");
		email.setBounds(120,340,560,50);
		email.setFont(new Font("RUSSO ONE",Font.BOLD,15));
		add(email);
		
		emailfield=new JTextField();
		emailfield.setBounds(350,340,460,40);
		add(emailfield);
		
		JLabel city=new JLabel("Enter City : ");
		city.setBounds(120,410,560,50);
		city.setFont(new Font("RUSSO ONE",Font.BOLD,15));
		add(city);
		
		cityfield=new JTextField();
		cityfield.setBounds(350,410,460,40);
		add(cityfield);
		JLabel img=new JLabel("Upload image:");
		img.setFont(new Font("RUSSO ONE",Font.BOLD,15));
		img.setBounds(120,480,190,40);
		add(img);
		browser =new JButton("Browser");
		browser.setBounds(350,480,190,40);
		add(browser);
		browser.addActionListener(this);
		
		
		
		
		create=new JButton("GENRATE ID");
		create.setBounds(888,700,223,50);
		create.setBackground(Color.orange);
		create.addActionListener(this);
		add(create);
		
		
		backbtn=new JButton("Back");
		backbtn.setBounds(580,700,223,50);
		backbtn.setBackground(Color.pink);
		add(backbtn);
		backbtn.addActionListener(this);

	}
	public void actionPerformed(ActionEvent eve) {
		if(eve.getSource()==browser) {
			img=new JLabel();
			img.setBounds(888,200,170,200);
			img.setBackground(Color.LIGHT_GRAY);
			img.setOpaque(true);
			add(img);
			JFileChooser choose=new JFileChooser();
			choose.showOpenDialog(null);
			File f=choose.getSelectedFile();
			filename=f.getAbsolutePath();
			browser.setText(filename);
			
			try {
				ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH ));
				img.setIcon(imageicon);
				File image=new File(filename);
				FileInputStream fis=new FileInputStream(image);
			
			}catch(Exception e) {
				System.out.print(e);
			}
			
		}
		if(eve.getSource()==create) {
			
			 setVisible(false);
			 card c1=new card(filename,namefield.getText(),phonefield.getText(),emailfield.getText(),cityfield.getText());
			 c1.setVisible(true);
			cardbackend cb=new cardbackend();
			String n=namefield.getText();
			String p=phonefield.getText();
			String e=emailfield.getText();
			String c=cityfield.getText();
			String path=filename;
			
		   try {
			   String query="insert into card values('"+n+"','"+p+"','"+e+"','"+c+"','"+path+"')";
			   cb.smt.executeUpdate(query);
//			   System.out.print(n);
		   }catch(Exception exp) {
			   System.out.print(exp);
		   }
			
			
			
			
		}
		 if(eve.getSource()==backbtn) {
       	  setVisible(false);
       	  new select().setVisible(true);
       	  
         }
	}
	public static void main(String args[]) {
		new id();
	}
}
