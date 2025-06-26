package ListaExercicios10;
// Dada uma matriz 3x2, crie a matriz transposta (2x3) e imprima as duas.
public class Questao05 {
    public static void main(String args[]) {
        int[][] matriz = Questao01.fazendoMatriz();
        int[][] matrizEspelho = new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizEspelho[j][i] = matriz[i][j];
            }
        }
        for (int j = 0; j < matrizEspelho.length; j++) {
            for (int i = 0; i < matrizEspelho[i].length; i++) {
                System.out.print(matrizEspelho[j][i] + " ");

            }
            System.out.println();
        }
        System.out.println("---------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
