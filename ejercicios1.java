package lab1;
import java.util.*;
public class ejercicios1 {
	public static int sumaArreglo(int[] arreglo) {
		int suma = 0;
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];
		}
		return suma;
	}
	public static void main(String[] args) {
		int[] arreglo = {1, 2, 3, 4, 5};
		int suma = sumaArreglo(arreglo);
		System.out.println("Suma del arreglo: " + suma);
	}
}
