package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.DbConnection;
import modelo.vo.ClienteVO;

/**
 * 
 * @author onitaku
 *
 */

public class ClienteDAO {
	public void registrarCliente(ClienteVO cliente) {
		DbConnection conex = new DbConnection();
		try {
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate("INSERT INTO cliente VALUES ('" + cliente.getNifCliente() + "', '"
					+ cliente.getNombreCliente() + "', '" + cliente.getDireccionCliente() + "')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			st.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha registrado el cliente");
		}
	}

	public ArrayList<ClienteVO> consultarCliente(int documento) {
		ArrayList<ClienteVO> miCliente = new ArrayList<ClienteVO>();
		DbConnection conex = new DbConnection();

		try {
			PreparedStatement ps = conex.getConnection().prepareStatement("SELECT * FROM cliente where id = ? ");
			ps.setInt(1, documento);
			ResultSet res = ps.executeQuery();

			if (res.next()) {
				ClienteVO cliente = new ClienteVO();
				cliente.setNifCliente(res.getString("nif_cliente"));
				cliente.setNombreCliente(res.getString("nombre_cliente"));
				cliente.setDireccionCliente(res.getString("direccion_cliente"));

				miCliente.add(cliente);
			}
			res.close();
			ps.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido consultar el cliente\n" + e);
		}
		return miCliente;
	}

	public ArrayList<ClienteVO> listaDeClientes() {
		ArrayList<ClienteVO> miCliente = new ArrayList<ClienteVO>();
		DbConnection conex = new DbConnection();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM cliente");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				ClienteVO cliente = new ClienteVO();
				cliente.setNifCliente(res.getString("nif_cliente"));
				cliente.setNombreCliente(res.getString("nombre_cliente"));
				cliente.setDireccionCliente(res.getString("direccion_cliente"));

				miCliente.add(cliente);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido consultar el cliente\n" + e);
		}
		return miCliente;
	}

	public void modificarCliente(ClienteVO cliente) {
		DbConnection conex = new DbConnection();
		try {
			PreparedStatement ps = conex.getConnection().prepareStatement(
					"UPDATE cliente SET nombre_cliente = ?, direccion_cliente = ? WHERE nif_cliente = ?");
			ps.setString(1, cliente.getNombreCliente());
			ps.setString(2, cliente.getDireccionCliente());
			ps.setString(3, cliente.getNifCliente());
			ps.executeUpdate();

			JOptionPane.showMessageDialog(null, "Se ha modificado con exito", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			ps.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha registrado el cliente");
		}
	}

	public void eliminarCliente(ClienteVO cliente) {
		DbConnection conex = new DbConnection();
		try {
			PreparedStatement ps = conex.getConnection().prepareStatement("DELETE FROM cliente WHERE nif_cliente = ?");
			ps.setString(1, cliente.getNifCliente());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Se ha borrado con éxito", "Información",
					JOptionPane.INFORMATION_MESSAGE);

			ps.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha borrado el cliente");
		}
	}
}
