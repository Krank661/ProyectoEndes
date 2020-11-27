/*Programa: ejerciciotres. Programa calcula el índice de masa corporal de una persona a partir de su peso y altura
 *Entorno: peso, altura, imc (números reales)
 *Algoritmo:
 *	Inicializar variables
 *	Visualizar "Introduzca su peso"
 *	Leer peso
 *	Visualizar "Introduzca su altura"
 *	Leer altura
 *	Calcular imc (peso/altura^2)
 *	Visualizar el imc y el correspondiente estado
 *Fin programa	
 *	
 * 
 */
package examen2;
import java.util.*;
/**
 * @author tardes Ana Caballero Álvarez
 * 23 nov. 2020
 */
public class ejerciciotres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double peso = 0;
		double altura = 0;
		double imc = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su peso");
		peso = teclado.nextDouble();
		System.out.println("Introduzca su altura");
		altura = teclado.nextDouble();
		
		imc = (peso / (Math.pow(altura, 2)) );
		
		if(imc < 16) {
			System.out.println("IMC: " + imc);
			System.out.println("Ingreso en hospital");
		} else if(imc >= 16 && imc < 17) {
			System.out.println("IMC: " + imc);
			System.out.println("Infrapeso");
		} else if(imc >= 17 && imc < 25) {
			System.out.println("IMC: " + imc);
			System.out.println("Peso normal");
		} else if(imc >= 25 && imc < 30) {
			System.out.println("IMC: " + imc);
			System.out.println("Obesidad grado I");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("IMC: " + imc);
			System.out.println("Obesidad grado II");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("IMC: " + imc);
			System.out.println("Obesidad grado III");
		} else {
			System.out.println("IMC: " + imc);
			System.out.println("Obesidad grado IV");
		}
		teclado.close();

	}

}
