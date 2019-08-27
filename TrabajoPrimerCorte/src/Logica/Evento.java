package Logica;

import java.util.Date;

public class Evento {
	
	String codigoEvento;
	Date fechaInicio;
	Date fechaFin;
	
	public String getCodigoEvento() {
		return codigoEvento;
	}
	public void setCodigoEvento(String codigoEvento) {
		this.codigoEvento = codigoEvento;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int calcularDuracion(Date fechaI, Date fechaF) {
		int duracion = 0;
		return duracion;
	}
	public void asignarEmpleado() {
		Raso empleado = new Raso();
		empleado.setNombre("Esteban");
		empleado.setCelular("1314561231");
		empleado.setNumeroCarnet("123");
	}
	
	

}
