package modelo.vo;

/**
 * 
 * @author onitaku
 *
 */

public class ClienteVO {

	private String nifCliente;
	private String nombreCliente;
	private String direccionCliente;

	public ClienteVO() {
	}

	public ClienteVO(String nifCliente, String nombreCliente, String direccionCliente) {
		super();
		this.nifCliente = nifCliente;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}

	/**
	 * @return the idCliente
	 */
	public String getNifCliente() {
		return nifCliente;
	}

	/**
	 * @param nifCliente
	 *            the idCliente to set
	 */
	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @param nombreCliente
	 *            the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	/**
	 * @return the direccionCliente
	 */
	public String getDireccionCliente() {
		return direccionCliente;
	}

	/**
	 * @param direccionCliente
	 *            the direccionCliente to set
	 */
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
}
