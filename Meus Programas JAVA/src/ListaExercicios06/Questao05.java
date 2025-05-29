package ListaExercicios06;

import java.util.Scanner;
public class Questao05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Número da Conta");
        int conta = sc.nextInt();

        System.out.println("Digite a Senha");
        int senha = sc.nextInt();

        if (conta == 20457 && senha==102956){
            System.out.println("ACESSO PERMITIDO");
        } else if (conta != 20457 && senha == 102956) {
            System.out.println("Número da Conta Inválido");
        } else if (conta == 20457 && senha !=102956) {
            System.out.println("Numero da Senha Inválido");
        } else {
            System.out.println("Ambas Informações inválidas");
        }
    }
}
