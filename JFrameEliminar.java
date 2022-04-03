import javax.swing.*;
import java.awt.*;

public class JFrameEliminar extends JFrame {
   PanelEliminar el = new PanelEliminar();
  
   public JFrameEliminar() {
      initComponents();
   }
  
   private void initComponents() {
      setSize(300,300);
      setTitle("Contactos Registrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(el);
      setVisible(true);
   }
}