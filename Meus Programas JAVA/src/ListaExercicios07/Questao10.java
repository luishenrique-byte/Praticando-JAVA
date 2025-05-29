package ListaExercicios07;

import java.util.Scanner;
public class Questao10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int valorTotal = 0;

        while(true) {
            System.out.print("Por favor informe o número do apartamento: ");
            int numAp = sc.nextInt();
            if (numAp==0){
                System.out.println("OPERAÇÃO FINALIZADA");
                break;
            };
            System.out.print("Agora informe os dias: ");
            int dias = sc.nextInt();
            System.out.print("");

            int valor;
            if (dias<10){
                valor = 30+(15*dias);
            } else {
                valor = 30+(8*dias);
            }

            valorTotal+=valor;
            System.out.println("REGISTRO CONCLUÍDO");

        }
        System.out.printf("O valor arrecadado é de R$ %d",valorTotal);
    }
}
