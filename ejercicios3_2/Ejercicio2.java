package ejercicios3_2;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Programa que muestre continuamente el siguiente menú por pantalla, hasta que se introduzca la opción E
//		A-	Calcular raíz cuadrada
//		B-	Calcular cubo
//		C-	Calcular sumatorio
//		D-	Calcular factorial
//		E-	Salir
//
//		*Puedes calcular la ”raíz cuadrada de num” así:
//		root = Math.sqrt (num):
//
//		Por cada opción, excepto la E, se deberá pedir la introducción de un nuevo número entero, se mostrará el resultado de hacer el cálculo oportuno y se volverá a mostrar el menú.
//		Si se introduce una opción errónea (p.e ‘K’) debe mostrar “Opción inválida” y continuar con el menú.

		char opcion;
		int numero;
		do {
			System.out.println("A - Calcular raíz cuadrada");
			System.out.println("B - Calcular cubo");
			System.out.println("C - Calcular sumatorio");
			System.out.println("D - Calcular factorial");
			System.out.println("E - Salir");
			opcion = Consola.leeChar();
			switch (opcion) {
				case 'a':
				case 'A':
					do {
						System.out.println("Introduce un entero positivo (>0): ");
						numero = Consola.leeInt();
					} while (numero <= 0);
					double resultadoa = Math.sqrt(numero);
					System.out.println("Resultado: " + resultadoa);
					break;
				case 'b':
				case 'B':
					do {
						System.out.println("Introduce un entero positivo (>0): ");
						numero = Consola.leeInt();
					} while (numero <= 0);
					long resultadob = numero * numero * numero;
					System.out.println("Resultado: " + resultadob);
					break;
				case 'c':
				case 'C':
					do {
						System.out.println("Introduce un entero positivo (>0): ");
						numero = Consola.leeInt();
					} while (numero <= 0);
					int resultadoc = 0;
					for (int i = 1; i <= numero; i++) {
						resultadoc += i;
					}
					System.out.println("Resultado: " + resultadoc);
					break;
				case 'd':
				case 'D':
					do {
						System.out.println("Introduce un entero positivo (>0): ");
						numero = Consola.leeInt();
					} while (numero <= 0);
					long resultadod = 1;
					for (int i = 1; i <= numero; i++) {
						resultadod *= i;
					}
					System.out.println("Resultado: " + resultadod);
					break;
				case 'e':
				case 'E':
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
		} while ((opcion != 'E') && (opcion != 'e'));

	}

}
