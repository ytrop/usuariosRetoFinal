package com.nttdata.desafiofinal.usuarios.valueObject;

import com.nttdata.desafiofinal.usuarios.entity.Usuarios;

public class RestTemplate {
	
	private Usuarios usuario;
	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	private Departamento departamento;
	
	
	public RestTemplate(Usuarios usuario, Departamento departamento) {
		
		this.usuario = usuario;
		this.departamento = departamento;
		
	}

}
