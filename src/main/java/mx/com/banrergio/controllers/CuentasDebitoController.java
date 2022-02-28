package mx.com.banrergio.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.banrergio.service.CuentasDebitoService;

@RestController
@RequestMapping("/cuentas/debito")
public class CuentasDebitoController {

	@Autowired
	private CuentasDebitoService service;

	@GetMapping()
	public ResponseEntity<Object> consultaCuentas() {
		return new ResponseEntity<Object>(service.consultaCuentas(), HttpStatus.OK);
	}
	
	@GetMapping("/{estado}")
	public ResponseEntity<Object> consultaCuentasActivas(@PathVariable String estado) {
		return new ResponseEntity<Object>(service.consultaCuentasActivas(estado), HttpStatus.OK);
	}

}
