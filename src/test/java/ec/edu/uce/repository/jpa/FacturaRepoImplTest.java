package ec.edu.uce.repository.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.jpa.Factura;

@SpringBootTest
@Transactional
@Rollback(true)
class FacturaRepoImplTest {

	private static final Logger LOG = LoggerFactory.getLogger(FacturaRepoImplTest.class); 
	
	@Autowired
	private IFacturaRepo facturaRepo;
	
	private List<Factura> facturas;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		LOG.info("INICIO DE LAS TODAS PRUEBAS");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		LOG.info("FIN DE TODAS LAS PRUEBAS");
	}

	@BeforeEach
	void setUp() throws Exception {
		this.facturas = this.facturaRepo.buscarPorFechaJOIN(LocalDateTime.now());
		LOG.info("Iniciando prueba unitaria");
	}

	@AfterEach
	void tearDown() throws Exception {
		LOG.info("Termina la prueba unitaria");
	}

	@Test
	void testInsertarFactura() {
		Factura fact = new Factura();
		fact.setCedula("2132324");
		fact.setFecha(LocalDateTime.now());
		fact.setNumero("123123123");
		this.facturaRepo.insertarFactura(fact);
		assertEquals(this.facturaRepo.buscarPorCedula(fact.getCedula()).getNumero(), "123123123");
	}


	@Test
	void testBuscarPorFechaWHERE() {
		assertEquals(this.facturaRepo.buscarPorFechaWHERE(LocalDateTime.now()), this.facturas);
	}

	@Test
	void testBuscarPorFechaJOINFetch() {
		assertEquals(this.facturaRepo.buscarPorFechaJOINFetch(LocalDateTime.now()), this.facturas);
	}

}
