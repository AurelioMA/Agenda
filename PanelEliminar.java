import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class PanelEliminar extends JPanel implements ActionListener {
   JTable tabla;
   JScrollPane scroll = new JScrollPane();
   JButton btnVolver, btnEliminar;
   MPersona mP = new MPersona();
   ArrayList<Persona> datosP = new ArrayList<Persona>();
   
   public PanelEliminar() {
      datosP = mP.datos();
      String titulos [] = {"Nombre", "Telefono", "Cumpleanios", "Correo Electronico", "Tipo de Contacto"};
      String info [][] = obtenerDatos();
      setLayout (new GridLayout(1,1));
     
      tabla = new JTable(info, titulos);
      tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      scroll.setViewportView(tabla);
      add(scroll);
      
      btnVolver = new JButton("Volver");
      btnVolver.addActionListener(this);
      add(btnVolver);
      
      btnEliminar = new JButton("Eliminar");
      btnEliminar.addActionListener(this);
      add(btnEliminar);
      //PanelEliminar.setLayout(null);
   }   
  
   private String[][] obtenerDatos() {
      int x=0;
      String informacion[][] = new String[datosP.size()][5];
      Iterator<Persona> itrPersona = datosP.iterator();
      while(itrPersona.hasNext()){
         Persona persona = itrPersona.next();
         informacion[x][0] = persona.getNombre();
         informacion[x][1] = persona.getFechaC();
         informacion[x][2] = persona.getTelefono();
         informacion[x][3] = persona.getEmail();
         informacion[x][4] = persona.getTipo();
         x++;
      }
      return informacion;
   }
  
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == btnVolver) {
         JFramePrincipal prin = new JFramePrincipal();
         this.setVisible(false);
      }
      
      if(e.getSource() == btnEliminar){
         int fila= tabla.getSelectedRow();
         if(fila>=0){
            int rpta = JOptionPane.showConfirmDialog(this, "Deseas eliminar la fila", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            if(rpta == JOptionPane.YES_OPTION){
               datosP.remove(fila); 
               JOptionPane.showMessageDialog(null, "La persona ha sido eliminada", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
               JFramePrincipal prin = new JFramePrincipal();
               this.setVisible(false);
            }
         }else{
            JOptionPane.showMessageDialog(null,"Seleccione fila");
         }
      } 
   }
}