package ejercicios3_2;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Calcular los n primeros números de la serie determinada por la siguiente expresión, siendo n un entero introducido por teclado
//		a1 = 0
//		a2 = 1
//		an = 3 * an-1 +2 * an–2  
//		(Cada número es el triple del anterior + el doble del doble-anterior)
		int numTerminos;
		do {
			System.out.println("Introduce el número de terminos (>0): ");
			numTerminos = Consola.leeInt();
		} while (numTerminos <= 0);
		if (numTerminos == 1)
			System.out.println("a1=0");
		else if (numTerminos == 2) {
			System.out.println("a1=0");
			System.out.println("a2=1");
		} else if (numTerminos >= 3) {
			int numero1 = 0, numero2 = 1, contador = 3, numeron;
			System.out.println("a1=" + numero1);
			System.out.println("a2=" + numero2);
			while (contador <= numTerminos) {
				numeron = (3 * numero2) + (2 * numero1);
				numero1 = numero2;
				numero2 = numeron;
				System.out.println("a" + contador + "=" + numeron);
				contador++;
			}
		}

	}

}
