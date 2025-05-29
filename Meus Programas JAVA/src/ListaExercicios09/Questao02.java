package ListaExercicios09;

import java.util.Arrays;
import java.util.Scanner;
public class Questao02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
//        2) Faça um programa em Java, modularizado, que preencha um vetor
//        de 50 posições com  valores inteiros recebidos pelo teclado e,
//        em seguida, mostre os valores na ordem inversa da  que foram digitados.

        int vetorNumero[] = new int[50];

        receberNumero(vetorNumero);
        exibirNumero(vetorNumero);

    }
    public static int[] receberNumero(int vetorNumero[]){

        for(int i = 0; i< vetorNumero.length; i++) {
            System.out.println("Informe um número para a posição " + (i+1));
            int num = sc.nextInt();
            vetorNumero[i]=num;
        }
        return vetorNumero;
    }
    static void exibirNumero(int vetor[]){
        for (int j = vetor.length-1; j>=0;j--){
            System.out.print(vetor[j]+", ");
        }
    }
}
