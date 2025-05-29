package ListaExercicios04;

import java.util.Scanner;
class Horas{
public static void main(String args[]) {

	int tempo;
	int horas;
	int minutos;
	int segundos;
	
	Scanner ler = new Scanner(System.in);

	System.out.println("Informe o Tempo, em segundos: ");
	tempo = ler.nextInt();

	horas = tempo/3600;
	minutos = (tempo%3600)/60;
	segundos = ((tempo%3600)%60);

System.out.println("O tempo de " + tempo + " segundos é equivalente a: " + horas + "h " + minutos +"m "+segundos+"s");
	}
}