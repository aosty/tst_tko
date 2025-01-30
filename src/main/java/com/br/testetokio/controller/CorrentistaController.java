package com.br.testetokio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.testetokio.service.CorrentistaService;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController {

	@Autowired
	private CorrentistaService service;

	@CrossOrigin
	@ResponseBody
	@PostMapping("/adicionar")
	public ResponseEntity<Object> adicionar() {
		return new ResponseEntity<Object>(service.adicionar(), HttpStatus.OK);
	}
	
}
