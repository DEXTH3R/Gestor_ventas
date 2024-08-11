
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String Correo, String Pass){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE Correo = ? AND Pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Correo);
            ps.setString(2, Pass);
            rs = ps.executeQuery();
            
            if (rs.next())  {
                l.setID(rs.getInt("ID"));
                l.setNombre(rs.getString("Nombre"));
                l.setCorreo(rs.getString("Correo"));
                l.setPass(rs.getString("Pass"));
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return l;
    }
}
