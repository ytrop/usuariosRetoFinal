package com.nttdata.desafiofinal.usuarios.valueObject;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Departamento {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)	
	  private Long departamentoId;
	  private String departamentoName;
	 
	
	public Long getDepartamentoId() {
		return departamentoId;
	}


	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}


	public String getDepartamentoName() {
		return departamentoName;
	}


	public void setDepartamentoName(String departamentoName) {
		this.departamentoName = departamentoName;
	}


	public Departamento( String deparmentName, Long departmentId){
		super();
		this.departamentoId = departmentId;
		this.departamentoName = deparmentName;
	
	}

}
