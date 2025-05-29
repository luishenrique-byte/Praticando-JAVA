package ListaExercicios05;

import java.util.Scanner;

public class Questao04 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma frase: ");
        String frase = ler.nextLine();

        System.out.println(frase.toLowerCase());
    }
}
