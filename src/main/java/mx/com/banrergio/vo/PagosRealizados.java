package mx.com.banrergio.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.com.banrergio.entity.CuentaDebito;
import mx.com.banrergio.entity.Prestamo;

@Getter
@Setter
@NoArgsConstructor
public class PagosRealizados {

	public CuentaDebito cuenta;
	public Prestamo prestamo;
}
