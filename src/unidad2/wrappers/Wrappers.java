package unidad2.wrappers;

public class Wrappers {

	public static void main(String[] args) {
		
		//Autoboxing
		int n = 5;
		Integer numeroEnvolvente = n;
		
		//Unboxing 
		Integer num = 10;
		int numBasico = num;
		
		String numeroCadena = "5";
		
		Integer numeroEnvolvente2 = Integer.valueOf(numeroCadena);
		int numeroBasico2 =  numeroEnvolvente2;
		
		int numeroBasico3 =  Integer.valueOf(numeroCadena).intValue();
		
		Integer suma = numeroEnvolvente+numeroEnvolvente2;
		System.out.println("Suma:"+suma);
		System.out.println("Suma:"+numeroEnvolvente+numeroEnvolvente2);
		System.out.println("Suma:"+(numeroEnvolvente+numeroEnvolvente2));

		String pi = "3.1416";
		Double numeroPi = Double.parseDouble(pi);
		//Integer numeroPiEntero = Integer.parseInt(pi); //No se permite
		
		Double numeroPi2 = Double.parseDouble(pi);
		//Integer numeroPiEntero2 = Integer.parseInt(pi); //No se permite	
		
		Integer a = 20;
		Integer b = 45;
		int c = 20;
		int d = 45;
		
		System.out.println("Máximo:"+Integer.max(a, b));
		System.out.println("Máximo:"+Integer.max(c, d));
		System.out.println("Mínimo:"+Integer.min(c, d));
		System.out.println("Suma:"+Integer.sum(c, d));
		
		
		char c1= 'C';
		char c2 = 'a';
		char c3 = '9';
		char c4 = ' ';
		
		System.out.println("Es digito:"+Character.isDigit(c2));
		System.out.println("Es letra:"+Character.isLetter(c1));
		System.out.println("Es maýusculas:"+Character.isUpperCase(c1));
		System.out.println("Es minúsculas:"+Character.isLowerCase(c1));
		System.out.println("Es espacio en blando:"+Character.isWhitespace(c4));
		System.out.println("Valor numérico:"+Character.getNumericValue(c1));

	}

}




