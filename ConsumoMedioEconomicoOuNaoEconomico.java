import java.util.*;
public class ConsumoMedioEconomicoOuNaoEconomico {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		double km, litros, consumoMedio;
		System.out.println ("Digite a distância percorrida (em kilômetros):");
		km=ler.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustível (em litros):");
		litros=ler.nextDouble();
		consumoMedio=km/litros;
		System.out.println ("O consumo médio é de "+consumoMedio+" km/L.");
		if (consumoMedio>=10) {
			System.out.println("O carro é econômico.");
		}else {
			System.out.println("O carro não é econômico.");
		}
		ler.close();
	}

}
