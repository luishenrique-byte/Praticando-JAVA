package ListaExercicios05;

import java.util.Scanner;

public class Questao11{
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe uma frase com espaços(backspace) no ínicio e fim: ");
        String frase = leitor.nextLine();
        String fraseNova = frase.trim();

        System.out.println("(" + fraseNova + ")");
    }
}
