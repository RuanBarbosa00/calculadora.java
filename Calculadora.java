package ucsal;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor1, valor2, resultado;
		int operacao;
		System.out.println("Informe a opção desejada: "
				+ " (1) Soma"
				+ " (2) Subtracao"
				+ " (3) Mutiplicacao"
				+ " (4) Divisao");
		operacao = input.nextInt();
		
		System.out.println("Digite o primeiro valor desejado (entre 1 a 10): ");
		valor1 = input.nextDouble();
		
		System.out.println("Digite o segundo valor desejado (entre 1 a 10): ");
		valor2 = input.nextDouble();
		
	if (valor1 > 1 || valor1 < 10 || valor2 > 1 || valor2 < 10) {
		switch (operacao) {
		case 1:
			resultado = valor1 + valor2;
			System.out.println("O resultado da soma foi "+ resultado);
			break;
		
		case 2:
			resultado = valor1 - valor2;
			System.out.println("O resultado da subtracao foi " + resultado);
			break;
			
		case 3:
			resultado = valor1 * valor2;
			System.out.println("O resultado da mutiplicacao foi " + resultado);
			break;
			
		case 4:
			resultado = valor1 / valor2;
			System.out.println("O resultado da divisao foi " + resultado);
			break;
			
		default:
			System.out.println("Valor fora do intevalo");
			break;
		}
	}
}
}
