import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class PanelModificar extends JPanel implements ActionListener {
   
   MPersona mpm = new MPersona();
   ArrayList<Persona> datosPerM = new ArrayList<Persona>();
   
   private JRadioButton tec, trabajo;
   private JButton btnModificar, btnVolver, btnGuardar, btnBuscar;
   private JTextField txtNuevoNombre,txtNuevoTelefono,txtNuevoCorreo,txtNuevoCum,txtNuevoTipo;
   private JLabel lblNombreNuevo, lblNuevoTelefono, lblCorreoNuevo, lblCumNuevo, lblNuevoTipo,datos;   
   
   int index = 0;
   
   public PanelModificar() {
      
      datosPerM = mpm.datos();
      setLayout(new GridLayout(8,2));
      
      btnBuscar = new JButton("Buscar Nombre");
      btnBuscar.addActionListener(this);
     // btnBuscar.setBounds(30, 90, 45, 30);
      
      btnVolver = new JButton("Volver");
      btnVolver.addActionListener(this);

      lblNombreNuevo = new JLabel("Nombre: ", JLabel.RIGHT);
      txtNuevoNombre = new JTextField(20);
      
      add(lblNombreNuevo);
      add(txtNuevoNombre);
      
      lblNuevoTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
      txtNuevoTelefono= new JTextField(13);
      
      add(lblNuevoTelefono);
      add(txtNuevoTelefono);
         
      JLabel lblCorreoNuevo= new JLabel("Correo: ", JLabel.RIGHT);
      txtNuevoCorreo = new JTextField(30);
      
      add(lblCorreoNuevo);
      add(txtNuevoCorreo);
         
      JLabel lblCumNuevo = new JLabel("Cumpleanios: ", JLabel.RIGHT);
      txtNuevoCum = new JTextField(10);
      
      add(lblCumNuevo);
      add(txtNuevoCum);
    
      JLabel lblNuevoTipo = new JLabel("Tipo: ", JLabel.RIGHT);
      ButtonGroup gpoBotones = new ButtonGroup();
      tec = new JRadioButton("TecNM/CdGuzman", true);
      trabajo = new JRadioButton("Trabajo");
      gpoBotones.add(tec);
      gpoBotones.add(trabajo);
      
      add(lblNuevoTipo);
      add(tec);
      add(trabajo);
 
      btnGuardar = new JButton("Guardar");
      btnGuardar.addActionListener(this);
     
      add(btnBuscar);
      add(btnGuardar);
      add(btnVolver);
   }
   
   public void actionPerformed(ActionEvent e){
      boolean bandera = false;
      int cont = 0, entrada = 0;
      String tipo = "TecNM";
      
      if (trabajo.isSelected()) {
        tipo = "Trabajo";
      }
      
      if(e.getSource()==btnBuscar){
         if(txtNuevoNombre.getText()==null || txtNuevoNombre.getText().isEmpty()){              
            JOptionPane.showMessageDialog(null, "Debes introducir un nombre para buscarlo y modificarlo",
             "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                     
         } else {
            Iterator<Persona> itrPersona = datosPerM.iterator();                        
            while(itrPersona.hasNext()){
               Persona persona = itrPersona.next();                
               if(txtNuevoNombre.getText().equals(persona.getNombre())) {                
                  JOptionPane.showMessageDialog(null, "La persona esta registrada en la agenda", 
                  "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                  bandera = true;
                  cont++;
                               
                  txtNuevoNombre.setText(persona.getNombre()); 
                  txtNuevoTelefono.setText(persona.getTelefono());
                  txtNuevoCorreo.setText(persona.getEmail());
                  txtNuevoCum.setText(persona.getFechaC());                 
               }     
            }
                         
            if(bandera == false)
               JOptionPane.showMessageDialog(null, 
               "La persona que desea modificar no existe", "Aviso" , JOptionPane.INFORMATION_MESSAGE);  
            }
         }       
              
      if(e.getSource()==btnGuardar) {
         if(txtNuevoNombre.getText()==null || txtNuevoNombre.getText().isEmpty() || 
            txtNuevoTelefono.getText()==null || txtNuevoTelefono.getText().isEmpty() ||
            txtNuevoCorreo.getText()==null || txtNuevoCorreo.getText().isEmpty() || 
            txtNuevoCum.getText()==null || txtNuevoCum.getText().isEmpty() ||
            txtNuevoCum.getText()==null || txtNuevoCum.getText().isEmpty()) {
                           
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                           
         }else{
            Iterator<Persona> itrPersona = datosPerM.iterator();                        
            while(itrPersona.hasNext()){
               Persona persona = itrPersona.next();                
               if(txtNuevoNombre.getText().equals(persona.getNombre())) {                             
                  persona.setNombre(txtNuevoNombre.getText());
                  persona.setTelefono(txtNuevoTelefono.getText());
                  persona.setEmail(txtNuevoCorreo.getText());
                  persona.setFechaC(txtNuevoCum.getText());
                  persona.setTipo(tipo);          
               }     
            }
                              
            JOptionPane.showMessageDialog(null, "Se modifico con exito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
            txtNuevoNombre.setText(null); 
            txtNuevoTelefono.setText(null);
            txtNuevoCorreo.setText(null);
            txtNuevoCum.setText(null);             
            txtNuevoNombre.requestFocus();                
         }
      }
      
      if(e.getSource() == btnVolver) {
         JFramePrincipal prin = new JFramePrincipal();
         this.setVisible(false);
      }
   }   
}
