package gf.oracle.programacao;

public class PobreNaoTeste {
	public static void main (String[] args) {
		
		PobreNao usuario = new PobreNao();
		usuario.id = 1;
		usuario.nome = "Carlos Souza";
		usuario.cpf = "12345678900";
		usuario.telefone = "(11) 99999-99999";
		usuario.email = "carlos@gmail.com";
		
		usuario.exibirDados();

        // Calculando a distribuição do salário
        double salario = 3500.00;
        usuario.calcularDistribuicaoSalario(salario);
        usuario.registrarMotivacao();
        usuario.registrarObstaculos();
        usuario.registrarMensagemFuturo();
        usuario.registrarObjetivoAnual();
    }
}
