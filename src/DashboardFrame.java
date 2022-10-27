
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class DashboardFrame extends JFrame {
    DashboardFrame(){
         
   Dashboard dashboard= new Dashboard();
         this.setTitle("Mwanzo Baraka Loans");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,1000);
        this.setVisible(true);
        ImageIcon icon= new ImageIcon("./assets/images/logo.jpg");
        this.setIconImage(icon.getImage());
        this.setLayout(new BorderLayout());
        this.add(dashboard,BorderLayout.CENTER);
      
    }
}
