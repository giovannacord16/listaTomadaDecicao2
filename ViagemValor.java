import java.util.*;
public class ViagemValor {
	public static void main(String args[]) {
		Scanner ler=new Scanner (System.in);
		byte destino, dias;
		double valorTotal;
		System.out.println("Digite 1 para escolher Ilhabela ou 2 para escolher Fernando de noronha");
		destino=ler.nextByte();
		System.out.println("Digite a quantidade de dias");
		dias=ler.nextByte();
		if (destino==1) {
			if(dias<=5) {
				valorTotal=dias*240.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else if (dias<=10) {
				valorTotal=(dias*220.00)+130.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else {
				valorTotal=(dias*210.00)+150.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}
		}else {
			if (dias<=5) {
				valorTotal=(dias*400.00)+100.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else if (dias<=10) {
				valorTotal=(dias*410.00)+150.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}else {
				valorTotal=(dias*420.00)+200.00;
				System.out.println("O valor a ser pago é R$"+valorTotal);
			}
		}
		ler.close();	
	}

}
