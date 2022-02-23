package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;


@RestController // LOS DECORADORES SON IMPRESCINDIBLES EN EL LLAMADO DE LOS REQUEST
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	
	// CRUDS SENTENCIAS
	//SELECCIONA TODOS LOS REGISTROS
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminaEmpleado(@PathVariable(name="id")Long id) { //USO DEL MÉTODO PATH VARIABLE PARA PARAMETRIZAR POR URL EL VALOR A INDICAR
		empleadoServiceImpl.deleteEmpleado(id);
	}
	
	@PostMapping("/empleados")
	public Empleado agregaEmpleado(@RequestBody Empleado emple) { //ENLAZA AL EMPREADO A TRAVÉS DEL @REQUESTBODY
		return empleadoServiceImpl.agregaEmpleado(emple);
	}
	
	
	//MÉTODO QUE PARAMETRIZA EL FILTRO DE LA CONSULTA
	@GetMapping("/empleados/apellido/{apellido}")
	public List<Empleado> filtraEmpleado(@PathVariable(name ="apellido")String apellido){//CON EL PATH SE EMBEDE LA CONSULTA QUE LE INDICAMOS CON EL STRING, LA SINTAXIS DEBE DE SER TAL CUAL
		return empleadoServiceImpl.filtraEmpleado(apellido); 	
	}
}

