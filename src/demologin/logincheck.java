package demologin;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class logincheck extends JFrame implements ActionListener{
	JLabel Id,name;
	int count=0;
	JButton signin,next;
	JTextField nfield;
	JPasswordField idfield;
	logincheck(){
		setLayout(null);
		setLocation(500,150);
		setSize(1000,700);
		setVisible(true);
		JLabel back=new JLabel();
		back.setBounds(0,0,1000,700);
		add(back);
		Image img=new ImageIcon(getClass().getResource("/bookback2.jpg")).getImage();
	    back.setIcon(new ImageIcon(img));
	    Id=new JLabel("ENTER PASSWORD : ");
	    Id.setBounds(240,150,320,50);
	    Id.setFont(new Font("OSWARD",Font.BOLD,16));
	    back.add(Id);
	    Id.setForeground(Color.white);
	    idfield=new JPasswordField();
	    idfield.setBounds(440,150,320,50);
	    back.add(idfield);
	    name=new JLabel("ENTER USERNAME : ");
	    name.setBounds(240,260,320,50);
	    name.setFont(new Font("OSWARD",Font.BOLD,16));
	    back.add(name);
	    name.setForeground(Color.white);
	    nfield=new JTextField();
	    nfield.setBounds(440,260,320,50);
	    back.add(nfield);
	    next=new JButton("Next");
	    next.setBounds(280,390,460,50);
	    next.addActionListener(this);
	    back.add(next);
	    signin=new JButton("Sign up");
	    signin.setBounds(280,450,460,50);
	    back.add(signin);
	    signin.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==signin) {
			this.setVisible(false);
			new Logindemo().setVisible(true);
		}
		if(e.getSource()==next) {
			try {

				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","");
				
				PreparedStatement ps=con.prepareStatement("select *from signin");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					
					String id1=rs.getString("password");
					String name1=rs.getString("name");
					if(id1.equals(idfield.getText()) && (name1.equals(nfield.getText()))){
						count=1;
					}
						
					}
				if(nfield.getText().equals("") && idfield.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "PLEASE FILLL UP THE INFORMATION ");
				}
				else if(count==1) {
					this.setVisible(false);
					new select().setVisible(true);
					
				}
				else {
					 JOptionPane.showMessageDialog(null, "PLEASE SIGNIN FIRST");
				}
				
			}catch(Exception exp) {
				System.out.print(exp);
			}
		}
	}
   public static void main(String []args) {
	   new logincheck();
   }
}
