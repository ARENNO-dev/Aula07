
public class Funcoes {
	
	public static void mostrarMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua op��o!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtra��o");
		System.out.println("4 - Realizar divis�o");
		System.out.println("5 - Realizar multiplica��o");
		System.out.println("6 - Sair");
	}
	
	public static void exibirResultado(double resultado) {
		System.out.println("O resultado foi " + resultado + "!\n\n");
	}
	
	public static void somar(double valor1, double valor2) {
		double soma;
		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
		soma = valor1 + valor2;
		exibirResultado(soma);
	}
	
	public static void subtrair(double valor1, double valor2) {
		//double subtracao;
		System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
		//subtracao = valor1 - valor2;
		//System.out.println("O resultado foi " + subtracao + "!\n\n");
		exibirResultado(valor1-valor2);
	}
	
	public static void dividir(double valor1, double valor2) {
		double divisao;
		System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
		divisao = valor1 / valor2;
		System.out.println("O resultado foi " + divisao + "!\n\n");
	}
	
	public static void multiplicar(double valor1, double valor2) {
		double multiplicacao;
		System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
		multiplicacao = valor1 * valor2;
		System.out.println("O resultado foi " + multiplicacao + "!\n\n");
	}
	

}
