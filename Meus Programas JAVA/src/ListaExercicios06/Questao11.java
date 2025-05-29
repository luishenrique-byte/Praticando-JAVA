package ListaExercicios06;

import java.util.Scanner;
public class Questao11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia da semana(1 - Domingo / 7 - Sábado");
        int diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda-feira");
                break;
            case 3:
                System.out.println("Hoje é Terça-feira");
                break;
            case 4:
                System.out.println("Hoje é Quarta-feira");
                break;
            case 5:
                System.out.println("Hoje é Quinta-feira");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 7:
                System.out.println("Hoje é Sábado");
                break;
            default:
                System.out.println("Valor inválido. Insira um valor entre 1 e 7!");
        }
    }
}
