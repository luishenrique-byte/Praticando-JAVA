package ListaExercicios04;

import java.util.Scanner;

public class Clt{

public static void main(String args[]) {

Scanner ler = new Scanner(System.in);
int horaSemana;
float valorHora, valorSemana, salarioSemana, salarioMes, salarioAno;

System.out.println("Informe as horas trabalhas por semana: ");
horaSemana = ler.nextInt();

System.out.println("Agora, informe o valor da hora: ");
valorHora = ler.nextFloat();

salarioSemana = (horaSemana/6 + horaSemana) * valorHora;

salarioMes = salarioSemana * 4;

salarioAno = salarioMes*12 + (salarioMes + (salarioMes/3));

System.out.println("-----------------------------------------");
System.out.println("Sálario Semanal: " + ("R$ " + salarioSemana));

System.out.println("Sálario Mensal: " + ("R$ " + salarioMes));

System.out.println("Sálario Anual(junto ás férias): " + ("R$ " + salarioAno));
System.out.println("-----------------------------------------");

	}
}