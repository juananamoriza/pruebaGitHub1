package ejercicios3_2;

public class Prueba {

	public static void main(String[] args) {
		int iniciofila = 100;
		System.out.println("Introduce el número de filas: ");
		System.out.println("IĀAAAAAAA");
		int n = Consola.leeInt();
		int mult = 1;
		int col = n;
		int sw=0;
		int var=1;
		int num, contcol;
		while (mult <=n) {
			iniciofila=iniciofila*mult;
			num=iniciofila;
			System.out.print(num + " ");
			//var = var;
			contcol=1;
			if (sw==0) {
				while (contcol<col) {
					num=num-var;
					var=var*mult;
					contcol=contcol+1;
					System.out.print(num + " ");
				}
				sw=1;
			}else {
				while (contcol<col) {
					num=num+var;
					var=var*mult;
					contcol=contcol+1;
					System.out.print(num + " ");
				}
				sw=0;
			}
			col=col-1;
			mult=mult+1;
			System.out.println();
		}
	}

}
