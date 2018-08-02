package modelo.vo;

import java.sql.Date;

/**
 * 
 * @author onitaku
 *
 */

public class FacturaVO {
	private String numFactura;
	private Date fechaFactura;

	ClienteVO cliente;

	public FacturaVO(String numFactura, Date fechaFactura, ClienteVO cliente) {
		super();
		this.numFactura = numFactura;
		this.fechaFactura = fechaFactura;
		this.cliente = cliente;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String string) {
		this.numFactura = string;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public ClienteVO getCliente(String nifCliente, String nombreCliente, String direccionCliente) {
		nifCliente = cliente.getNifCliente();
		nombreCliente = cliente.getNombreCliente();
		direccionCliente = cliente.getDireccionCliente();
		cliente = new ClienteVO(nifCliente, nombreCliente, direccionCliente);
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
}