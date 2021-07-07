package gomez.christian;

public class Jugador extends Asistente {

	
	public Jugador(Integer dni,Integer numeroCamiseta,String posicion,String nombreApellido,String equipo,Integer edad)
	{
		super(dni,numeroCamiseta,posicion,nombreApellido,equipo,edad);
		
		
		
	}

	@Override
	public String getTipo() {
		
		return "Jugador";
	}
}
