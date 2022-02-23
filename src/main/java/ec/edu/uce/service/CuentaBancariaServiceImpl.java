package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;

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
		this.cuentaRepo.actualizar(cuentaOri);
		LOG.info("DA1");
		
		LOG.info("AA2");
		try {
			this.cuentaRepo.actualizar2(cuentaDesti);

		}catch(ArrayIndexOutOfBoundsException e) {
			LOG.error("Error");
		}
		LOG.info("DA2");
		

	}

}
