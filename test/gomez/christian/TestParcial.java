package gomez.christian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestParcial {

	@Test
	public void queSePuedanAgregarAsistentesALaColeccion() {
		Torneo torneo=new Torneo("Don Bosco");
		Asistente jugador=new Jugador(35205111,8,"DEL","Jean Meneses","Argentina",null);
		Asistente dt=new DT(52154555,null,null,"Lionel Scaloni","Argentina",45);
		Asistente jugador2=new Jugador(715444,4,"MED","Carlos Alberto","Brasil",null);
		Asistente jugador3=new Jugador(715444,4,"MED","Juan Mariano","Brasil",null);
		torneo.agregarMiembro(jugador);
		torneo.agregarMiembro(dt);
		torneo.agregarMiembro(jugador2);
		torneo.agregarMiembro(jugador3);
		assertEquals((Integer)3,torneo.getCantidadMiembros());
	}
	
	@Test
	public void queSePuedaArmarElPartido() {
		Torneo torneo=new Torneo("Don Bosco");
		Asistente jugador=new Jugador(35205111,8,"DEL","Jean Meneses","Argentina",null);
		Asistente dt=new DT(52154555,null,null,"Lionel Scaloni","Argentina",45);
		Asistente jugador2=new Jugador(715444,4,"MED","Carlos Alberto","Brasil",null);
		Asistente jugador3=new Jugador(715444,4,"MED","Juan Mariano","Brasil",null);
		torneo.agregarMiembro(jugador);
		torneo.agregarMiembro(dt);
		torneo.agregarMiembro(jugador2);
		torneo.agregarMiembro(jugador3);
		torneo.CrearPartido("Argentina","Brasil","1234A");
		String codigo="1234A";
		assertEquals("1234A",torneo.getPartido(codigo).getIdentificador());
	}
	@Test
	public void queSePuedaRegistrarUnGol() throws JugadorNoEncontradoException
	{
		Torneo torneo=new Torneo("Don Bosco");
		Asistente jugador=new Jugador(35205111,8,"DEL","Jean Meneses","Argentina",null);
		Asistente jugador2=new Jugador(715444,4,"MED","Carlos Alberto","Brasil",null);
		Asistente jugador3=new Jugador(744444,4,"MED","Juan Mariano","Brasil",null);
		torneo.agregarMiembro(jugador);
		torneo.agregarMiembro(jugador2);
		torneo.agregarMiembro(jugador3);
		torneo.CrearPartido("Argentina","Brasil","1234A");
		torneo.registrarGol(jugador2,"local",84);
		
	}
	
	
	@Test(expected = JugadorNoEncontradoException.class)
	public void queLanceExcepcionSiNoEncuentraJugadorQueHizoGol() throws JugadorNoEncontradoException
	{
		Torneo torneo=new Torneo("Don Bosco");
		Asistente jugador=new Jugador(35205111,8,"DEL","Jean Meneses","Argentina",null);
		Asistente jugador2=new Jugador(715444,4,"MED","Carlos Alberto","Brasil",null);
		Asistente jugador3=new Jugador(744444,4,"MED","Juan Mariano","Brasil",null);
		torneo.agregarMiembro(jugador);
		torneo.agregarMiembro(jugador2);
		torneo.agregarMiembro(jugador3);
		torneo.CrearPartido("Argentina","Brasil","1234A");
		torneo.registrarGol(jugador2,"local",84);
		
	}

}