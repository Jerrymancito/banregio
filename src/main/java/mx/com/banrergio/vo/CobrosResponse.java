package mx.com.banrergio.vo;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CobrosResponse {

	private long tasaInteres;
	private long tasaIva;
	private int diasAnioComercial;
	private Date fechaActual;

}
