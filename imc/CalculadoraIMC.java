package imc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraIMC {

	private String nome;
	private char sexo;
	private double altura;
	private double peso;
	private double idade;
	private String endereco;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do atleta: ");
		String nome = scanner.nextLine();

		System.out.print("Informe o sexo (M para masculino, F para feminino, P para preferir não informar): ");
		char sexo = scanner.next().charAt(0);

		System.out.print("Informe a altura em metros: ");
		double altura = scanner.nextDouble();

		System.out.print("Informe o peso em quilogramas: ");
		double peso = scanner.nextDouble();

		System.out.print("Informe sua idade: ");
		double idade = scanner.nextDouble();

		System.out.print("Informe seu endereço: ");
		scanner.nextLine();
		String endereco = scanner.nextLine();

		System.out.print("Informe seu telefone: ");
		String telefone = scanner.nextLine();

		CalculadoraIMC calculadora = new CalculadoraIMC();
		double imc = calculadora.calcularIMC(altura, peso);
		String classificacao = calculadora.classificarIMC(imc);

		// Formatar o IMC para mostrar apenas um número após o ponto
		DecimalFormat df = new DecimalFormat("0.0");
		String imcFormatado = df.format(imc);

		System.out.println("\nResultados para " + nome + ":");
		System.out
				.println("Sexo: " + (sexo == 'M' ? "Masculino" : (sexo == 'F' ? "Feminino" : "Prefiro não informar")));
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("IMC: " + imcFormatado); // Utilize o IMC formatado
		System.out.println("Classificação: " + classificacao);

		scanner.close();
	}

	double calcularIMC(double altura, double peso) {
		return peso / (altura * altura);
	}

	String classificarIMC(double imc) {
		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc < 24.9) {
			return "Peso normal";
		} else if (imc < 29.9) {
			return "Sobrepeso";
		} else if (imc < 34.9) {
			return "Obesidade grau 1";
		} else if (imc < 39.9) {
			return "Obesidade grau 2";
		} else {
			return "Obesidade grau 3";
		}
	}
}
