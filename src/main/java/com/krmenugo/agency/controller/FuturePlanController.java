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

import com.krmenugo.agency.dto.FuturePlanDTO;
import com.krmenugo.agency.model.FuturePlan;
import com.krmenugo.agency.service.impl.FuturePlanServiceImplement;

@RestController
@RequestMapping("/futureplan")
public class FuturePlanController {

	@Autowired
	private FuturePlanServiceImplement service;
	
	@GetMapping("/find/id/{idFuturePlan}")
	public FuturePlanDTO findFuturePlanById(@PathVariable(value = "idFuturePlan") Integer idFuturePlan) {
		return new FuturePlanDTO().parseToDTO(this.service.findById(idFuturePlan));
	}
	
	@PostMapping("/create")
	public FuturePlanDTO createFuturePlan(@RequestBody FuturePlan model) {
		return new FuturePlanDTO().parseToDTO(this.service.create(model));
	}
	
	@PutMapping("/update")
	public FuturePlanDTO updateFuturePlan(@Valid @RequestBody FuturePlan model) {
		return new FuturePlanDTO().parseToDTO(this.service.update(model));
	}
	
	@DeleteMapping("/delete/id/{idFuturePlan}")
	public ResponseEntity<FuturePlan> deleteFuturePlan(@PathVariable("idFuturePlan") Integer idFuturePlan) {
		service.delete(idFuturePlan);
		return ResponseEntity.ok().build();
	}
	
}
