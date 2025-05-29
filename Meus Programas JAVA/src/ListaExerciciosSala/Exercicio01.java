package ListaExerciciosSala;

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = leitor.nextInt();
        int cont;
        for (cont = 0; cont <= numero; cont++) {
            System.out.print(" " + cont + " ");
        }
    }

}

