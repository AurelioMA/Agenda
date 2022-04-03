import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelPrincipal extends JPanel implements ActionListener {
  private JButton btnAgregar, btnBuscar, btnModificar, btnEliminar;
  
  MPersona mpa = new MPersona();
  
  public PanelPrincipal() {
    setLayout(new GridLayout(7,2));
    btnAgregar = new JButton("Agregar");
    btnAgregar.addActionListener(this);
    btnModificar = new JButton("Modificar");
    btnModificar.addActionListener(this);
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(this);
    
    add(btnAgregar);
    add(btnBuscar);
    add(btnModificar);
    add(btnEliminar);
  }
  
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btnAgregar){
      //System.exit(0);
         JFrameAgregar agr = new JFrameAgregar();
         this.setVisible(false);
      }
      if(e.getSource()==btnBuscar){
      //System.exit(0);
         JFrameBuscar bus = new JFrameBuscar();
         this.setVisible(false);
      }
      if(e.getSource()==btnEliminar){
         JFrameEliminar el = new JFrameEliminar();
         this.setVisible(false);
      }
      if(e.getSource()==btnModificar){
         JFrameModificar mod = new JFrameModificar();
         this.setVisible(false);
      }
      
   }
}