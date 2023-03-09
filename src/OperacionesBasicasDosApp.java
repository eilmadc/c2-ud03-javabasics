/**
 * C2-T04: Ejercicio 2
 */

/**
 * @author elena-01
 *
 */
public class OperacionesBasicasDosApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		
		int N = 5;
		double A = 4.56;
		char C = 'a';
		
		//Operaciones
		
		double suma = N + A;
		double resta = A - N;
		int valorC = C;
		
		
		//Salida en pantalla

		System.out.println("VARIABLES");
		System.out.println("· Variable N="+N);
		System.out.println("· Variable A="+A);
		System.out.println("· Variable C="+C+"\n");
		System.out.println("OPERACIONES");
		System.out.println("· "+N+" + "+A+" = "+suma);
		System.out.println("· "+A+" - "+N+" = "+resta);
		System.out.println("· Valor numérico del carácter "+C+" = "+valorC);
		
	}

}
