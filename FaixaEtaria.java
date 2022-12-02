import java.util.*;
public class FaixaEtaria {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		short anoAtual, anoNascto; 
		byte idade;
		System.out.println ("Digite o ano atual:");
		anoAtual=ler.nextShort();
		System.out.println ("Digite seu ano de nascimento:");
		anoNascto=ler.nextShort();
		idade=(byte) (anoAtual-anoNascto);
		System.out.println("Você tem "+idade+" anos de idade.");
		if (idade<10) {
			System.out.println("Criança.");
		}else if (idade<18) {
			System.out.println ("Adolescente.");
		}else if (idade<60) {
			System.out.println ("Adulto.");
		}else {
			System.out.println ("Idoso.");
		}
		ler.close();
	}

}
