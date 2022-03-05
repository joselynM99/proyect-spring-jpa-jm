package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaServiceImpl.class);

	@Autowired
	private ICuentaBancariaRepo cuentaRepo;

	@Override
	public void insertar(CuentaBancaria cuenta) {
		this.cuentaRepo.insertar(cuenta);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		this.cuentaRepo.actualizar(cuenta);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)//Para optimizar, buena practica
	public CuentaBancaria buscarPorNumero(String numero) {
		return this.cuentaRepo.buscarPorNumero(numero);
	}

	@Override
	@Transactional
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir) {
		CuentaBancaria cuentaOri = this.buscarPorNumero(cuentaOrigen);
		CuentaBancaria cuentaDesti = this.buscarPorNumero(cuentaDestino);

		BigDecimal nuevoSaldoOrigen = cuentaOri.getSaldo().subtract(saldoTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);

		BigDecimal nuevoSaldoDestino = cuentaDesti.getSaldo().add(saldoTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);

		LOG.info("AA1");
		try {
			this.cuentaRepo.actualizar(cuentaOri);
		} catch (ArrayIndexOutOfBoundsException e) {
			LOG.error("Error");
		}
		LOG.info("DA1");

		LOG.info("AA2");
		this.cuentaRepo.actualizar(cuentaDesti);

		LOG.info("DA2");

	}

	@Override
	@Transactional
	public void realizarTransferenciaExpressInicial(String cuentaOrigen, String cuentaDestino,
			BigDecimal saldoTransferir) {
		this.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, saldoTransferir);
	}

	/**
	 * Metodo no es transaccional Segundo escenario
	 */
	@Override
	@Transactional
	public void realizarTransferenciaExpressInicialNot(String cuentaOrigen, String cuentaDestino,
			BigDecimal saldoTransferir) {
		this.realizarTransferenciaExpress(cuentaOrigen, cuentaDestino, saldoTransferir);
	}

	@Override
//	@Transactional(value = TxType.SUPPORTS)
	@Transactional(value = TxType.REQUIRES_NEW)
	public void realizarTransferenciaExpress(String cuentaOrigen, String cuentaDestino, BigDecimal saldoTransferir) {
		LOG.info("Ejecucion Support");
		CuentaBancaria cuentaOri = this.buscarPorNumero(cuentaOrigen);
		CuentaBancaria cuentaDesti = this.buscarPorNumero(cuentaDestino);

		BigDecimal nuevoSaldoOrigen = cuentaOri.getSaldo().subtract(saldoTransferir);
		cuentaOri.setSaldo(nuevoSaldoOrigen);

		BigDecimal nuevoSaldoDestino = cuentaDesti.getSaldo().add(saldoTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);

		this.cuentaRepo.actualizar(cuentaOri);

		this.cuentaRepo.actualizar(cuentaDesti);

	}

	@Transactional
	public void enviarEmail() {
		this.cuentaRepo.enviarMail("Correo de clases");

	}

	
	public void enviarEmailNoT() {
		this.cuentaRepo.enviarMail("Correo de clases NoT");
	}

	@Transactional(value = TxType.SUPPORTS)
	public void propagacionSupports() {

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void propagacionMandatory() {
		LOG.info("Ejecucion Mandatoria");
	}

}
