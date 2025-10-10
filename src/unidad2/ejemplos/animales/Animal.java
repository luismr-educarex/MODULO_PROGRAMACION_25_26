package unidad2.ejemplos.animales;

public class Animal {
	
	private String nombre;
    String tipo;
    
    void nombrar(String nombre) {
    	this.nombre = nombre+"_iesAugustobriga";
    }
	
	void ladrar() {
		
		System.out.println(nombre+":gaugua");
	}
	
	void maullar() {
		System.out.println(nombre+":miiiaaamiiaaauuu");
	}

}
