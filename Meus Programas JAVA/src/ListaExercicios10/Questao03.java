package ListaExercicios10;
//Calcule a soma de todos os elementos de uma matriz 3x3.
public class Questao03 {
    public static void main(String args[]) {
        int[][] matriz = Questao01.fazendoMatriz();
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                soma+=matriz[i][j];
            }
        }
        System.out.println("A SOMA TOTAL = "+soma);
    }
}
