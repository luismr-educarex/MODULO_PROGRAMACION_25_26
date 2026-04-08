package unidad7.ejemplos.empresa;

public class Main {

	public static void main(String[] args) {
		
		ITrabajador t1 = new Empleado("César", 2500);
		ITrabajador t2 = new ConsultorExterno("Kevin", 300);
		
		t1.establecerBonus(500);
		t2.establecerBonus(200);
		
		((Empleado)t1).calcularIRPF();
		((ConsultorExterno)t2).calcularIRPF();
		
		System.out.println("Resultados");
		
		System.out.println(t1);
		System.out.println(t2);
			

	}

}
