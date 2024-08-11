
package Modelo;

/**
 *
 * @author JORGY
 */
public class Cliente {
    private int ID;
    private String Cif;
    private String Nombre;
    private int Telefono;
    private String Direccion;
    private String Razon;

    public Cliente() {
    }

    public Cliente(int ID, String Cif, String Nombre, int Telefono, String Direccion, String Razon) {
        this.ID = ID;
        this.Cif = Cif;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Razon = Razon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCif() {
        return Cif;
    }

    public void setCif(String Cif) {
        this.Cif = Cif;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRazon() {
        return Razon;
    }

    public void setRazon(String Razon) {
        this.Razon = Razon;
    }
    
    
    
}
