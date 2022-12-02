import java.util.*; 
public class UsuarioMaisVelhoUsuarioMaisNovo {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		String nome;
		String nomeVelho;
		String nomeNovo;
		byte idade, idadeVelho, idadeNovo;
		System.out.println("Digite o nome do primeiro usuário:");
		nome=ler.next();
		System.out.println("Digite a idade do primeiro usuário:");
		idade=ler.nextByte();
		nomeVelho=nome;
		nomeNovo=nome;
		idadeVelho=idade;
		idadeNovo=idade;
		System.out.println("Digite o nome do segundo usuário:");
		nome=ler.next();
		System.out.println("Digite a idade do segundo usuário:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		System.out.println("Digite o nome do terceiro usuário:");
		nome=ler.next();
		System.out.println("Digite a idade do terceiro usuário:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		System.out.println("Digite o nome do quarto usuário:");
		nome=ler.next();
		System.out.println("Digite a idade do quarto usuário:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		System.out.println("Digite o nome do quinto usuário:");
		nome=ler.next();
		System.out.println("Digite a idade do quinto usuário:");
		idade=ler.nextByte();
		if(idade>idadeVelho) {
			nomeVelho=nome;
			idadeVelho=idade;
		}else if(idade<idadeNovo) {
			nomeNovo=nome;
			idadeNovo=idade;
		}
		if(idadeVelho!=idadeNovo) {
			System.out.println(nomeVelho+" é o usuário mais velho, com "+idadeVelho+" anos e o usuário mais novo é "+nomeNovo+", com "+idadeNovo+" anos.");
		}else if(idadeVelho==idadeNovo) {
			System.out.println("Todos têm a mesma idade.");
		}
		ler.close();
	}
	
		
}
