import javax.swing.*;
import java.awt.*;

public class JFrameModificar extends JFrame {
   PanelModificar mod = new PanelModificar();
  
   public JFrameModificar() {
      initComponents();
   }
   
   private void initComponents() {
      setSize(500,250);
      setTitle("Modificar Contacto");

      setResizable(true);
      setVisible(true);
      
      setContentPane(mod); 
   }
}