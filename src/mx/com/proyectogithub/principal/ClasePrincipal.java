package mx.com.proyectogithub.principal;

import mx.com.proyectogithub.clases.Figura;
import mx.com.proyectogithub.clases.Marca;
import mx.com.proyectogithub.clases.Persona;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		System.out.println("Inicia proyecto Git.");
		System.out.println("Modificación agregada desde Git Hub.");
		System.out.println("Primer cambio en eclipse");
		
		Figura figura = new Figura();
		Persona persona = new Persona();
		Marca marca = new Marca();
		
		figura.setLados(4);
		figura.setNombre("Cuadrado");
		
		System.out.println("La figura con "+figura.getLados()+" es un "+figura.getNombre()+".");
		
		persona.setEdad(42);
		persona.setNombre("Chris");
		
		System.out.println("La persona "+persona.getNombre()+" tiene "+persona.getEdad()+" de edad.");
		
		marca.setNombreMarca("Nissan");
		marca.setObjeto("Autos");
		
		System.out.println("La persona "+marca.getNombreMarca()+" fabrica "+marca.getObjeto()+".");
		
	}

}
