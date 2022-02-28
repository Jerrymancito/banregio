package mx.com.banrergio.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.banrergio.service.CobrosService;
import mx.com.banrergio.vo.CobrosResponse;

@RestController
@RequestMapping("/cobros")
public class EjecutarCobroController {

	private CobrosService service;

	@PostMapping
	public ResponseEntity<Object> realizaCobro(@RequestBody CobrosResponse cobro) {
		return new ResponseEntity<Object>(service.realizaCobro(cobro), HttpStatus.OK);
	}
}
