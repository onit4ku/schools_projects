package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.DbConnection;
import modelo.vo.ProductoVO;

/**
 * 
 * @author onitaku
 *
 */

public class ProductoDAO {

	public void registrarProducto(ProductoVO producto) {
		DbConnection conex = new DbConnection();
		try {
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate("INSERT INTO producto VALUES ('" + producto.getIdProducto() + "', '"
					+ producto.getNombreProducto() + "', '" + producto.getPrecioProducto() + "')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			st.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha registrado el producto");
		}
	}
	
	public ArrayList<ProductoVO> consultarProducto(int documento) {
		ArrayList<ProductoVO> miProducto = new ArrayList<ProductoVO>();
		DbConnection conex = new DbConnection();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM producto where id = ? ");
			consulta.setInt(1, documento);
			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				ProductoVO producto = new ProductoVO(documento, null, null);
				producto.setIdProducto(res.getInt("id_producto"));
				producto.setNombreProducto(res.getString("nombre_producto"));
				producto.setPrecioProducto(res.getBigDecimal("precio_producto"));
				miProducto.add(producto);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar el producto\n" + e);
		}
		return miProducto;
	}

	public ArrayList<ProductoVO> listaDeProductos() {
		ArrayList<ProductoVO> miProducto = new ArrayList<ProductoVO>();
		DbConnection conex = new DbConnection();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM producto");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				ProductoVO producto = new ProductoVO(0, null, null);
				producto.setIdProducto(res.getInt("id_producto"));
				producto.setNombreProducto(res.getString("nombre_producto"));
				producto.setPrecioProducto(res.getBigDecimal("precio_producto"));
				miProducto.add(producto);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar el producto\n" + e);
		}
		return miProducto;
	}

	public void modificarProducto(ProductoVO producto) {
		DbConnection conex = new DbConnection();
		try {
			PreparedStatement ps = conex.getConnection().prepareStatement(
					"UPDATE producto SET nombre_producto = ?, precio_producto = ? WHERE id_producto = ?");
			ps.setString(1, producto.getNombreProducto());
			ps.setBigDecimal(2, producto.getPrecioProducto());
			ps.setInt(3, producto.getIdProducto());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se ha modificado con exito", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			ps.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha modificado el producto");
		}
	}

	public void eliminarProducto(ProductoVO producto) {
		DbConnection conex = new DbConnection();
		try {
			PreparedStatement ps = conex.getConnection().prepareStatement("DELETE FROM producto WHERE id_producto = ?");
			ps.setInt(1, producto.getIdProducto());
			ps.execute();

			JOptionPane.showMessageDialog(null, "Se ha borrado con éxito", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			ps.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se ha borrado el producto");
		}
	}

}
