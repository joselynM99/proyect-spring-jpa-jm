package ec.edu.uce.interfaces.funcionales;

public class MainMetodosReferenciados {

	public static void main(String[] args) {
		
		//1. Implementar por Clases
		IPersonaSupplier<String> persona = new PersonaSupplierImpl();
		String mensaje =persona.get();
		System.out.println(mensaje);
		
		//2. Implementaciones por Lambdas
		IPersonaSupplier<String> persona1 = ()-> "Se implementó por Lambda";
		String mensaje1 =persona1.get();
		System.out.println(mensaje1);
		
		//3. Metodos referenciados (no es una forma de implementar interfaces funcionales)
		
		PersonaSupplierImpl peronaImpl = new PersonaSupplierImpl();
		IPersonaSupplier<String> persona2 = peronaImpl::get;
		String mensaje2 =persona2.get();
		System.out.println(mensaje2);
		
		//3.1
		
		PersonaSupplierSinImpl personaSinImpl = new PersonaSupplierSinImpl();
		IPersonaSupplier<String> persona3 = personaSinImpl::get2;
		String mensaje3 =persona3.get();
		System.out.println(mensaje3);
		
		IPersonaSupplier<Integer> persona4 = personaSinImpl::get3;
		Integer mensaje4 =persona4.get();
		System.out.println(mensaje4);
		
		//3.2
		PersonaPredicateImpl personaPredi = new PersonaPredicateImpl();
		IPersonaPredicate<String> persona5 = personaPredi::evaluar;//No soporta que el método reciba argumentos
		
		
		boolean mensaje5 =persona5.evaluar("Mensaje");
		
		IPersonaPredicate<String> persona6 = valor1 ->valor1.contains("Z");
		boolean respuesta = persona6.evaluar("ARROZ");
		

		prueba(persona5::evaluar);
		
	}
	
	public static boolean prueba(IPersonaPredicate<String> arg1) {
		return arg1.evaluar("Mensaje");
	}

}
