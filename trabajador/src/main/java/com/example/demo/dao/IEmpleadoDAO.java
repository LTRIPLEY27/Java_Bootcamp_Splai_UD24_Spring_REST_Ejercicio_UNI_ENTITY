package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Empleado;

//LA INTERFACE DAO ES IMPERATIVO HEREDE DE JpaRepository, indicando además LA ENTIDAD Y EL TIPO DE DATO DE LA CLAVE PRIMARIA COMO UN LIST
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	public List<Empleado> findByApellido(String apellido); //EL MÉTODO LO IMPLEMENTARA EL SERVICE PARA FILTRAR
}
