import java.util.*;
public class IMC {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso:");
		peso=ler.nextDouble();
		System.out.println("Digite sua altura:");
		altura=ler.nextDouble();
		imc=peso/(altura*altura);
		System.out.println("O seu IMC é "+imc+".");
		if (imc<18.5) {
			System.out.println("Excesso de magreza.");
		}else if (imc<25) {
			System.out.println("Peso normal.");
		}else if (imc<30) {
			System.out.println("Excesso de peso.");
		}else if (imc<35) {
			System.out.println("Obesidade (Grau I).");
		}else if (imc<40) {
			System.out.println("Obesidade (Grau II).");
		}else {
			System.out.println("Obesidade (Grau III).");
		}
		ler.close();
	}

}
