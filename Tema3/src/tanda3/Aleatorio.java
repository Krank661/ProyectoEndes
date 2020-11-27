package tanda3;
import java.util.*;

public class Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor;
		Random numAleatorio = new Random();
		valor = numAleatorio.nextInt(100) + 1;
		if (valor %2 == 0)
			System.out.println("Es par" + valor);
		else
			System.out.println("Es impar" + valor);

	}

}
