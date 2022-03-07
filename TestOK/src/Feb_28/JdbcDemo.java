package Feb_28;

/*1.import
 * 2.load and register the driver
 * 3.create a connection
 * 4.create a statement
 * 5.exicute and query
 * 6.process the results
 * 7.close connection
 */

import java.sql.*;
public class JdbcDemo {
public static void main(String[] args) {
	String url="jdbc.mysql";
	String uname="Tiger";
	String pass=" ";
	String query="select * from emp";
try {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection(url,uname,pass);
	
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery(query);
	st.close();
	con.close();	
} catch (Exception e) {
e.printStackTrace();
}
}
}
