package ListaExercicios10;

public class Questao04 {
    public static void main(String args[]) {
        int[][] matriz = Questao01.fazendoMatriz();
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i ; j++) {
                if(j==i) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("SOMA DA DIAGONAL DA MATRIZ = " + soma);
    }
}
