package lab1;
import java.util.Scanner;
public class ejercicio4 {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		// Solicitar los tres números decimales al usuario
		System.out.print("Ingrese el primer número: ");
		double num1 = d.nextDouble();

		System.out.print("Ingrese el segundo número: ");
		double num2 = d.nextDouble();

		System.out.print("Ingrese el tercer número: ");
		double num3 = d.nextDouble();

		// Llamar a la función menor y mostrar el resultado
		double menorNumero = menor(num1, num2, num3);
		System.out.println("El menor de los tres números es: " + menorNumero);
	}
	// Función que devuelve el menor de tres números decimales
	public static double menor(double a, double b, double c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}
}
