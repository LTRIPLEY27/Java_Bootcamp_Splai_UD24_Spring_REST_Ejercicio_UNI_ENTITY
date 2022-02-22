package dto;
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
@Table(name = "trabajador") // INDICACIÓN DEL NOMBRE DE LA TABLA

public class Trabajador {

	//LOS DECORADORES SEÑALIZAN EL MAPEO A RECURRIR, VALOR A VALOR
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //DECLARA EL VALOR INCREMENTAL
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "salario")
	private double salario;
	@Column(name = "dni")
	private String dni;
	@Column(name = "cargo")
	private String cargo;
	
	public Trabajador() {//CONSTRUCTOR POR DEFECTO
		
	}
	
	public Trabajador(String name, String last, String dni) {
		this.nombre = name;
		this.apellido = last;
		this.dni = dni;
	}

	//MÉTODOS DE ACCESO
	
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setCargo(String cargo) {
		if(cargo.equalsIgnoreCase("junior") || cargo.equalsIgnoreCase("senior") || cargo.equalsIgnoreCase("manager"))  {
			this.cargo = cargo;
		} else {
			this.cargo = "pasante";
		}	
	}
	
	// CASE PARA CADA CASO DEL ENUM Y ASIGNACION CON BASE EN ELLO DEL SALARIO
	public void setSalario() {
		switch(cargo) {
			case "junior":
				this.salario = 1200;
				break;
			case "manager":
				this.salario = 3600;
				break;	
			case "senior":
				this.salario = 1800;
				break;
			default:
				this.salario = 800;
				break;
		}
	}
	
	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", dni=" + dni + ", cargo=" + cargo + "]";
	}
	
	
	}
