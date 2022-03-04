package ec.edu.uce.service;

import java.math.BigDecimal;

public interface ICajeroAutomaticoService {

	void consultarCuentas(String cedula);

	void retiro(String numCuenta, BigDecimal valor);

	void consultarSaldo(String numCuenta);

}
