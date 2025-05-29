package ListaExerciciosSala;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = leitor.nextInt();
        int cont;
        System.out.println("Seus divisores são: ");
        for (cont = 1; cont <= numero; cont++) {

            if (numero%cont==0){
                System.out.print(" "+cont+" ");
            } else{
            }
        }
    }
}
