package ListaExercicios10;

//Escreva um programa que crie uma matriz 3x3 de inteiros
//e preencha com valores digitados pelo usuário.

import java.util.Scanner;

public class Questao01 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {

    }
    public static int[][] fazendoMatriz(){

        int[][] matriz = pedirTamanho();
        for (int i = 0; i < matriz.length; i++){
            for (int j =0; j < matriz[i].length; j++){
                System.out.printf("Informe o numero para posição (%d, %d) da Matriz%n", i,j);
                matriz[i][j]= sc.nextInt();
            }
        }
        return matriz;
    }
    private static int[][] pedirTamanho(){
        int num1,num2;
        System.out.println("Preciso que me dê dois números para montar a matriz BIDIMENSIONAL");
        System.out.println("INFORME O PRIMEIRO NÚMERO: ");
        num1 = sc.nextInt();
        System.out.println("INFORME O PRIMEIRO NÚMERO: ");
        num2 = sc.nextInt();
        int [][] matriz = new int[num1][num2];
        return matriz;
    }
}
