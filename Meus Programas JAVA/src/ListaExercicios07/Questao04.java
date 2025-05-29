package ListaExercicios07;

import java.util.Scanner;
public class Questao04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra para verificar se ela é uma palindromo");
        String palavra = sc.nextLine();
        String palavraInvertida = "";
        for ( int i = palavra.length() - 1; i>=0; i--){
            char letra = palavra.charAt(i);
            palavraInvertida+=letra;
        }
        if (palavra.equalsIgnoreCase(palavraInvertida)){
            System.out.printf("A palavra %s é um palindromo!",palavra);
        } else {
            System.out.printf("A palavra %s NÃO é um palindromo",palavra);
        }
    }
}
