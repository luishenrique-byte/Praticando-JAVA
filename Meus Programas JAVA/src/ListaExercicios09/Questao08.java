package ListaExercicios09;

import java.util.Scanner;

//  8) Faça um programa que preencha um vetor com 10 valores recebidos pelo teclado e, ao final,
//  informe a posição do maior e do menor número. Em caso de empate, informe a posição do
//  primeiro localizado.
public class Questao08 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {

        int vetor[] = new int[10];
        alimentandoVetor(vetor);
        int numeroMaior = vetor[0], numeroMenor=vetor[0];
        int posicaoMaior = 0, posicaoMenor = 0;

        for (int i = 1; i < vetor.length; i++){
            // Aqui estou garantindo que, nos casos de empate,
            // sempre vai ser chamado a primeira posiçao do
            // primeiro número achado já que um número nunca
            // vai ser menor que ele mesmo
            // Uso do (>) ou inves do (>=)
            //           |
            //           V
            if (vetor[i] > numeroMaior){
                numeroMaior = vetor[i];
                posicaoMaior = i;
            } else if (vetor[i] < numeroMenor) {
                numeroMenor = vetor[i];
                posicaoMenor = i;
            }
        }
        System.out.printf("O número na posição %dº (%d) é o maior número %n", posicaoMaior+1,numeroMaior);
        System.out.printf("O número na posição %dº (%d) é o menor número", posicaoMenor+1,numeroMenor);
    }
    public static void alimentandoVetor(int[] vetor){
        for(int i = 0; i< vetor.length; i++) {
            System.out.println("informe um número inteiro: ");
            vetor[i] = sc.nextInt();
        }
    }
}
