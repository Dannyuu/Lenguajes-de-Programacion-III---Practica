package lab1;
import java.util.*;
public class ejercicio5 {
	public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
		System.out.print("Ingrese el número de horas de estacionamiento: ");
		double horas = h.nextDouble();
		// Llamar a la función para calcular el cargo
		double cargo = calcularCargo(horas);
		System.out.println("El cargo por " + horas + " horas de estacionamiento es: S/" + cargo);
	}
	// Función que calcula el cargo según el número de horas
	public static double calcularCargo(double horas) {
		double cargo;
		if (horas <= 1) {
			cargo = 3.00;
		} 
		else {
			cargo = 3.00 + (horas - 1) * 0.50;
		}
		// Si el cargo supera el máximo diario, se aplica el cargo máximo
		if (cargo > 12.00) {
			cargo = 12.00;
		}
		return cargo;
	}

}
