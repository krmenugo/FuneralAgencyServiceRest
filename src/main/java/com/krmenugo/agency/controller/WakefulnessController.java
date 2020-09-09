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

import com.krmenugo.agency.dto.WakefulnessDTO;
import com.krmenugo.agency.model.Wakefulness;
import com.krmenugo.agency.service.impl.WakefulnessServiceImplement;

@RestController
@RequestMapping("/wakefulness")
public class WakefulnessController {
	
	@Autowired
	private WakefulnessServiceImplement service;

	@GetMapping("/find/id/{idWakefulness}")
	private WakefulnessDTO findWakefulnessById(@PathVariable(value = "idWakefulness") Integer idWakefulness) {
		return new WakefulnessDTO().parseToDTO(this.service.findById(idWakefulness));
	}
	
	@PostMapping("/create")
	private WakefulnessDTO createWakefulness(@RequestBody Wakefulness model) {
		return new WakefulnessDTO().parseToDTO(this.service.create(model));
	}
	
	@PutMapping("/update")
	private WakefulnessDTO updateWakefulness(@Valid @RequestBody Wakefulness model) {
		return new WakefulnessDTO().parseToDTO(this.service.update(model));
	}
	
	@DeleteMapping("/delete/id/{idWakefulness}")
	public ResponseEntity<Wakefulness> deleteWakefulness(@PathVariable("idWakefulness") Integer idWakefulness) {
		service.delete(idWakefulness);
		return ResponseEntity.ok().build();
	}
	
}
