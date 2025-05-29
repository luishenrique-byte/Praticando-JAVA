package ListaExercicios07;

import java.util.Scanner;
public class Questao05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra para verificar se ela é uma palindromo");
        String frase = sc.nextLine();
        String fraseSemEspaco = frase.replaceAll(" ","");
        String fraseInvertida = "";
        for ( int i = fraseSemEspaco.length() - 1; i>=0; i--){
            char letra = fraseSemEspaco.charAt(i);
            fraseInvertida+=letra;
        }
        if (fraseSemEspaco.equalsIgnoreCase(fraseInvertida)){
            System.out.printf("A frase '%s' é um palindromo!",frase);
        } else {
            System.out.printf("A frase '%s' NÃO é um palindromo",frase);
        }
    }
}
