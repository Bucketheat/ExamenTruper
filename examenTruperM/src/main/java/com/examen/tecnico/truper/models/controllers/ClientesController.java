package com.examen.tecnico.truper.models.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.tecnico.truper.models.entity.Cliente;
import com.examen.tecnico.truper.models.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	
	private ClienteService service;
	
	
	@PostMapping("/alta")
	public ResponseEntity<?> altaCliente(@RequestBody Cliente cliente){
		Optional<Cliente> opt = service.findById(cliente.getIdCliente());
		
		if(opt.isEmpty()) {
			return ResponseEntity.ok("Cliente ya existente");
		}
		
		return ResponseEntity.ok().body(service.save(cliente));
		
	}
}
