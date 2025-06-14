package gf.oracle.programacao;

import java.util.Scanner;

public class PobreNao {
	
	public int id;
	public String nome;
	public String cpf;
	public String telefone;
	public String email;
	
	public void exibirDados () {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + telefone);
		System.out.println("E-mail: " + email);
	}
	
	public void calcularDistribuicaoSalario(double salario) {
		double essencial = salario * 0.50;
        double desejos = salario * 0.30;
        double investimentos = salario * 0.20;

        System.out.println("\nDistribuição do salário:");
        System.out.println("Renda total: R$: " + salario);
        System.out.println("Essencial: R$ " + essencial);
        System.out.println("Desejos: R$ " + desejos);
        System.out.println("Investimentos: R$ " + investimentos);
    }
	
	 public void registrarMotivacao() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n--- Motivação para começar a guardar dinheiro ---");
	        System.out.print("Digite sua motivação: ");
	        String motivacao = scanner.nextLine();
	        System.out.println("Motivação registrada: " + motivacao);
	    }

	    // Método para registrar obstáculos financeiros
	    public void registrarObstaculos() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n--- O que mais atrapalha sua disciplina financeira ---");
	        System.out.print("Digite os obstáculos: ");
	        String obstaculos = scanner.nextLine();
	        System.out.println("Obstáculos registrados: " + obstaculos);
	    }

	    // Método para registrar mensagem para o futuro
	    public void registrarMensagemFuturo() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n--- Mensagem para você mesmo daqui a um ano ---");
	        System.out.print("Digite sua mensagem: ");
	        String mensagem = scanner.nextLine();
	        System.out.println("Mensagem registrada: " + mensagem);
	    }

	    // Método para registrar objetivo anual
	    public void registrarObjetivoAnual() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n--- Objetivo financeiro para o próximo ano ---");
	        System.out.print("Digite seu objetivo: ");
	        String objetivo = scanner.nextLine();
	        System.out.println("Objetivo registrado: " + objetivo);
	    }
}

