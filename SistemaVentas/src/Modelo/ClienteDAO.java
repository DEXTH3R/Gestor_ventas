
package Modelo;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente cl) {
        String sql = "INSERT INTO clientes (Cif, Nombre, Telefono, Direccion, Razon) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCif());
            ps.setString(2, cl.getNombre());
            ps.setInt(3, cl.getTelefono());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getRazon());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        
    } 
    
    public List ListarCliente() {
        List<Cliente> ListaCl = new ArrayList();
        String sql = "SELECT * FROM clientes";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Cliente cl = new Cliente();
                
                cl.setID(rs.getInt("ID"));
                cl.setCif(rs.getString("Cif"));
                cl.setNombre(rs.getString("Nombre"));
                cl.setTelefono(rs.getInt("Telefono"));
                cl.setDireccion(rs.getString("Direccion"));
                cl.setRazon(rs.getString("Razon"));
                
                ListaCl.add(cl);               
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaCl;
    }
}
