package ec.edu.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.DetalleFactura;

@Repository
@Transactional
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(DetalleFacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	// SELECT f FROM Factura f LEFT JOIN f.detalles d WHERE f.fecha <=: fecha

	@Override
	public List<DetalleFactura> buscarProductos(BigDecimal valorMinimo, LocalDateTime fecha) {
		TypedQuery<DetalleFactura> myQuery = this.entityManager.createQuery(
				"SELECT d FROM DetalleFactura d JOIN FETCH d.factura f WHERE d.precio >=: valorMinimo AND f.fecha <=: fecha",
				DetalleFactura.class);
		myQuery.setParameter("valorMinimo", valorMinimo);
		myQuery.setParameter("fecha", fecha);

		return myQuery.getResultList();
	}

}
