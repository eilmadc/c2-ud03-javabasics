/**
 * C2-T04: Ejercicio 5
 */

/**
 * @author elena-01
 *
 */
public class VariablesIntercambioApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Variables */
		
		int A = 3;
		int B = 6;
		int C = 9;
		int D = 12;
				
		/* Salida en pantalla */

		System.out.println("\n--- Variables ---\n");
		System.out.println("· Variable A = "+A);
		System.out.println("· Variable B = "+B);
		System.out.println("· Variable C = "+C);
		System.out.println("· Variable D = "+D+"\n");
		
		System.out.println("\n--- Cambio de Valores alterando valores iniciales ---\n");
		System.out.println("· B toma el valor de C = "+(B=C));
		System.out.println("· C toma el valor de A = "+(C=A));
		System.out.println("· A toma el valor de D = "+(A=D));
		System.out.println("· D toma el valor de B = "+(D=B));
	}

}
