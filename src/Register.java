
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
        import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Register extends JFrame {


     Register() {

      JButton jButton1= new JButton();
   JFormattedTextField  jFormattedTextField1= new JFormattedTextField ();
JLabel jLabel1= new JLabel("First Name");
   JLabel jLabel2= new JLabel(" Last Name");
  JLabel jLabel3= new JLabel("Amount");
  
  
JLabel jLabel4= new JLabel();

  
     

JTextField jTextField1= new JTextField();
   JTextField jTextField2= new JTextField();
   
   
 
         
          jLabel1.setBounds(10,10,120,100);
          jLabel2.setBounds(10,60,100,100);
              jLabel3.setBounds(10,110,100,100);
                jTextField1.setBounds(120,50,220,25);
                jTextField2.setBounds(120,100,220,25);
                jFormattedTextField1.setBounds(120,150,220,25);
                jButton1.setBounds(120,200,80,30);
   
   jButton1.addActionListener(new ActionListener(){
     public void actionPerformed(java.awt.event.ActionEvent evt) {                                         
         try{
            String firstName=jTextField1.getText();
            String lastName= jTextField2.getText();
            String Amount=jFormattedTextField1.getText();
          Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DoubleA?","root","@iamLehcsma9");
Statement stmt = con.createStatement(); 
ResultSet rs; 
String query="INSERT INTO members(firstName,lastName,Amount) VALUES("+firstName +","+ lastName +"," + Amount+");";
rs = stmt.executeQuery(query);

 
if(rs.next()){
System.out.print("Succesfully registered a member");
 
}
else{
        System.out.print("incorrect credentials");

           
       }
   }
       catch(Exception e){
           e.printStackTrace();
         
       }
    }
     

   }
   );
   
   this.setSize(400,400);
     this.setVisible(true);
    this.setLayout(null);
 
   this.add(jLabel1);
    this.add(jLabel2);
    this.add(jLabel3);
      this.add(jTextField1);
        this.add(jTextField2);
         this.add(jFormattedTextField1); 
         this.add(jButton1);
     this.setVisible(true);
  
   
           
    }}

 
    