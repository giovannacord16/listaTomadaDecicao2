import java.util.*;
public class OrdemCrescenteNumeros {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		short a,b,c;
		System.out.println("Digite o valor A:");
		a=ler.nextShort();
		System.out.println("Digite o valor B:");
		b=ler.nextShort();
		System.out.println("Digite o valor C:");
		c=ler.nextShort();
		if (a<=b && b<=c && a<=c) {
			System.out.println("Esses são os valores em ordem crescente: "+a+", "+b+", "+c+".");
		}else if(a>b && b>=c && a>c) {
			System.out.println ("Esses são os valores em ordem crescente: "+c+", "+b+" e "+a+".");
		}else if(a>b && b<c && a<=c) {
			System.out.println("Esses são os valores em ordem crescente: "+b+", "+a+" e "+c+".");
		}else if(a<=b && b>c && a>c) {
			System.out.println ("Esses são os valores em ordem crescente: "+c+", "+a+" e "+b+".");
		}else if (b<c && c<a && b<a) {
			System.out.println ("Esses são os valores em ordem crescente: "+b+", "+c+" e "+a+".");
		}else {
			System.out.println ("Esses são os valores em ordem crescente: "+a+", "+c+" e "+b+".");
		}
		ler.close();
	}

}
