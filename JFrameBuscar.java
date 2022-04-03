import javax.swing.*;
import java.awt.*;

public class JFrameBuscar extends JFrame {
   PanelBuscar bs = new PanelBuscar();
   
   public JFrameBuscar() {
      initComponents();
   }
   
   private void initComponents() {
      setSize(300,300);
      setTitle("Contactos Registrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(bs);
      setVisible(true);
   }
}