package personas;

public class PersonaVo {

	private Integer idPersona;
	private String nombrePersona;
	private String apellido1Persona;
	private String apellido2Persona;
	private String direccionPersona;

	private Fecha fechaNacimiento;

	
	private Integer edadPersona;
	private String profesionPersona;
	private Integer telefonoPersona;

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fecha) {
		fechaNacimiento.setDia(fecha.getDia());
		fechaNacimiento.setMes(fecha.getMes());
		fechaNacimiento.setAnyo(fecha.getAnyo());
	}
	
	public String getDireccionPersona() {
		return direccionPersona;
	}

	public void setDireccionPersona(String direccionPersona) {
		this.direccionPersona = direccionPersona;
	}

	public String getApellido1Persona() {
		return apellido1Persona;
	}

	public void setApellido1Persona(String apellido1Persona) {
		this.apellido1Persona = apellido1Persona;
	}

	public String getApellido2Persona() {
		return apellido2Persona;
	}

	public void setApellido2Persona(String apellido2Persona) {
		this.apellido2Persona = apellido2Persona;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

}
