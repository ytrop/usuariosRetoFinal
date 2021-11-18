package com.nttdata.desafiofinal.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.desafiofinal.usuarios.entity.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> { 
	
	 Usuarios getUsuarioByUsuarioId(Long usuariosId); 

}
