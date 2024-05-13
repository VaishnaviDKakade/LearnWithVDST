package demologin;
import java.sql.*;

public class database {
	Connection con;
	Statement s;
	public database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","");
			System.out.print("connection successful");
			s=con.createStatement();
			
		}
		catch(Exception ex) {
			System.out.print(ex);
		}
	}
	public static void main(String args[]) {
		new database();
	}

}
