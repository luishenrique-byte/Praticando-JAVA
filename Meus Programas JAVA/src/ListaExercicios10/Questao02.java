package ListaExercicios10;
//Dado uma matriz preenchida no exercicio anterio,
//exiba seus valores formatados em forma de tabela.
public class Questao02 {
    public static void main(String args[]) {
        int[][] matriz = Questao01.fazendoMatriz();
        System.out.println("----------------------");
        System.out.printf("|  %d  |  %d  |  %d  |%n",matriz[0][1],matriz[0][2],matriz[0][2]);
        System.out.println("----------------------");
        System.out.printf("|  %d  |  %d  |  %d  |%n",matriz[1][1],matriz[1][2],matriz[1][2]);
        System.out.println("----------------------");
        System.out.printf("|  %d  |  %d  |  %d  |%n",matriz[2][1],matriz[1][2],matriz[1][2]);
        System.out.println("----------------------");
    }
}
