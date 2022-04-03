import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class PanelBuscar extends JPanel implements ActionListener {
   JTextField txtBuscar;
   JCheckBox casilla;
   JLabel lblBuscar, datos;
   JButton btnVolver, btnBuscar;
   MPersona mp = new MPersona();
   ArrayList<Persona> datosPer = new ArrayList<Persona>();
   
   public PanelBuscar() {
      datosPer = mp.datos();
      lblBuscar = new JLabel("Buscar: ", JLabel.LEFT);
      txtBuscar = new JTextField(12);
      add(lblBuscar);
      add(txtBuscar);
      
      btnBuscar = new JButton("Buscar");
      btnBuscar.addActionListener(this);
      add(btnBuscar);
      
      btnVolver = new JButton("Volver");
      btnVolver.addActionListener(this);
      add(btnVolver);
   }
   
   public void actionPerformed(ActionEvent e) {
      boolean bandera = false;
      
      if(e.getSource()==btnBuscar){
         if(txtBuscar.getText()==null || txtBuscar.getText().isEmpty()){      
            JOptionPane.showMessageDialog(null, "Debes introducir un nombre para buscarlo", 
            "Aviso" , JOptionPane.INFORMATION_MESSAGE);         
         }else{
            Iterator<Persona> itrPersona = datosPer.iterator();
            while(itrPersona.hasNext()){
               Persona persona = itrPersona.next();
               if(txtBuscar.getText().equals(persona.getNombre())){
                  JOptionPane.showMessageDialog(null, "La persona esta registrada en la agenda", "Aviso" , JOptionPane.INFORMATION_MESSAGE); 
                  bandera = true;
                        
                  datos = new JLabel();
                  add(datos);
                        
                  datos.setText(String.valueOf("Nombre: "+persona.getNombre()+ 
                  " Telefono: "+ persona.getTelefono()+ " Correo: " + persona.getEmail()+ 
                  " CumpleAños: "+persona.getFechaC()+"Tipo: "+persona.getTipo()));
                                  
                  break;                        
               }                
            }
               
            if(bandera == false){  
               JOptionPane.showMessageDialog(null, "La persona no existe", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
               txtBuscar.setText("");
               txtBuscar.requestFocus();
                  
            }               
         }               
      }
      
      if(e.getSource() == btnVolver) {
         JFramePrincipal prin = new JFramePrincipal();
         this.setVisible(false);
      }
   }
}