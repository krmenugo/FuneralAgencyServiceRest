package com.krmenugo.agency.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krmenugo.agency.control.error.control.BaseController;
import com.krmenugo.agency.dto.AssistanceDTO;
import com.krmenugo.agency.model.Assistance;
import com.krmenugo.agency.service.impl.AssistanceServiceImplement;

@RestController
@RequestMapping("/assistance")
public class AssistanceController extends BaseController {
	
	@Autowired
	private AssistanceServiceImplement service;
	
	@GetMapping("/find/id/{idAssistance}")
	public AssistanceDTO findAssistanceById(@PathVariable(value = "idAssistance") Integer idAssistance) {
		return new AssistanceDTO().parseToDTO(this.service.findById(idAssistance));
	}
	
	// TODO PROBLEMAS CON EL FORMATO DE FECHA
	@PostMapping("/create")
	public AssistanceDTO createAssistance(@Valid @RequestBody Assistance model) {
		return new AssistanceDTO().parseToDTO(this.service.create(model));
	}
	
	@PutMapping("/update")
	public AssistanceDTO updateAssistance(@Valid @RequestBody Assistance assistance) {
		return new AssistanceDTO().parseToDTO(this.service.update(assistance));
	}
	
	@DeleteMapping("/delete/id/{idAssistance}")
	public ResponseEntity<Assistance> deleteAssistance(@PathVariable("idAssistance") Integer idAssistance) {
		service.delete(idAssistance);
		return ResponseEntity.ok().build();
	}

}