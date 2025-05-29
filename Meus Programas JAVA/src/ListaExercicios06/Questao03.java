package ListaExercicios06;

import java.util.Scanner;
public class Questao03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Primeiro Número: ");
        int numero1 = sc.nextInt();

        System.out.println("Insira o Segundo Número: ");
        int numero2 = sc.nextInt();

        if (numero1%numero2 == 0) {
            System.out.printf("Sim, são divisores. O número " + numero2 + " é divisor do número %d", numero1 );
        } else if (numero2%numero1==0) {
            System.out.printf("Sim, são divisores, O número " + numero1 + " é divisor do número %d", numero2);
        } else {
            System.out.print("Os números informados não são divisores.");
        }
    }
}