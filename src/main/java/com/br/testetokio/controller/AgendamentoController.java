package com.br.testetokio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.testetokio.request.AgendamentoRequest;
import com.br.testetokio.service.AgendamentoService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	@Autowired 
	private AgendamentoService service;
	
	@CrossOrigin
	@ResponseBody
	@PostMapping("/agendar")
	public ResponseEntity<Object> agendar(@RequestBody AgendamentoRequest request) {
		return new ResponseEntity<Object>(service.agendar(request), HttpStatus.OK);
	}
	
	@CrossOrigin
	@ResponseBody
	@GetMapping("/obter_agendamentos")
	public ResponseEntity<Object> obterAgendamentos()  {
		return new ResponseEntity<Object>(service.obterAgendamentos(), HttpStatus.OK );
	}

}
