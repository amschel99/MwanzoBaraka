
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
          Connect connect= new Connect();

      JButton jButton1= new JButton("Save details");
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
 EventQueue.invokeLater(new Runnable(){
         public void run(){
             jButton1.addActionListener(new ActionListener(){
       
     public void actionPerformed(java.awt.event.ActionEvent evt) {                                         
         try{
            String firstName=jTextField1.getText();
            String lastName= jTextField2.getText();
            String Amount=jFormattedTextField1.getText();
       Connection con= connect.connect_db();
Statement stmt = con.createStatement(); 
ResultSet rs; 
String query="INSERT INTO members VALUES( '" +firstName +"','"+ lastName +"'," + Amount+");";

stmt.executeUpdate(query);
 JOptionPane.showMessageDialog(jButton1, firstName +" registered succesfully");
System.out.print("registered a new member");
 


   }
       catch(Exception e){
           e.printStackTrace();
         
       }
    }
     

   }
   );  
         }});
         
 
   
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

 
    