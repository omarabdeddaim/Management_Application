
package gestion_ressources_humains;

import java.sql.*;

public class ConnexionJM {

    
    public static void main(String[] args) {
        // TODO code application logic here
     Connection conn=connecterDB();
    }
    public static Connection connecterDB(){
        try{ Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver oky");
        String url="jdbc:mysql://localhost:3306/db_gstproduit";
        String user="root";
        String password="";
        Connection conn=DriverManager.getConnection(url, user, password);
        System.out.println("connextion bien établie");
        return conn;
            
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}