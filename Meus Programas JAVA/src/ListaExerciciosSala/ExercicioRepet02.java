package ListaExerciciosSala;
import java.util.Scanner;
public class ExercicioRepet02 {
//    Faça uma função que receba por parâmetro uma palavra e mostre na
//    tela a palavra como mostrado abaixo.
//    Modelo Questão 2
//    Palavra = “Exemplo”
//    Saída:
//    E
//    Ex
//    Exe
//    Exem
//    Exemp
//    Exempl
//    Exemplo
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("informe a palavra: ");
        String frase = sc.nextLine();

        int tamanhoFrase = frase.length();
        String pedacoFrase ="";


        for (int i = 0; i<=tamanhoFrase; i++) {

            pedacoFrase += frase.charAt(i);
            System.out.println(pedacoFrase);

        }
    }
}
