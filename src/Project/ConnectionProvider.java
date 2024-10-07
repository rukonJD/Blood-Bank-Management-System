
package Project;

import java.sql.*;
public class ConnectionProvider {
    public static Connection getcon(){
        
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
              return conn;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
   }
    
}
