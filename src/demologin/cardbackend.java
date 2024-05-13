package demologin;
import javax.swing.*;
import java.sql.*;
public class cardbackend {
	Connection con;
	Statement smt;
	cardbackend(){
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/card","root","");
			System.out.println("connected");
			smt=con.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String [] args) {
		new cardbackend();
	}

}
