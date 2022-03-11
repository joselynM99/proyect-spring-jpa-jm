package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ICajeroAutomaticoService {

	void consultarCuentas(String cedula);

	void retiro(String numCuenta, BigDecimal valor);

	void consultarSaldo(String numCuenta);

	void reporteHistoricoRetiros(LocalDateTime fechaRetiro, BigDecimal monto);

	void reporteCuentasVIP(BigDecimal saldo);

}
