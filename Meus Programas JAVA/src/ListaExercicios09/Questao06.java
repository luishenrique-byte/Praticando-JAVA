package ListaExercicios09;

import java.util.Scanner;

public class Questao06 {
//    6) Faça um programa que receba um número inteiro N maior do que zero e preencha um vetor
//    com os N primeiros termos da sequência de Fibonacci e depois percorra esse vetor exibindo os
//    números calculados em tela.
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Por favor informe um npumero inteiro maior que 0:");
        int num = sc.nextInt();

        int[] sequenciaFibonacci = alimentarVetor(num);
        exibirSequenciaFibonacci(sequenciaFibonacci);
    }

    public static int[] alimentarVetor(int qtdeNumero){
        int[] sequencia = new int[qtdeNumero];

        if (qtdeNumero >= 1) sequencia[0] =1;
        if (qtdeNumero >= 2) sequencia[1] = 1;

        for(int i = 2; i < qtdeNumero; i++){
            if(qtdeNumero > 2) {
                sequencia[i] = sequencia[i-1]+sequencia[i-2];
            }

        }

        return sequencia;
    }

    public static void exibirSequenciaFibonacci(int[] sequenciaFibonacci) {
        System.out.println("---------------SEQUÊNCIA DE FIBONACCI-------------------");
        for (int x =0; x<sequenciaFibonacci.length;x++){
            System.out.print(sequenciaFibonacci[x] + " ");
        }
//        for (int x : sequenciaFibonacci){      usando o for-each para ficar mais legivel meu código
//            System.out.print(x + " ");
//        }
    }
}
