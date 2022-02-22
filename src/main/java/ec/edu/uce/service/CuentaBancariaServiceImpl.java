package ec.edu.uce.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.repository.jpa.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

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

		BigDecimal nuevoSaldoDestino = cuentaOri.getSaldo().add(saldoTransferir);
		cuentaDesti.setSaldo(nuevoSaldoDestino);
		cuentaDesti.setTipo(null);
		
		this.cuentaRepo.actualizar(cuentaDesti);
		this.cuentaRepo.actualizar(cuentaOri);

	}

}
