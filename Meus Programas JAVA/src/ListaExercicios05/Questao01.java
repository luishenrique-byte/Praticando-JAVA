package ListaExercicios05;

import java.util.Scanner;

public class Questao01 {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva a frase: " );
        String frase = leitor.nextLine();

        System.out.println(frase.length());

    }
}

