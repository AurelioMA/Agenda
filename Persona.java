public class Persona {
    private String Nombre;
    private String Telefono;
    private String FechaC;
    private String Email;
    private String Tipo;
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getFechaC(){
     return FechaC;
    }
    
    public void setFechaC(String fechaC){
        this.FechaC = fechaC;
    }
    
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
   
   public String getTipo(){
     return Tipo;
    }
    
    public void setTipo(String tipo){
        this.Tipo = tipo;
    }
    
     public String getEmail(){
     return Email;
    }
    
    public void setEmail(String email){
        this.Email = email;
    }
    
}