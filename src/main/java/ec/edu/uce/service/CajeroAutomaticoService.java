package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancariaCA;
import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.HistoricoRetiros;

@Service
public class CajeroAutomaticoService implements ICajeroAutomaticoService {

	private static final Logger LOG = LoggerFactory.getLogger(CajeroAutomaticoService.class);

	@Autowired
	private ICuentaHabienteService cuentaHabienteService;

	@Autowired
	private ICuentaBancariaCAService cuentaBancariaService;

	@Autowired
	private IHistoricoRetirosService historicoService;

	@Override
	public void consultarCuentas(String cedula) {
		CuentaHabiente cuentaHabiente = this.cuentaHabienteService.buscarPorCedula(cedula);

		LOG.info("Cuenta habiente: " + cuentaHabiente.getNombre() + " " + cuentaHabiente.getApellido()
				+ " Cuentas bancarias: " + cuentaHabiente.getCuentasBancarias());

	}

	@Override
	@Transactional
	public void retiro(String numCuenta, BigDecimal valor) {
		CuentaBancariaCA cuentaBancaria = this.cuentaBancariaService.buscarPorNumero(numCuenta);
		cuentaBancaria.setSaldo(cuentaBancaria.getSaldo().subtract(valor));
		this.cuentaBancariaService.actualizar(cuentaBancaria);

		HistoricoRetiros hRetiros = new HistoricoRetiros();
		hRetiros.setFecha(LocalDateTime.now());
		hRetiros.setMonto(valor);
		hRetiros.setCuentaBancaria(cuentaBancaria);
		hRetiros.setCuentaHabiente(cuentaBancaria.getCuentaHabiente());
//		try {
		this.historicoService.insertar(hRetiros);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			LOG.error("ERROR AL GUARDAR REGISTRO HISTORICO. NO SE PUDO REALIZAR EL RETIRO");
//		}

	}

	@Override
	public void consultarSaldo(String numCuenta) {
		CuentaBancariaCA cuentaBancaria = this.cuentaBancariaService.buscarPorNumero(numCuenta);
		LOG.info("Cuenta Bancaria número: " + cuentaBancaria.getNumero() + ". Saldo disponible: "
				+ cuentaBancaria.getSaldo());

	}

}
