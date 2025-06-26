package ListaExercicios10;

import java.util.Scanner;

public class Questao07 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {{1,2,3,4,5},{6,7,8,9,0}};


        int maior = matriz[0][0], menor = matriz[0][0];
        int indice1Maior =0, indice2Maior = 0;
        int indice1Menor = 0, indice2Menor = 0;
        for (int i = 0;  i < matriz.length;  i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior){

                    maior = matriz[i][j];

                    indice1Maior = i;
                    indice2Maior = j;

                } else if (matriz[i][j]< menor) {

                    menor = matriz[i][j];

                    indice1Menor = i;
                    indice2Menor = j;
                }
            }
        }

        System.out.printf("POSIÇÃO DO NÚMERO *MAIOR* (%d): [%d  -  %d]%n",maior,indice1Maior,indice2Maior);
        System.out.printf("POSIÇÃO DO NÚMERO *menor* (%d): [%d  -  %d]",menor,indice1Menor,indice2Menor);
    }
}
