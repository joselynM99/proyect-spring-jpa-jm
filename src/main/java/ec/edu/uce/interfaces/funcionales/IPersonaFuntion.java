package ec.edu.uce.interfaces.funcionales;

@FunctionalInterface
public interface IPersonaFuntion<T, R> {
	R apply(T arg1);
}
