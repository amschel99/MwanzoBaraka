
import javax.swing.JFrame;


public class GroupFrame extends JFrame {
   GroupFrame(){
       Group group=new Group();
       this.setSize(400,400);
       this.setVisible(true);
       this.add(group);
   } 
    
}
