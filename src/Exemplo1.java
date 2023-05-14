

/* Figura 7 */

public class Exemplo1 {

	public static void main(String[] args) {
		
		int x, y;		//var basicas
		
		int X;			//var case sensitive
		
		boolean p;	//lógico
        //boolean q;	//lógico

		float a = 10.5f;//float já com valor
		
		x = 10;
		y = x - 38;
		
		X = 9 % 2; 		//X recebe o resto da divisão
		
		p = (3 >= 5);   //false
		//q = (true||false);//true                  //vs code grifa que é "errado" ou redundante essa condição"
		
		System.out.println("x = " + x);	//imprimindo os resultados
		System.out.println("y = " + y);
		System.out.println("X = " + X);
		System.out.println("p = " + p);
		//System.out.println("q = " + q);
		System.out.printf("a = %.2f", a*3);
	}
}