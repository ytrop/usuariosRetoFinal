package com.nttdata.desafiofinal.usuarios.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.desafiofinal.usuarios.entity.Usuarios;
import com.nttdata.desafiofinal.usuarios.repository.UsuarioRepository;


@Service
public class UsuariosService {
	
@Autowired
    private UsuarioRepository usuarioRepository;


public Usuarios saveUser(Usuarios usuario) {
   
    return usuarioRepository.save(usuario);
}


}	
	

