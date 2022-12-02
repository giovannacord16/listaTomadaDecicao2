import java.util.*;
public class TipoTriangulo {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite a primeira medida do triângulo:");
		a=ler.nextDouble();
		System.out.println("Digite a segunda medida:");
		b=ler.nextDouble();
		System.out.println("Digite a terceira medida:");
		c=ler.nextDouble();
		if (a>c+b || b>a+c || c>a+b) {
			System.out.println("As medidas não formam um triângulo.");
		}else if (a==b && b==c && c==a) {
			System.out.println("As medidas formam um triângulo equilátero.");
		}else if (a!=b && b!=c && c!=a) {
			System.out.println("As medidas formam um triângulo escaleno.");
		}else {
			System.out.println("As medidas formam um triângulo isósceles.");
		}
		ler.close();
	}

}
