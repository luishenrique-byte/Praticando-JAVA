package ListaExercicios06;

import java.util.Scanner;
public class Questao01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:" );
        int numero = sc.nextInt();

        double raiz = Math.sqrt(numero);

        if (Math.pow(raiz, 2) == numero){
        System.out.printf("O Número Informado %d É um Quadrado Perfeito", numero);
        } else {
        System.out.printf("O Número Informado %d NÃO é66 um Quadrado Perfeito", numero);
        }
    }
}
