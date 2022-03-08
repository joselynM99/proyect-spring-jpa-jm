package ec.edu.uce.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;


@Service
public class CuentaBancariaFachadaServiceImpl {
	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaFachadaServiceImpl.class);


	@Autowired
	private ICuentaBancariaService cuentaService;

	public void realizarTransferenciaExpressInicialNot(String cuentaOrigen, String cuentaDestino,
			BigDecimal saldoTransferir) {
		LOG.info("Prueba1: "+ TransactionSynchronizationManager.isActualTransactionActive());
		this.cuentaService.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, saldoTransferir);
	}

}
