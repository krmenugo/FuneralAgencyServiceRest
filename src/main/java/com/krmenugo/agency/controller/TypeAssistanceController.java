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

import com.krmenugo.agency.dto.TypeAssistanceDTO;
import com.krmenugo.agency.model.TypeAssistance;
import com.krmenugo.agency.service.impl.TypeAssistanceServiceImplement;

@RestController
@RequestMapping("/typeAssistance")
public class TypeAssistanceController {

	@Autowired
	private TypeAssistanceServiceImplement service;
	
	@GetMapping("/find/id/{idTypeAssistance}")
	private TypeAssistanceDTO findTypeAssistanceById(@PathVariable(value="idTypeAssistance") Integer idTypeAssistance) {
		return new TypeAssistanceDTO().parseToDTO(this.service.findById(idTypeAssistance));
	}
	
	@PostMapping("/create")
	private TypeAssistanceDTO createTypeAssistance(@RequestBody TypeAssistance model) {
		return new TypeAssistanceDTO().parseToDTO(this.service.create(model));
	}
	
	@PutMapping("/update")
	private TypeAssistanceDTO updateTypeAssistance(@Valid @RequestBody TypeAssistance model) {
		return new TypeAssistanceDTO().parseToDTO(this.service.update(model));
	}
	
	@DeleteMapping("/delete/id/{idTypeAssistance}")
	public ResponseEntity<TypeAssistance> deleteTypeAssistance(@PathVariable("idTypeAssistance") Integer idTypeAssistance) {
		service.delete(idTypeAssistance);
		return ResponseEntity.ok().build();
	}

}
