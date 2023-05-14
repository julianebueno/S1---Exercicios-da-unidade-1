

/* Figura 8 */

import java.util.Scanner;

public class Exemplo2 {
	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Digite o primeiro valor inteiro: ");
		x = leitor.nextInt();
				
		System.out.print("Digite o segundo valor inteiro: ");
		y= leitor.nextInt();

		z = x + y;
		

		System.out.println("Soma dos dois valores = " + z);
		System.out.println("FIM");
		leitor.close();
	}
}
