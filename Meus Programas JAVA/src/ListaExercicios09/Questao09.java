package ListaExercicios09;

import java.util.Scanner;

public class Questao09 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int progressaoArit[] = alimentandoVetor();
        System.out.println("-------EXIBINDO VETOR-------");
        for (int x = 0; x<progressaoArit.length; x++){

            System.out.print(progressaoArit[x] +" ");

        }
    }
    public static int[] alimentandoVetor(){
        int[] vetor = new int[20];
        System.out.println("Por favor, infome o PRIMEIRO TERMO DA PA: ");
        vetor[0] = sc.nextInt();
        System.out.println("Agora, infome o SEGUNDO TERMO DA PA: ");
        vetor[1] = sc.nextInt();

        int razao = calculadoPA(vetor);

        for (int i = 2; i < vetor.length;i++){
            vetor[i] = vetor[i-1] + razao;
        }
        return vetor;
    }
    public static int calculadoPA(int[] vetor){
        int razaoPA = vetor[1]-vetor[0];
        return razaoPA;
    }
}
