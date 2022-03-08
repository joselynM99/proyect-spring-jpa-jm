package ec.edu.uce.interfaces.funcionales;

/**
 * Interface funcional consummer (consume pero no retorna nada)
 *
 * @param <T>
 */
@FunctionalInterface
public interface IPersonaConsummer<T> {
	public void accept(T arg1);
}
