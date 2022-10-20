
import java.awt.*;
import javax.swing.*;

public class Navigation extends JPanel {
   Navigation(){
      this.setBackground(Color.black);
      this.setPreferredSize(new Dimension(100,100));
            this.setLayout(new FlowLayout(FlowLayout.CENTER,0,30));
            JLabel title=new JLabel("Mwanzo Baraka Loans And Savings Sacco");
            title.setFont(new Font("Verdana",Font.PLAIN,30));
            title.setForeground( new Color(22,90,46));
         
            this.add(title);
      
    } 
}
