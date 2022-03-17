package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Factura;
import ec.edu.uce.modelo.jpa.FacturaSencilla;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(FacturaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarFactura(Factura factura) {
		this.entityManager.persist(factura);

	}

	@Override
	public List<Factura> buscarPorFechaJOIN(LocalDateTime fecha) {
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f JOIN f.detalles d WHERE f.fecha <=: fecha", Factura.class);
		myQuery.setParameter("fecha", fecha);

		List<Factura> lista = myQuery.getResultList();
		LOG.info("Longitud" + lista.size());
		for (Factura f : lista) {
			LOG.info("detalles: " + f.getDetalles()); // Bajo demanda
			LOG.info(f.toString());
		}
		return lista;
	}

	@Override
	public List<Factura> buscarPorFechaLEFTJOIN(LocalDateTime fecha) {
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f LEFT JOIN f.detalles d WHERE f.fecha <=: fecha", Factura.class);
		myQuery.setParameter("fecha", fecha);

		return myQuery.getResultList();
	}

	@Override
	public List<Factura> buscarPorFechaWHERE(LocalDateTime fecha) {
		TypedQuery<Factura> myQuery = this.entityManager.createQuery(
				"SELECT f FROM Factura f, DetalleFactura d WHERE f = d.factura AND f.fecha <=:fecha", Factura.class);
		myQuery.setParameter("fecha", fecha);

		List<Factura> lista = myQuery.getResultList();
		LOG.info("Longitud REPO" + lista.size());
		for (Factura f : lista) {
			LOG.info("detalles: " + f.getDetalles()); // Bajo demanda
			LOG.info(f.toString());
		}
		return lista;
	}

	@Override
	public List<Factura> buscarPorFechaJOINFetch(LocalDateTime fecha) {
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f JOIN FETCH f.detalles d WHERE f.fecha <=: fecha", Factura.class);
		myQuery.setParameter("fecha", fecha);

		return myQuery.getResultList();
	}

	@Override
	public List<FacturaSencilla> buscarPorFechaSencilla(LocalDateTime fecha) {
		//FacturaSencilla(String numero, String cedula)
		TypedQuery<FacturaSencilla> myQuery = this.entityManager
				.createQuery("SELECT NEW ec.edu.uce.modelo.jpa.FacturaSencilla(f.numero, f.cedula) FROM Factura f JOIN f.detalles d WHERE f.fecha <=: fecha", FacturaSencilla.class);

		myQuery.setParameter("fecha", fecha);

		return myQuery.getResultList();
	}
	
	@Override
	public Factura buscarPorCedula(String cedula) {
		//FacturaSencilla(String numero, String cedula)
		TypedQuery<Factura> myQuery = this.entityManager
				.createQuery("SELECT f FROM Factura f WHERE f.cedula =: cedula", Factura.class);

		myQuery.setParameter("cedula", cedula);

		return myQuery.getSingleResult();
	}

}
