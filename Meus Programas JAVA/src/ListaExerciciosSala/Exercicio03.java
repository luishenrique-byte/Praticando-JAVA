package ListaExerciciosSala;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o Primeiro Número: ");
        int numero1 = leitor.nextInt();
        System.out.println("Insira o Segundo Número: ");
        int numero2 = leitor.nextInt();
        int cont;
        if (numero1 > numero2) {
            for (cont = numero2;cont <= numero1; cont++) {
                System.out.print(" " + cont + " ");
            }
        } else {
            for (cont = numero1;cont<= numero2; cont++) {
                System.out.print(" " + cont + " ");
            }
        }
    }
}
