package ListaExerciciosSala;
import java.util.Scanner;
public class ExercicioRepet04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num, qtdeNumAc=0, qtdeNumDesc=0;
        float acumulador = 0;

        while(true){
            System.out.println("Informe um número: ");
            num = sc.nextInt();

            int calculo = ((num*11) - 2)/3;
            if (calculo%2==0){
                acumulador+=num;
                qtdeNumAc ++;
            } else {
                acumulador+=num;
                qtdeNumDesc++;
            }
            if (acumulador%5==0){
                break;
            }
        }
        System.out.println("Quantidade de números acumulados: " + qtdeNumAc);
        System.out.println("Quantidade de números descartados: " + qtdeNumDesc);
        //System.out.println("Quantidade de números acumulados: " + qtdeNumAc);
        System.out.println("Total acumulado: " + acumulador);
    }
}
