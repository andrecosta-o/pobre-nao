package gf.oracle.programacao;

import java.util.Scanner;

public class PobreNaoTeste {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		
		
		PobreNao usuario = new PobreNao();
		
		
        usuario.registrarMotivacao();
        usuario.registrarObstaculos();
        usuario.registrarMensagemFuturo();
        usuario.registrarObjetivoAnual();

        usuario.id = 1;
		System.out.println("Nome completo: ");
		usuario.nome = sc.nextLine();
		System.out.println("CPF: ");
		usuario.cpf = sc.nextLine();
		System.out.println("Telefone: ");
		usuario.telefone = sc.nextLine();
		System.out.println("Seu melhor e-mail: ");
		usuario.email = sc.nextLine();
		System.out.println("Seu endereco: ");
		usuario.endereco = sc.nextLine();
		System.out.println("Sua renda mensal");
		double salario = sc.nextDouble();
        
        
        usuario.calcularDistribuicaoSalario(salario);

        
        usuario.exibirDados();
    }
}
