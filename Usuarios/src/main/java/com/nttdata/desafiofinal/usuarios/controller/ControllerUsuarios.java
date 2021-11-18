package com.nttdata.desafiofinal.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.desafiofinal.usuarios.entity.Usuarios;
import com.nttdata.desafiofinal.usuarios.servicio.UsuariosService;

@RestController
@RequestMapping("/users")
public class ControllerUsuarios {

@Autowired
	private UsuariosService userService;

@PostMapping("/")

	public Usuarios saveUser(@RequestBody Usuarios usuario) {	        
	        return userService.saveUser(usuario);
	    }



}
