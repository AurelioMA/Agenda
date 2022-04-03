import javax.swing.*;
import java.awt.*;

public class JFrameAgregar extends JFrame {
   PanelAgregar agr = new PanelAgregar();
   
   public JFrameAgregar() {  
     super.setVisible(false);
     //super.dispose();
      initComponents();
      
   }
   
   private void initComponents() {
      //super.setVisible(false);
      //super.dispose();
      setSize(300, 200);
      setTitle("AGENDA");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(agr);
      setVisible(true);
       
   }   
}
