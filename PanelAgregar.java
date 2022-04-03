import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAgregar extends JPanel implements ActionListener {
  private JButton btnGuardar, btnVolver;
  private JTextField txtNombre, txtCumpleanios, txtTelefono, txtEmail;
  private JRadioButton tec, trabajo;
  
  MPersona mpa = new MPersona();
  
  public PanelAgregar() {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(30);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblCumpleanios = new JLabel("Cumpleanios: ", JLabel.RIGHT);
    txtCumpleanios = new JTextField(30);
    add(lblCumpleanios);
    add(txtCumpleanios);

    JLabel lblTelefono = new JLabel("Numero de Celular: ", JLabel.RIGHT);
    txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    JLabel lblEmail = new JLabel("Correo: ", JLabel.RIGHT);
    txtEmail = new JTextField(30);
    add(lblEmail);
    add(txtEmail);
    
    JLabel lblTipo = new JLabel("ELIGE EL TIPO: ", JLabel.CENTER);
    JLabel lblTipo2 = new JLabel("", JLabel.CENTER);
    add(lblTipo);
    add(lblTipo2);

   
    ButtonGroup gpoBotones = new ButtonGroup();
    tec = new JRadioButton("TecNM/CdGuzman", true);
    trabajo = new JRadioButton("Trabajo");
    gpoBotones.add(tec);
    gpoBotones.add(trabajo);
    
    add(tec);
    add(trabajo);
    
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
    btnVolver = new JButton("Volver");
    btnVolver.addActionListener(this);
    
    add(btnGuardar);
    add(btnVolver);
  }
  
  public void actionPerformed(ActionEvent e)
  {
     String tipo = "TecNM";
     if (trabajo.isSelected())
        tipo = "Trabajo";
     if(e.getSource()==btnGuardar){
       if(txtNombre.getText()==null || txtNombre.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }
       else
        if(txtTelefono.getText()==null || txtTelefono.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes capturar su telefono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
        }
        else
        {
          mpa.agregar(txtNombre.getText(), txtCumpleanios.getText(), txtTelefono.getText(),
          txtEmail.getText(), tipo);
          JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);
            txtCumpleanios.setText(null);
            txtTelefono.setText(null);
            txtEmail.setText(null);
            txtNombre.requestFocus();
        }

     }
      if(e.getSource()==btnVolver){
      //System.exit(0);
         JFramePrincipal prin = new JFramePrincipal();
         this.setVisible(false);

      }
  }
}