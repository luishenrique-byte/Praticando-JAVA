package ListaExercicios05;

import java.util.Scanner;

public class Questao09{
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a palavra: ");
        String palavra1 = leitor.nextLine();

        System.out.println(palavra1.endsWith("guer"));
    }
}
