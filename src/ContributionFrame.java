
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class ContributionFrame extends JFrame {
    ContributionFrame(){
         Contribution contribution =new Contribution();
       this.setSize(400,400);
       this.setVisible(true);
       this.add(contribution);
    }
    
}
