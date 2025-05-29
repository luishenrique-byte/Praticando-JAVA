package ListaExerciciosSala;
import java.util.Scanner;
public class ExercicioRepet03 {
    public static void main(String args[]) {
//        Faça uma função que receba uma String e um char como parâmetros, e
//        devolva a quantidade de vezes que o char aparece na palavra.
//        Modelo Questão 3
//        Palavra = “Exemplo”
//        Char = ‘a’
//        Saída:
//        0
//        -------------------------
//        Palavra = “eoierpoe”
//        Char = ‘e’
//        Saída:
//        3

        Scanner sc = new Scanner(System.in);
        System.out.println("informe a palavra: ");
        String frase = sc.nextLine();

        System.out.println("informe um caracter da palavra ou texto para saber quantas vezes ocorre");
        String letra = sc.nextLine();

        do {
            if (letra.length() != 1) {
                System.out.println("Digite apenas um caractere.");
                letra = sc.nextLine();
            }
        } while(letra.length() != 1);

        String testLetra ="";
        int tamanhoFrase = frase.length();
        int cont = 0;

        // acredito que tentar comparar direto caracteres seria mlhr e mais prático, mas o professor ainda não ensinou
        for(int i = 0; i < tamanhoFrase; i++) {
            testLetra = frase.charAt(i)+"";
            if (testLetra.equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("O caractere '" + letra + "' aparece " + cont + " vezes.");
    }
}
