package ListaExerciciosSala;

import java.util.Scanner;
public class ExercicioFibonacci {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro número da sequência: ");
        int num1 = leitor.nextInt();

        System.out.println("Informe o próximo número da sequência: ");
        int num2 = leitor.nextInt();

        System.out.println("Agora informe qual a última posição quer: ");
        int posicao = leitor.nextInt();

        System.out.println("==========SEQUÊNCIA DE FIBONACCI==========");
        System.out.print(" "+ num1+" " + num2);

        for(int cont = 2;cont<posicao;cont++){
            int num3 = num1 + num2;
            System.out.print(" "+ num3);
            num1=num2;
            num2=num3;
        }
        System.out.println();
        System.out.print("==========ATÉ A " + posicao + "º POSIÇÃO ==========");
    }
}
