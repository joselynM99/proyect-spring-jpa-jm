package ec.edu.uce.interfaces.funcionales;

@FunctionalInterface
//Error porque intenta representar que la funcion de la 
//interfaz recibe y retorna el mismo tipo de dato
public interface IPersonaFuntionUnaryOperator<T/*,T*/> {
	T apply(T arg1);
}
