package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados(); //MÉTODO QUE RETORNARÁ EL REGISTRO DE EMPLEADOS
	public void deleteEmpleado(Long id);
	public Empleado actualizaEmpleado(Empleado emple); //SE LE DEBE DE SUMINISTRAR POR PARÁMETRO EL EMPLEADO ESPECÍFICO A ACTUALIZAR
	public Empleado agregaEmpleado(Empleado emple);
	public List<Empleado> filtraEmpleado(String apellido);//EL PARÁMETRO DE FILTRO PUEDE VARIAR SEGÚN LE INDIQUEMOS
	
}
