package ejercicios3_2;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Calcular y visualizar la suma y el producto de los números impares comprendidos entre 2 constantes LIMINF y LIMSUP con valores 20 y 40.
		final int LIMINF = 20;
		final int LIMSUP = 40;
		int suma = 0; 
		long producto = 1;
		int contador = LIMINF;
		while ((contador % 2 != 1)) {
			contador++;
		}
		while (contador <= LIMSUP) {
			suma += contador;
			producto *=  contador;
			contador = contador +2;
		}
		System.out.println("La suma de los impares entre " + LIMINF + " y " + LIMSUP + " es " + suma);
		System.out.println("El producto de los impares entre " + LIMINF + " y " + LIMSUP + " es " + producto);
	}

}
