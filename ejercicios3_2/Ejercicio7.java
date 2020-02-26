package ejercicios3_2;

public class Ejercicio7 {

	public static void main(String[] args) {
//		Esta tabla muestra el coeficiente intelectual medio de mujeres y hombres de Manchester y Sheffield
//
//						Mujeres		Hombres
//		Manchester		102			101
//		Sheffield		106			105
//
//		Se pide realizar un programa que pida la introducción, para 10 personas, de:
//		•	Su sexo (H-hombre, M-mujer, --> validar)
//		•	Su edad (validar que esté comprendida entre 0 y 150)
//		•	Su ciudad (M-Manchester, S-Sheffield --> validar)
//		•	Su coeficiente intelectual (que esté comprendido entre 50 y 250)
//
//		Para cada persona, se deberá visualizar:
//		•	Si su coeficiente es mayor, menor o igual a la media de los de su misma ciudad y sexo (de acuerdo a la tabla anterior)
//		Además, se deberá visualizar:
//		•	El coeficiente máximo de los hombres de Sheffield con edades comprendidas entre 20 y 30 años
//		•	El coeficiente medio de las personas de Manchester

		int numPersonas = 10, edad, coeficiente, coeficienteMedio, maxCoeficienteSH20y30 = 0,
		      sumaCoeficienteManchester = 0, numManchester = 0;
		char sexo, ciudad;
		float mediaCoeficienteManchester;
		for (int i = 1; i <= numPersonas; i++) {
			do {
				System.out.println("Introduce el sexo");
				sexo = Consola.leeChar();
			} while ((sexo != 'M') && (sexo != 'H'));
			do {
				System.out.println("Introduce la edad");
				edad = Consola.leeInt();
			} while ((edad < 0) || (edad > 150));
			do {
				System.out.println("Introduce la ciudad");
				ciudad = Consola.leeChar();
			} while ((ciudad != 'M') && (ciudad != 'S'));
			do {
				System.out.println("Introduce el coeficiente");
				coeficiente = Consola.leeInt();
			} while ((coeficiente < 50) || (coeficiente > 250));
			if (ciudad == 'M') {
				if (sexo == 'M')
					coeficienteMedio = 102;
				else
					coeficienteMedio = 101;
				numManchester++;
				sumaCoeficienteManchester += coeficiente;
			} else {
				if (sexo == 'M')
					coeficienteMedio = 106;
				else {
					coeficienteMedio = 105;
					if ((edad >= 20) && (edad <= 30)) {
						if (coeficiente > maxCoeficienteSH20y30)
							maxCoeficienteSH20y30 = coeficiente;
					}
				}
			}
			if (coeficiente < coeficienteMedio)
				System.out.println("El coeficiente es menor que el de la media");
			else if (coeficiente == coeficienteMedio)
				System.out.println("El coeficiente es igual al de la media");
			else
				System.out.println("El coeficiente es mayor que el de la media");
		}
		if (numManchester > 0) {
			mediaCoeficienteManchester = (float) sumaCoeficienteManchester / numManchester;
			System.out.println("Coeficiente medio de las personas de Manchester: " + mediaCoeficienteManchester);
		}
		System.out.println(
		      "El coeficiente máximo de los hombres de Sheffield con edades comprendidas entre 20 y 30 años es "
		            + maxCoeficienteSH20y30);

	}

}
