import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner (System.in);
		System.out.println("Digite seu nome!");
		String nome = leTeclado.next();
		System.out.println ("Seu nome é" + nome);
	}

}
