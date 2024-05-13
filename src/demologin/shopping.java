package demologin;
import javax.swing.*;
import java.awt.*;
public class shopping extends JFrame {
	shopping(){
		setLayout(null);
		setSize(1400,1000);
		setVisible(true);
		setLocation(210,25);
		JLabel l1=new JLabel();
		Image img=new ImageIcon(this.getClass().getResource("/atm.jpg")).getImage();
		l1.setIcon(new ImageIcon(img));
		l1.setBounds(210,0,1350,950);

		getContentPane().add(l1);
		setResizable(false);
		 JLabel label=new JLabel("ATM MACHINE");
	        label.setBounds(330,50,300,60);
	        label.setFont(new Font("Osward",Font.BOLD,36));
	        l1.add(label);
	        JLabel label1=new JLabel("Please Enter Your Choice");
	        label1.setBounds(290,345,300,15);
	        label1.setFont(new Font("Osward",Font.BOLD,14));
	        l1.add(label1);
	}

	public static void main(String args[]) {
		new shopping();
	}

}
