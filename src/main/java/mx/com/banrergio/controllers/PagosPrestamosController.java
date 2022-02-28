
package mx.com.banrergio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.banrergio.service.PrestamosService;

@RestController
@RequestMapping("/pagos/prestamos")
public class PagosPrestamosController {

	@Autowired
	private PrestamosService prestamos;

	@GetMapping
	public ResponseEntity<Object> consultaPrestamos() {
		return new ResponseEntity<Object>(prestamos.obtenerPrestamos(), HttpStatus.OK);
	}
	
	@GetMapping("/{estado}")
	public ResponseEntity<Object> consultaPrestamosPorEstado(@PathVariable String estado) {
		return new ResponseEntity<Object>(prestamos.obtenerPrestamosPorEstado(estado), HttpStatus.OK);
	}
}
