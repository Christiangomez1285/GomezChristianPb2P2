package gomez.christian;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Torneo {
	
	private Set<Asistente>miembros;
	
	private Map<String,Partido> partido;
	private String nombreTorneo;
	
	
	public Torneo (String nombreTorneo)
	{
		this.nombreTorneo=nombreTorneo;
		this.miembros=new HashSet<>();
		this.partido=new HashMap<>();
		
	}
	
	public void agregarMiembro(Asistente asistente) {
		this.miembros.add(asistente);
		
	}
	public Integer getCantidadMiembros() {
		
		return this.miembros.size();
	}
	
	
	
	
	public void CrearPartido(String equipolocal,String equipovisitante,String identificador)
	{
		Partido partido1=new Partido(equipolocal,equipovisitante,identificador);
		
		Iterator <Asistente> it=this.miembros.iterator();
		while(it.hasNext()) {
			Asistente asistenteAComparar=it.next();
			if(asistenteAComparar.getTipo().equals("Jugador"))
			{
				if(asistenteAComparar.getEquipo().equals(equipolocal)||(asistenteAComparar.getEquipo().equals(equipovisitante)))
				{
				partido.put(identificador,partido1);
				
				}
			
			}
		}
	}
	
	public Partido getPartido(String identificador) {
		
		return partido.get(identificador);
	}
}
