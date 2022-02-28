package mx.com.banrergio.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "prestamos")
public class Prestamo {

	@Id
	private long id;
	private String cliente;
	private Date fecha;
	private BigDecimal monto;
	private String estado;
}
