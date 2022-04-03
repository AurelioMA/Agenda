import javax.swing.*;
import java.awt.*;

public class JFramePrincipal extends JFrame {
   PanelPrincipal mostrar = new PanelPrincipal();
   
   public JFramePrincipal() {  
      initComponents();
   }
   
   private void initComponents() {
      //super.setVisible(false);
      //super.dispose();
      setSize(300, 200);
      setTitle("Principal");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
      
   }   
}