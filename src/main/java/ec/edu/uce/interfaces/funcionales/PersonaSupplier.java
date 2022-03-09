package ec.edu.uce.interfaces.funcionales;

public class PersonaSupplier implements IPersonaSupplier<String>{

	@Override
	public String get() {
		return "Hola mundo";
	}

}
