package ListaExercicios04;

import java.util.Scanner;

class ConvertorDeDolar {

public static void main(String args[]){

	double reais;
	double dolar;
	double taxa;
	Scanner ler = new Scanner(System.in);

	System.out.println("Informe a valor em reais que quer converter: ");
	reais = ler.nextDouble();

	System.out.println("Informe o valor da Taxa de Câmbio atual do Dolar Americano(USD)");
	taxa = ler.nextDouble();

	dolar = reais*taxa;

	System.out.println("O valor de R$ " + reais + " convertido para Dolar Americano é US$ " + dolar);
	}
}