package mx.com.banrergio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import mx.com.banrergio.dao.PrestamoRepository;
import mx.com.banrergio.entity.Prestamo;

@Service
public class PrestamosService {

	@Autowired
	private PrestamoRepository repo;

	public List<Prestamo> obtenerPrestamos() {
		return repo.findAll();
	}

	public List<Prestamo> obtenerPrestamosPorEstado(String estado) {
		return repo.findByEstado(estado);
	}
}
