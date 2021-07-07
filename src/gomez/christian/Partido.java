package gomez.christian;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Partido {
	
	private Set<Asistente> miembros;
	private String equipolocal;
	private String equipovisitante;
	private Map<Integer,Asistente> partido;
	private String identificador;
	public Partido(String equipolocal,String equipovisitante,String identificador) {
		
		this.equipolocal=equipolocal;
		this.equipovisitante=equipovisitante;
		this.identificador=identificador;
		this.miembros=new HashSet<>();
		this.partido=new HashMap<>();
	}
	public Set<Asistente> getMiembros() {
		return miembros;
	}
	public void setMiembros(Set<Asistente> miembros) {
		this.miembros = miembros;
	}
	public String getEquipolocal() {
		return equipolocal;
	}
	public void setEquipolocal(String equipolocal) {
		this.equipolocal = equipolocal;
	}
	public String getEquipovisitante() {
		return equipovisitante;
	}
	public void setEquipovisitante(String equipovisitante) {
		this.equipovisitante = equipovisitante;
	}
	public Map<Integer, Asistente> getPartido() {
		return partido;
	}
	public void setPartido(Map<Integer, Asistente> partido) {
		this.partido = partido;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	


	
}
