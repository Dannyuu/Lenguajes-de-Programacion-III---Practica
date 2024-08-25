package lab1;
import java.util.Random;
public class ejercicio3 {
	public static void main(String[] args) {
		int[] frecuencias = new int[6]; // arreglo para guardar las frecuencias de cada cara
		Random random = new Random();
		for (int i = 0; i < 20000; i++) {
			int cara = random.nextInt(6) + 1; // lanzar el dado (1-6)
			frecuencias[cara - 1]++; // incrementar la frecuencia de la cara correspondiente
		}
		System.out.println("Frecuencias de cada cara:");
		for (int i = 0; i < frecuencias.length; i++) {
			System.out.println("Cara " + (i + 1) + ": " +
					frecuencias[i] + " veces");
		}
	}

}
