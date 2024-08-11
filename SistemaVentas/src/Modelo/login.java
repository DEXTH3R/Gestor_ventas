
package Modelo;

public class login {
    private int ID;
    private String Nombre;
    private String Correo;
    private String Pass;

    public login() {
    }
  
    public login(int ID, String Nombre, String Correo, String Pass) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Pass = Pass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}
