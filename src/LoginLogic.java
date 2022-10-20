
 import java.sql.*;
public final class LoginLogic {
    
   
    LoginLogic(String userName,String password){
        validate_login(userName,password);

        
    }
   public boolean validate_login(String userName, String password){
       try{
          Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DoubleA?","root","@iamLehcsma9");
PreparedStatement pst= conn.prepareStatement("select userName, password from login where userName=? and password=?");
pst.setString(1,userName);
pst.setString(2,password);

ResultSet rs=pst.executeQuery();
 
if(rs.next()){
System.out.print("succesfully logged in");
 
    return true;}
else{
        System.out.print("incorrect credentials");
    return false;
           
       }
   }
       catch(Exception e){
           e.printStackTrace();
         return false;  
       }
         
 }     
 
 
    }
             
            
     


