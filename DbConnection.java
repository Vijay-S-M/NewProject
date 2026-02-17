package Practice;

import java.sql.*;

public class DbConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/practice";
            String user = "root";
            String pass = "Vijay1*SM";
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT * FROM Books");
            while (rset.next()) {
                System.err.println("BookID : "+rset.getInt(1)+"\tTitle : "+rset.getString(2)+"\t\tAuthorID : "+rset.getInt(3)+"\tTotalCopies : "+rset.getInt(4));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
