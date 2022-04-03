import java.util.*;
public class MPersona {
   static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
   private Persona objPersona;
   int posicion; 
   public MPersona()
   {}
  
   public void agregar(String nom, String tel, String fech, String correo, String tipo) {
      objPersona = new Persona();
      objPersona.setNombre(nom);
      objPersona.setFechaC(fech);
      objPersona.setTelefono(tel);
      objPersona.setEmail(correo);
      objPersona.setTipo(tipo);
      Arrpersona.add(objPersona);//Agrega el objeto al arrayList
   }

   public void desplegar() {
      System.out.println("PERSONAS EN LA AGENDA"); 
      
      Iterator<Persona> itrPersona = Arrpersona.iterator();
      
      while(itrPersona.hasNext()) {
         Persona persona = itrPersona.next();
         System.out.println("\nNombre: " + persona.getNombre());
         System.out.println("Cumpleanios: " + persona.getFechaC());
         System.out.println("Telefono: " + persona.getTelefono());
         System.out.println("Tipo: " + persona.getTipo());
         System.out.println("Correo: " + persona.getEmail());   
      }
   }
   
   public ArrayList datos() {
      return Arrpersona;
   }
}