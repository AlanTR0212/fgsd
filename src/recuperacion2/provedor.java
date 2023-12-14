package recuperacion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class provedor {

	Connection cx;

	public provedor() {

	}

	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/provedores", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}

	public boolean insertar(Dataprovedor c) {
		PreparedStatement ps = null;
		try {
			ps = conectar().prepareStatement("INSERT INTO provedor VALUES (?,?,?,?,?,?,?)");
			ps.setInt(1, c.getidProvedor());
			ps.setString(2, c.getNombre());
			ps.setString(3, c.getTelfono());
			ps.setString(4, c.getCorreo());
			ps.setString(5, c.getDireccion());
			ps.setString(6, c.getContacto());
			ps.setString(7, c.getUrl());
			ps.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}

	}


	public boolean eliminar(int idProvedor) {
		PreparedStatement ps = null;
		try {
			Dataprovedor x = new Dataprovedor();
			x.setidProvedor(idProvedor);
			if (x.cargar()) {
				ps = conectar().prepareStatement("DELETE FROM provedor WHERE idprovedor=?");
				ps.setInt(1, idProvedor);
				ps.execute();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean actualizar(Dataprovedor c) {
		PreparedStatement ps = null;
		try {
			Dataprovedor x = new Dataprovedor();
			x.setidProvedor(c.getidProvedor());
			if (x.cargar()) {
				ps = conectar().prepareStatement("UPDATE provedor SET nombre=?,telefono=?,correo=?,direccion=?,url=?,contacto=?" + "WHERE idprovedor=?");
				ps.setInt(1, c.getidProvedor());
				ps.setString(2, c.getNombre());
				ps.setString(3, c.getTelfono());
				ps.setString(4, c.getCorreo());
				ps.setString(5, c.getDireccion());
				ps.setString(6, c.getUrl());
				ps.setString(7, c.getContacto());
				
				ps.execute();
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean cargar(Dataprovedor c) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conectar().prepareStatement("SELECT * FROM  provedor WHERE idprovedor=?");
			ps.setInt(1, c.getidProvedor());
			rs = ps.executeQuery();
			if (rs.next()) {
				c.setNombre(rs.getString(2));
				c.setTelfono(rs.getString(3));
				c.setCorreo(rs.getString(4));
				c.setDireccion(rs.getString(5));
				c.setUrl(rs.getString(6));
				c.setContacto(rs.getString(7));
				
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}
}
