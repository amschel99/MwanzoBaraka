import java.awt.BorderLayout;
import javax.swing.*;


public class Frame extends JFrame {
     Frame(){
         Login login=new Login();
         Navigation nav=new Navigation();
         this.setTitle("Mwanzo Baraka Loans");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,1000);
        this.setVisible(true);
        ImageIcon icon= new ImageIcon("./assets/images/logo.jpg");
        this.setIconImage(icon.getImage());
        this.setLayout(new BorderLayout());
        this.add(login,BorderLayout.CENTER);
        this.add(nav,BorderLayout.NORTH);
        
    }
    
}