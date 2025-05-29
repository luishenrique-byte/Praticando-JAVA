package ListaExercicios06;

import java.util.Scanner;
public class Questao07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o DIA do nascimento: ");
        int diaNasc = sc.nextInt();
        System.out.println("Informe o MÊS do nascimento");
        int mesNasc = sc.nextInt();
        System.out.println("Informe o ANO do nascimento");
        int anoNasc = sc.nextInt();

        System.out.println("Informe que Dia é hoje: ");
        int diaHoje = sc.nextInt();
        System.out.println("Informe que Mês é hoje: ");
        int mesHoje = sc.nextInt();
        System.out.println("Informe que Ano é hoje: ");
        int anoHoje = sc.nextInt();

        int idade = anoHoje - anoNasc;

        if (mesHoje< mesNasc || ( mesHoje==mesNasc && diaHoje<diaNasc)){
            idade--;
            System.out.println("=============================");
            System.out.printf("Sua idade atual é %d", idade);
        }
    }
}
