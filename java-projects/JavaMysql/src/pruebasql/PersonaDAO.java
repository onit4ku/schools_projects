package pruebasql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PersonaDAO {

	public void registrarPersona(ClienteDAO persona) {
		DbConnection conex = new DbConnection();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + persona.getIdPersona() + "', '"
					+ persona.getNombrePersona() + "', '" + persona.getEdadPersona() + "', '"
					+ persona.getProfesionPersona() + "', '" + persona.getTelefonoPersona() + "')");
			JOptionPane.showMessageDialog(null, "Se ha registrado con exito", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se Registro la persona");
		}
	}

	public void eliminarPersona(ClienteDAO persona) {
		DbConnection conex = new DbConnection();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id = " + persona.getIdPersona());
			JOptionPane.showMessageDialog(null, "Se ha borrado con exito", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se Borró a la persona");
		}
	}


	public void modificarPersona(ClienteDAO persona) {
		DbConnection conex = new DbConnection();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("UPDATE `persona` SET nombre ='" + persona.getNombrePersona()
					+ " WHERE `persona`.`id` = " + persona.getIdPersona());
			estatuto.executeUpdate("UPDATE `persona` SET edad ='" + persona.getEdadPersona()
					+ " WHERE `persona`.`id` = " + persona.getIdPersona());
			estatuto.executeUpdate("UPDATE `persona` SET profesion ='" + persona.getProfesionPersona()
					+ " WHERE `persona`.`id` = " + persona.getIdPersona());
			estatuto.executeUpdate("UPDATE `persona` SET telefono ='" + persona.getTelefonoPersona()
					+ " WHERE `persona`.`id` = " + persona.getIdPersona());

			JOptionPane.showMessageDialog(null, "Se ha modificado con exito", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se modificó la persona");
		}
	}

	public ArrayList<ClienteDAO> consultarPersona(int documento) {
		ArrayList<ClienteDAO> miEmpleado = new ArrayList<ClienteDAO>();
		DbConnection conex = new DbConnection();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
			consulta.setInt(1, documento);
			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				ClienteDAO persona = new ClienteDAO();
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
				miEmpleado.add(persona);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n" + e);
		}
		return miEmpleado;
	}

	public ArrayList<ClienteDAO> listaDePersonas() {
		ArrayList<ClienteDAO> miEmpleado = new ArrayList<ClienteDAO>();
		DbConnection conex = new DbConnection();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				ClienteDAO persona = new ClienteDAO();
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
				miEmpleado.add(persona);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n" + e);
		}
		return miEmpleado;
	}
}