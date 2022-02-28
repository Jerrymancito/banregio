package mx.com.banrergio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import mx.com.banrergio.dao.CuentasDebitoRepository;
import mx.com.banrergio.entity.CuentaDebito;

@Service
public class CuentasDebitoService {

	@Autowired
	private CuentasDebitoRepository repo;

	public List<CuentaDebito> consultaCuentasActivas(String estado) {
		return repo.findByEstado(estado);
	}

	public List<CuentaDebito> consultaCuentas() {
		return repo.findAll();
	}
}
