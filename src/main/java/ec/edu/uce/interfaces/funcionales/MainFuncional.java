package ec.edu.uce.interfaces.funcionales;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainFuncional {

	public static void main(String[] args) {

		// Supplier
		IPersonaSupplier<String> supplier = new PersonaSupplier();
		System.out.println(supplier.get());

		IPersonaSupplier<String> supplierChino = new PersonaSupplierChino();
		System.out.println(supplierChino.get());

		IPersonaSupplier<String> supplier1 = () -> {
			return "HOLA MUNDO adicional";
		};

		IPersonaSupplier<String> supplier1Chino = () -> "SSJDNSA";

		System.out.println(supplier1.get());
		System.out.println(supplier1Chino.get());

		ConsumoInterfacesFuncionales consumo = new ConsumoInterfacesFuncionales();
		String resultado = consumo.consumirSupplier(() -> "Hola mundo!!!!");
		System.out.println(resultado);

		// Supplier JAVA
		Stream<String> test = Stream.generate(() -> "HOLA").limit(100);// .forEach(x-> System.out.println(x));

		// Consumer
		IPersonaConsummer<Integer> personaConsumer = number -> System.out.println(number);
		personaConsumer.accept(7);

		IPersonaConsummer<Integer> personaConsumer1 = number -> System.out.println(number.intValue() + 1);
		personaConsumer1.accept(7);

		consumo.consumirConsumer(number -> System.out.println(number + 10), 2);

		// Consumer JAVA
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		listaNumeros.forEach(number -> System.out.println(number));

		System.out.println("Predicate");
		// Predicate
		boolean resultado2 = consumo.consumirPredicate(cadena -> cadena.contains("c"), "Joselyn");
		System.out.println(resultado2);

		// Predicate JAVA
		Stream<Integer> numerosFiltrados =listaNumeros.stream().filter(number -> number > 4);
		numerosFiltrados.forEach(number -> System.out.println(number));
		
		System.out.println("Function");
		//Function
		Integer num = consumo.consumirFunction(cadena-> Integer.parseInt(cadena)-7, "2");
		System.out.println(num);
		
		//FUNCTION JAVA
		Stream<String> listaCambiada =listaNumeros.stream().map(numLista-> numLista.toString()+"N");
		listaCambiada.forEach(cadena->System.out.println(cadena));
		
		listaNumeros.stream().reduce(null);
	}

}
