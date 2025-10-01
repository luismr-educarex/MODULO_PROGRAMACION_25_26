package unidad1.ejemplos;

public class Operadores {

	static final int EDAD_CONDUCIR = 17;
	
	
	public static void main(String[] args) {
		
		//Operadores aritméticos
		//+,-,*,/,%
		double num1;
		int num2;
		int num3=19;
		num1=19;
		num2=4;
		
		double suma = num1 + num2;
		double resta = num1 - num2;
		double multiplicacion= num1*num2;
		double division = num1/num2;
		double division2 = num3/num2;
		double division3 = (double)num3/num2;
		double modulo = num1%num2;
		
		System.out.println("Suma:"+suma);
		System.out.println("Resta:"+resta);
		System.out.println("Multiplicación:"+multiplicacion);
		System.out.println("División:"+num1/num2);
		System.out.println("División:"+division);
		System.out.println("División:"+num3/num2);
		System.out.println("División:"+division2);
		System.out.println("División:"+division3);
		System.out.println("Módulo:"+modulo);
		
		//Operadores unarios
		int x=5;
		System.out.println("+x="+(+x));
		System.out.println("-x="+(-x));
		
		//Incremento y decremento
		int contador = 0;
		System.out.println("Valor inicial:"+contador);
		System.out.println("Post-incremento(contador++) :"+(contador++));
		System.out.println("Después del Post-incremento:"+contador);
		System.out.println("Pre-incremento(++contador) :"+(++contador));
		System.out.println("Después del Pre-incremento:"+contador);
		System.out.println("Post-decremento(contador--) :"+(contador--));
		System.out.println("Pre-decremento(--contador) :"+(--contador));
		
		int a=10;
		int b=2;
		System.out.println("a:"+a);
	    System.out.println("b:"+b);
		++a;
		int resultado = (b++)+a;
	    System.out.println("Resultado:"+resultado);
	    System.out.println("a:"+a);
	    System.out.println("b:"+b);
	    resultado = (b++)+a;
	    System.out.println("Resultado:"+resultado);
	    resultado = (b++)+a;
	    System.out.println("Resultado:"+resultado);
		
		
	    //Operadores relacionales
	    num1=10;
	    num2=20;
	    
	    System.out.println("Son iguales:"+(num1==num2));
	    System.out.println("Son distintos:"+(num1!=num2));
	    System.out.println(num1+" es mayor que "+num2+":"+(num1>num2));
	    System.out.println(num1+" es menor que "+num2+":"+(num1<num2));	
	    System.out.println(num1+" es mayor o igual que "+num2+":"+(num1>=num2));
	    System.out.println(num1+" es menor o igual que "+num2+":"+(num1<=num2));
	    
	    //Operadores lógicos
	    boolean p=true;
	    boolean q=false;
	    
	    System.out.println("p && q:"+(p && q));
	    System.out.println("p || q:"+(p || q));
	    System.out.println("!p (NOT):"+(!p));
	    
	    int edadConducir=18;
	    int edad = 20;
	    boolean tienePermisoB = true;
	    boolean sePuedeComprarCoche = (edad>=18) && tienePermisoB;
	    System.out.println("Puede entrar en el concesionario:"+sePuedeComprarCoche);
	    
	    edad = 20;
	    boolean sePuedeComprarCocheFebero = (edad>=edadConducir) && tienePermisoB;
	    System.out.println("Puede entrar en el concesionario:"+sePuedeComprarCoche);

	    edad = 20;
	    boolean sePuedeComprarCocheAbril = (edad>=EDAD_CONDUCIR) && tienePermisoB;
	    System.out.println("Puede entrar en el concesionario:"+sePuedeComprarCoche);


	    edad = 21;
	    boolean sePuedeComprarCocheAgosto = (edad>=EDAD_CONDUCIR) && tienePermisoB;
	    System.out.println("Puede entrar en el concesionario:"+sePuedeComprarCoche);

	    
		
		
		
		

	}

}
