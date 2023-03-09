/**
 * C2-T04: Ejercicio 3
 */

/**
 * @author elena-01
 */
public class OperacionesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Variables */
		
		int X = 3;
		int Y = 6;
		double N = 3.69;
		double M = 1.68;
				
		/* Salida en pantalla */

		System.out.println("\n--- Variables ---\n");
		System.out.println("· Variable X="+X);
		System.out.println("· Variable Y="+Y);
		System.out.println("· Variable N="+N);
		System.out.println("· Variable M="+M+"\n");
		System.out.println("\n--- Operaciones ---\n");
		System.out.println("· La suma X + Y = "+(X+Y));
		System.out.println("· La diferencia X - Y = "+(X-Y));
		System.out.println("· El producto X * Y = "+(X*Y));
		System.out.println("· El cociente X / Y = "+(X/Y));
		System.out.println("· El resto X % Y = "+(X%Y));
		System.out.println("· La suma N + M = "+(N+M));
		System.out.println("· La diferencia N - M = "+(N-M));
		System.out.println("· El producto N * M = "+(N*M));
		System.out.println("· El cociente N / M = "+(N/M));
		System.out.println("· El resto N % M = "+(N%M));
		System.out.println("· La suma X + N = "+(X+N));
		System.out.println("· El cociente Y / M = "+(Y/M));
		System.out.println("· El resto Y % M = "+(Y%M));
		
		System.out.println("\n· El doble de la variable X= "+X*2);
		System.out.println("· El doble de la variable Y= "+Y*2);
		System.out.println("· El doble de la variable N= "+N*2);
		System.out.println("· El doble de la variable M= "+M*2+"\n");
		
		System.out.println("· La suma de todas las variables N + M + X + Y = "+(N+M+X+Y));
		System.out.println("· El producto de todas las variables N * M * X * Y = "+(N*M*X*Y));
	}

}
