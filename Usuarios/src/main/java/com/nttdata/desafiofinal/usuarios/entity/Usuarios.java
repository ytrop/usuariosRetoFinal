package com.nttdata.desafiofinal.usuarios.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuarios {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long usuarioId;
	 private String nombre;
	 private String apellido;
	 private Long departamentoId;
	
	 public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
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
	public Long getDepartamentoId() {
		return departamentoId;
	}
	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}
	
	public Usuarios( String nombre, Long usuarioId, String apellido, Long departamentoId){
		super();
		this.usuarioId = usuarioId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamentoId = departamentoId;
	
	}
}
