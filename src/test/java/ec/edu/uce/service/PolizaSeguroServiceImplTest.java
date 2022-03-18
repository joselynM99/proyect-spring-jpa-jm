package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.jpa.PolizaSeguro;

@SpringBootTest
@Transactional
@Rollback(true)
class PolizaSeguroServiceImplTest {

	private static final Logger LOG = LoggerFactory.getLogger(PolizaSeguroServiceImplTest.class);

	private PolizaSeguro poliza;

	@Autowired
	private IPolizaSeguroService polizaSeguroService;

	@BeforeEach
	void setUp() throws Exception {
		this.poliza = new PolizaSeguro();
		this.poliza.setDescripcion("Poliza de seguro de vida");
		this.poliza.setEstado("Activo");
		this.poliza.setFechaEmision(LocalDateTime.of(2020, Month.AUGUST, 12, 8, 30));
		this.poliza.setFechaVigencia(LocalDateTime.now());
		this.poliza.setNumero("88795664");
		this.poliza.setValor(new BigDecimal(2000));
	}

	@Test
	void testInsertar1() {
		this.polizaSeguroService.insertar(poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(poliza.getId()).getNumero(), "88795664");
	}

	@Test
	void testInsertar2() {

		this.polizaSeguroService.insertar(this.poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()).getFechaEmision(),
				LocalDateTime.of(2020, Month.AUGUST, 12, 8, 30));
	}

	@Test
	void testActualizar1() {

		this.polizaSeguroService.insertar(this.poliza);

		this.poliza.setId(poliza.getId());
		this.poliza.setValor(new BigDecimal(3000));
		this.polizaSeguroService.actualizar(this.poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()).getValor(), new BigDecimal(3000));
	}

	@Test
	void testActualizar2() {

		this.polizaSeguroService.insertar(this.poliza);

		this.poliza.setId(poliza.getId());
		this.poliza.setEstado("Cancelado");
		this.polizaSeguroService.actualizar(this.poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()).getEstado(), "Cancelado");
	}

	@Test
	void testBuscarPorID1() {

		this.polizaSeguroService.insertar(this.poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()).getId(), this.poliza.getId());

	}

	@Test
	void testBuscarPorID2() {

		this.polizaSeguroService.insertar(this.poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()), this.poliza);

	}

	@Test
	void testBorrarPorId1() {

		this.polizaSeguroService.insertar(this.poliza);

		assertTrue(this.polizaSeguroService.buscarPorID(this.poliza.getId()) != null);

		this.polizaSeguroService.borrarPorId(this.poliza.getId());
		assertTrue(this.polizaSeguroService.buscarPorID(this.poliza.getId()) == null);

	}

	@Test
	void testBorrarPorId2() {

		this.polizaSeguroService.insertar(this.poliza);

		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()).getNumero(), "88795664");

		this.polizaSeguroService.borrarPorId(this.poliza.getId());
		assertEquals(this.polizaSeguroService.buscarPorID(this.poliza.getId()), null);

	}

}
