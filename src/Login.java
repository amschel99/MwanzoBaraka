
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class Login extends JPanel  {

      

    Login(){
 


      
        
    
      
     
     
     JLabel userNameLabel=new JLabel("USER NAME");
        JButton login=new JButton("Login");
          JButton reset=new JButton("Reset Password");
        login.setBounds(120,150,80,30);
          reset.setBounds(210,150,130,30);
        userNameLabel.setBounds(10,10,120,100);
        JLabel passwordLabel= new JLabel("PASSWORD");
             passwordLabel.setBounds(10,60,100,100);
         JTextField userName=new JTextField();
        JPasswordField password= new JPasswordField();
         userName.setBounds(120,50,220,25);
         
           password.setBounds(120,100,220,25);
        passwordLabel.setForeground(Color.blue);
        passwordLabel.setFont(new Font("Verdana",Font.BOLD,12));
         userNameLabel.setFont(new Font("Verdana",Font.BOLD,12));
           userNameLabel.setForeground(Color.blue);
         login.setMnemonic(KeyEvent.VK_B);
login.setActionCommand("login"); 
 

login.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent actionEvent) {
            
            String user_name_value=userName.getText();
                      String password_value=password.getText();
                           LoginLogic login_logic= new  LoginLogic(user_name_value,password_value);
               
               String command = actionEvent.getActionCommand(); 
         boolean isCorrectUser=login_logic.validate_login(user_name_value,password_value);
         if(isCorrectUser){
             JOptionPane.showMessageDialog(login, "Login was succesful");
            
           
         new DashboardFrame();
         }
          if(!isCorrectUser){
             JOptionPane.showMessageDialog(login, "Login failed!");
         }
             

               
           }
    
}); 
      this.setBackground(Color.gray);
      this.setPreferredSize(new Dimension(100,100));
      this.setLayout(null);
      this.add(userNameLabel);
      this.add(userName);
          this.add(password);
         this.add(passwordLabel);
         this.add(login);
         this.add(reset);
     
        
    
}


}
