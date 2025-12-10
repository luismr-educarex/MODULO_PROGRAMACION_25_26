package unidad4.ejemplos;

import java.time.LocalDateTime;

public class Vehiculo {

	/*atributos - parte estática*/
	private String marca;
	private String modelo;
	private String matricula;
	private int anioFabricacion;
	
	public Vehiculo() {
		this.marca="";
		this.modelo="";
		this.matricula="";
		this.anioFabricacion=0;
	}
	public Vehiculo(String marca,String modelo,String matricula, int anio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		anioFabricacion = anio;
	}
     public Vehiculo(String matricula) {
		
		this.marca = "";
		this.modelo = "";
		this.matricula = matricula;
		anioFabricacion = 0;
	}
     
     public Vehiculo(String letras,String numeros) {
 		
 		this.marca = "";
 		this.modelo = "";
 		this.matricula = letras+"-"+numeros;
 		anioFabricacion = 0;
 	}
     
     
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void mostrarInformacion() {
		System.out.println("Marca del vehículo:"+this.getMarca());
		System.out.println("Modelo del vehículo:"+this.getModelo());
		System.out.println("Matricula del vehículo:"+this.getMatricula());
		System.out.println("Año fabricación del vehículo:"+this.getAnioFabricacion()+"\n");
		
		
	}
	
	public String toString() {
		
		String informacion = "Marca del vehículo:"+this.getMarca()+"\n";
		informacion += "Modelo del vehículo:"+this.getModelo()+"\n";
		informacion +="Matricula del vehículo:***-*"+this.getMatricula().substring(5)+"\n";
		informacion +="Año fabricación del vehículo:"+this.getAnioFabricacion()+"\n\n";
		
		return informacion;
	}
	
	
	
     
    
  
}




















