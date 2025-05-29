package ListaExercicios09;

import java.util.Scanner;
import java.util.Random;
public class Questao03 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void main(String args[]) {

        int vetor[] = alimentarVetor(50);
        System.out.println("vetor alimentado;");

        int numero = receberNumero();

        int qtde = verificarExistencia(numero, vetor);

        int posicao[] = identificarPosicao(numero,qtde,vetor);
    }

    public static int[] alimentarVetor(int x) {
        int[] listaNumeros = new int[50];
        for (int i = 0; i < x; i++){
            listaNumeros[i] = rd.nextInt(0,50);
        }
        return listaNumeros;
    }

    public static int receberNumero(){
        System.out.println("Por favor, diga o número a ser verificado: ");
        return sc.nextInt();
    }
    public static int verificarExistencia(int numero, int[] vetor){
        int contador = 0;
        for( int z = 0; z < vetor.length; z++){
            if (numero == vetor[z]) {
                contador++;
            }
        }
        return contador;
    }
    private static int[] identificarPosicao(int numero, int qtde, int[] vetor) {
        int posicao[] = new int[qtde];

        int indiceAtual=0;
        for (int j = 0; j<vetor.length;j++){
            if(numero == vetor[j]){
            posicao[indiceAtual]=j;
            indiceAtual++;
                if (indiceAtual == qtde){
                    break;
                }
            }
        }
        return posicao;
    }
}
