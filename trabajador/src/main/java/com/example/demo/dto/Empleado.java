package com.example.demo.dto;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleado") //EL MAPEO DE LA ENTIDA SE DEBE DE EJECUTAR FUERA DE LA CLASE
public class Empleado {

	//DEFINIMOS ATRIBUTOS DE CLASE
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "dni")
	private int dni;
	
	@Temporal(TemporalType.TIMESTAMP) //LAS COLUMNAS DEL FORMATO FECHA SE DEBEN DE INDICAR CON ÉSTE DECORADOR
	private Date fecha;
	
	
//CONSTRUCTOR POR DEFECTO
	public Empleado() {
		
	}
	// TANTO EL CONSTRUCTOR COMO LOD MÉTODOS DE ACCESO DEBEN DE SEÑAR EL ID PUES DEBERÁ DE ACTUALIZARSE INDEPENDIENTEMENTE DE QUE SEA AUTOINCREMENTAL
	// CON PARÁMETROS
	public Empleado(Long id, String nombre, String apellido, String direccion, int dni, Date fecha) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.direccion = direccion;
	this.dni = dni;
	this.fecha = fecha;
}

// SE LE DEBEN DE INDICAR LOS GETTERS Y SETTERS SIN IMPORTAR QUE SEA AUTOINCREMENTAL
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	// MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}
	
	
	
}
