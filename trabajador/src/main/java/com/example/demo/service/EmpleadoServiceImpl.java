package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

// A ÉSTA CLASE SE LE DEBE DE AGREGAR DECORADORES PARA QUE HIBERNATE REALICE EL MAPEO

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	//CON EL AUTOWIRED TRAEMOS LAS FUNCIONALIDADES DEL DAO, debemos de importar
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {// CON LA INSTANCIACION DEL DAO SOLO IMPLEMENTAMOS LOS MÉTODOS PARA OBTENER RESPUESTA CON LA BASE DDE DATOS HACIENDO USO DE ESA INSTANCIA
		
		return iEmpleadoDAO.findAll();//el método findall UBICA TODOS LOS REGISTROS
	}

	@Override
	public void deleteEmpleado(Long id) {		
		iEmpleadoDAO.deleteById(id);
	}

	@Override
	public Empleado actualizaEmpleado(Empleado emple) {
		
		return iEmpleadoDAO.save(emple); //EL MÉTODO ""save" ALMACENA DIRECTAMENTE ENTIDADES
	}

	@Override
	public Empleado agregaEmpleado(Empleado emple) {
		
		return iEmpleadoDAO.save(emple);
	}

	@Override
	public List<Empleado> filtraEmpleado(String apellido) {
		
		return iEmpleadoDAO.findByApellido(apellido); //EL MÉTODO AL QUE HACE REFERENCIA SOBRE EL FILTRADO SE DEFINE EN EL DAO
	}
	
	
	
}
