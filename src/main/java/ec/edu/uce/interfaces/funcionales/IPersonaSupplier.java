package ec.edu.uce.interfaces.funcionales;

/**
 * Interfez funcional supplier (proveedor)
 *
 * @param <T>
 */
@FunctionalInterface
public interface IPersonaSupplier<T> {
	T get(); 

}
