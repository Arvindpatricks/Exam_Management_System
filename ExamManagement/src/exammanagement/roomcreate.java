/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exammanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Arvind
 */
public class roomcreate {
    roomcreate()
    {
     try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost/exam_man?"+
                    "user=root&password=root";
            Connection con= (Connection) DriverManager.getConnection(connectionUrl);
       Statement stmt=null;
       stmt=con.createStatement();
       ResultSet rs = null; // SQL query command 
       rs = stmt.executeQuery("SELECT * FROM rooms"); 
       int count=0,count1=0;
String[] s =new String[20];
String [] cls = new String[30];
       while (rs.next()) 
            {
                String number = rs.getString("No");
                s[count++]=number;
                
               // num = Integer.parseInt(rs.getString("num"));
             }
       con.close();
       rs.close();
           }catch(SQLException e ) {
            System.out.println("SQL Exception:"+e.toString());
        }catch(ClassNotFoundException ce){
            System.out.println("Class Not Found Exception:"+ ce.toString());
        }
    
    }
            
}
