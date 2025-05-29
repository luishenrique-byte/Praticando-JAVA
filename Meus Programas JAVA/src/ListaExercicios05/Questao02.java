package ListaExercicios05;

import java.util.Scanner;

public class Questao02 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma palavra : ");
        String palavra = ler.nextLine();

        System.out.println(palavra.charAt(2));

    }
}
