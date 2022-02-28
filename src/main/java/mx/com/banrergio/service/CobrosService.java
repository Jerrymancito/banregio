package mx.com.banrergio.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import mx.com.banrergio.dao.CuentasDebitoRepository;
import mx.com.banrergio.entity.CuentaDebito;
import mx.com.banrergio.entity.Prestamo;
import mx.com.banrergio.vo.CobrosResponse;
import mx.com.banrergio.vo.PagosRealizados;

@Service
public class CobrosService {

	@Autowired
	private PrestamosService service;
	@Autowired
	private CuentasDebitoRepository cuentasRepo;

	public List<PagosRealizados> realizaCobro(CobrosResponse cobro) {
		List<Prestamo> prestamos = service.obtenerPrestamosPorEstado("pendiente");
		List<PagosRealizados> pagosRealizados = new ArrayList<>();
		for (Prestamo prestamo : prestamos) {
			Optional<CuentaDebito> cuenta = cuentasRepo.findByIdCliente(prestamo.getCliente());
			if (cuenta.isPresent()) {
				if (cuenta.get().getEstado().equals("activa")) {
					int plazo = (int) ((cobro.getFechaActual().getTime() - prestamo.getFecha().getTime()) / 86400000);
					BigDecimal interes = (prestamo.getMonto().multiply(new BigDecimal(plazo))
							.multiply(new BigDecimal(cobro.getTasaInteres())))
									.divide(new BigDecimal(cobro.getDiasAnioComercial()));
					BigDecimal iva = (interes.multiply(new BigDecimal(cobro.getTasaIva())).divide(new BigDecimal(100)));
					BigDecimal pago = prestamo.getMonto().add(iva).add(interes);
					if (pago.compareTo(cuenta.get().getMonto()) <= 0) {
						// ***************************
						// aqui se mandarían llamar todas las actualizaciones de los montos de cuenta y
						// prestamos
						// ***************************
						PagosRealizados pagos = new PagosRealizados();
						// datos de cuentas actualizadas
						pagos.setCuenta(cuenta.get());
						// Datos de prestamos actualizados
						pagos.setPrestamo(prestamo);
						pagosRealizados.add(pagos);
					}
				}
			}
		}
		return pagosRealizados;
	}

}
