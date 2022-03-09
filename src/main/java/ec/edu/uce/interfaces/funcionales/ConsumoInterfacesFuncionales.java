package ec.edu.uce.interfaces.funcionales;

public class ConsumoInterfacesFuncionales {
	
	public String consumirSupplier(IPersonaSupplier<String> funcion) {
		return funcion.get();
	}
	
	public void consumirConsumer(IPersonaConsummer<Integer> funcion, Integer valor) {
		funcion.accept(valor);
	}
	
	public boolean consumirPredicate(IPersonaPredicate<String> funcion, String valor) {
		return funcion.evaluar(valor);
		
	}
	
	public Integer consumirFunction(IPersonaFuntion<String, Integer> funcion, String cadena) {
		return funcion.apply(cadena);
		
		
	}

}
