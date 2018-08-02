package modelo.vo;

import java.math.BigDecimal;

/**
 * 
 * @author onitaku
 *
 */

public class LineaVO {
	private int idLinea;
	private int cantidadLinea;
	private BigDecimal precioLinea;

	FacturaVO factura;
	ProductoVO producto;

	public LineaVO(int idLinea, int cantidadLinea, BigDecimal precioLinea, FacturaVO factura, ProductoVO producto) {
		super();
		this.idLinea = idLinea;
		this.cantidadLinea = cantidadLinea;
		this.precioLinea = precioLinea;
		this.factura = factura;
		this.producto = producto;
	}

	public int getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}

	public int getCantidadLinea() {
		return cantidadLinea;
	}

	public void setCantidadLinea(int cantidadLinea) {
		this.cantidadLinea = cantidadLinea;
	}

	public BigDecimal getPrecioLinea() {
		return precioLinea;
	}

	public void setPrecioLinea(BigDecimal precioLinea) {
		this.precioLinea = precioLinea;
	}

	public FacturaVO getFactura() {
		return factura;
	}

	public void setFactura(FacturaVO factura) {
		this.factura = factura;
	}

	public ProductoVO getProducto() {
		return producto;
	}

	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}
}