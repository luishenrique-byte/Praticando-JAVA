package ListaExercicios09;
//10) Faça um programa que preencha um vetor com números recebidos pelo teclado, mas só
//permita a inserção de números primos. Ao final o conteúdo do vetor deve ser mostrado na tela.
import ListaExercicios08.Questao01;

import java.util.Scanner;
public class Questao10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int vetor[] = alimentandoVetor();
        exibirVetor(vetor);
    }

    private static int[] alimentandoVetor() {
        int vetor[]= new int[10];
        int indice = 0;
        while(indice!=10){
            System.out.println("informe um número inteiro(de preferencia primo): ");
            int num = sc.nextInt();
            if(Questao01.verificarPrimo(num)){
                vetor[indice] = num;
                indice++;
            }
        }
        return vetor;
    }
//    public static boolean verificarPrimo(int num){
//        if(num <=1){
//            return false;
//        }
//
//        for (int x = 2; x <= Math.sqrt(num); x++){
//            if(num%x==0){
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static void exibirVetor(int[] vetor) {
        System.out.println("------EXIBINDO VETOR--------");
        for(int y = 0; y < vetor.length; y++){
            System.out.print(vetor[y]+" ");
        }
    }
}
