package lab1;
import java.util.*;
public class ejercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Solicitar al usuario el número de horas, minutos y segundos
		System.out.print("Ingrese el número de horas: ");
		int horas = s.nextInt();
		System.out.print("Ingrese el número de minutos: ");
		int minutos = s.nextInt();
		System.out.print("Ingrese el número de segundos: ");
		int segundos = s.nextInt();
		// Llamar a la función para convertir el tiempo a segundos
		int totalSegundos = convertirSegundos(horas, minutos, segundos);
		System.out.println("El tiempo equivalente en segundos es: " + totalSegundos);
	}
	// Función que convierte horas, minutos y segundos a segundos
	public static int convertirSegundos(int horas, int minutos, int segundos) {
		int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
		return totalSegundos;
	}
}
