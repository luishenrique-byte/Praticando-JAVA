package ListaExercicios05;

import java.util.Scanner;

public class Questao03 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe uma frase: ");
        String frase = ler.nextLine();

        System.out.println(frase.toUpperCase());
    }
}