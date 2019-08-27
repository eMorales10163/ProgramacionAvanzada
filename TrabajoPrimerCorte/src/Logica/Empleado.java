package Logica;

public class Empleado {
	
	String numeroCarnet;
	String nombre;
	String celular;
	public String getNumeroCarnet() {
		return numeroCarnet;
	}
	public void setNumeroCarnet(String numeroCarnet) {
		this.numeroCarnet = numeroCarnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Empleado [numeroCarnet=" + numeroCarnet + ", nombre=" + nombre + ", celular=" + celular + "]";
	}
	
	

}
