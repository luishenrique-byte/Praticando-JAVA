package ListaExercicios05;

import java.util.Scanner;

public class Questao12 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a palavra: ");
        String palavra = leitor.nextLine();

        System.out.println("Informe uma caractere: ");
        String letra = leitor.next();

        if ( palavra.contains(letra)) {
            System.out.println("A primeira ocorrência desse cactere é no índice: " + palavra.indexOf(letra));
            System.out.println("A primeira ocorrência desse cactere é no índice: " + palavra.lastIndexOf(letra));
        } else {
            System.out.println("Esse caractere não existe nessa palavra");
        }

    }
}
