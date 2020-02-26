package ejercicios3_2;

public class Ejemplo {

	public static void main(String[] args) {
		int numFilas = 10;
		int numColumnas = (numFilas / 2);
		int inicioFila = 10;
		int inicioFactor = 2;
		int incrementoFila = 10;
		int incrementoColumnaSuma = 1;
		char swOperacion = 'S';
		int contadorFila = 1;
		int incrementoColumnaProducto, numero, contadorColumna;
		while (contadorFila <= numFilas) {
			incrementoColumnaProducto = 1 * inicioFactor;
			numero = inicioFila;
			contadorColumna = 1;
			while (contadorColumna <= numColumnas) {
				System.out.print(numero + "    ");
				if (swOperacion == 'S') {
					numero = numero - incrementoColumnaSuma;
				} else {
					numero = numero - incrementoColumnaProducto;
					incrementoColumnaProducto = incrementoColumnaProducto * 2;
				}
				contadorColumna = contadorColumna + 1;
			}
			if (swOperacion == 'S') {
				
				swOperacion = 'P';
			} else {
				inicioFactor = inicioFactor + 1;
				swOperacion = 'S';
			}
			incrementoColumnaSuma = incrementoColumnaSuma + 1;
			inicioFila = inicioFila + incrementoFila;
			incrementoFila = incrementoFila + 10;
			System.out.println();
			contadorFila = contadorFila + 1;
		}

	}

}
