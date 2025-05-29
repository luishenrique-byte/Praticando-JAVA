package ListaExercicios04;

import java.util.Scanner;

class ConsumoGasolina{

public static void main(String args[]) {
	double distancia;
	double consumoMedio;
	double combustivel;

	Scanner ler = new Scanner(System.in);

	System.out.println("Informe a distância(em quilômetros): ");
	distancia = ler.nextDouble();

	System.out.println("Informe o consumo médio do seu carro: ");
	consumoMedio = ler.nextDouble();

	combustivel = distancia/consumoMedio;
		
	System.out.println("Em " + distancia + " KM, seu carro irá cosumir " + combustivel + " L de combustível!");
	}
}