package lab1;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		int[] arreglo = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los numeros (10 en total):");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			int numero = scanner.nextInt();
			if (i > 0 && numero <= arreglo[i - 1]) {
				System.out.println("Error: El numero debe ser mayor alanterior.");
				i--; // decrementar el indice para que el usuario vuelva a ingresar el numero
			} else {
				arreglo[i] = numero;
			}
		}
		System.out.println("Arreglo completo:");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
	}
}
