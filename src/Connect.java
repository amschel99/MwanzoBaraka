


import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    Connect(){
      connect_db();  
    }
     public Connection connect_db (){
        try{
                     Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DoubleA?","root","@iamLehcsma9");
return conn;
            
        }
        catch(Exception e){
       e.printStackTrace();
        }
        return null;
    }
}
