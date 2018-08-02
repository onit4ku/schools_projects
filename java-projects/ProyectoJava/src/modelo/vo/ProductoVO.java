package modelo.vo;

import java.math.BigDecimal;

/**
 * 
 * @author onitaku
 *
 */

public class ProductoVO {
	private int idProducto;
	private String nombreProducto;
	private BigDecimal precioProducto;
	
	public ProductoVO(){
		
	}

	public ProductoVO(int idProducto, String nombreProducto, BigDecimal precioProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public BigDecimal getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(BigDecimal precioProducto) {
		this.precioProducto = precioProducto;
	}
}