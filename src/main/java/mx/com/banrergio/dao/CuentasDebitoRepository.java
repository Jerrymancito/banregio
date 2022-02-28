package mx.com.banrergio.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.banrergio.entity.CuentaDebito;

@Repository
public interface CuentasDebitoRepository extends JpaRepository<CuentaDebito, Long> {

	public List<CuentaDebito> findByEstado(String estado);

	public Optional<CuentaDebito> findByIdCliente(String cliente);
}
