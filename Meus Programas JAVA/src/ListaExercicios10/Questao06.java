package ListaExercicios10;

import java.util.Scanner;
// Dado um valor inteiro digitado pelo usuário,
// informe se ele existe em uma matriz 5x5 previamente
// preenchida.
public class Questao06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {{1,2,3,4,5},{6,7,8,9,0}};

        System.out.println("Informe um número para verificar se há na matriz");
        int num = sc.nextInt();

        int cont=0;
        int indice1 = 0, indice2 = 0;
        for (int leitorIndice1 = 0;  leitorIndice1 < matriz.length;  leitorIndice1++) {
            for (int leitorIndece2 = 0; leitorIndece2 < matriz[leitorIndice1].length; leitorIndece2++) {
                if(matriz[leitorIndice1][leitorIndece2] == num){
                    cont++;
                    indice1 = leitorIndice1;
                    indice2 = leitorIndece2;
                }
            }
        }
        System.out.printf("O número %d aparece %d vezes nessa matriz: %n", num, cont);
        System.out.printf("POSIÇÃO DO NÚMERO %d: [%d  -  %d]",num,indice1,indice2);
    }
}
