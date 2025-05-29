package ListaExercicios09;

import java.util.Scanner;
public class Questao04 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
//        4) Faça um programa em Java que solicite ao usuário a quantidade de alunos de uma turma, em
//        seguida, solicite as médias finais de cada um dos alunos e alimente um vetor com todas as notas.
//        Por fim, implemente um metodo que receba em parâmetro o vetor com as médias dos alunos,
//        calcule e devolva a média da turma.
        double[] notasAlunos = alimentandoVetor(capturarTamanhoVetor());
        mediaTurma(notasAlunos);
    }
    public static int capturarTamanhoVetor() {
        System.out.println("Por favor, informe quantos alunos tem na turma: ");
        return sc.nextInt();
    }
    public static double[] alimentandoVetor(int tamanho){
        double mediaFinal[] = new double[tamanho];
        for (int i = 0; i<mediaFinal.length;i++){
            System.out.println("Por favor, informe a Média Final do Aluno " + (i+1));
            mediaFinal[i]= sc.nextDouble();
        }
        return mediaFinal;
    }
    public static void mediaTurma(double[] vetor){
        double soma = 0;
        for (int x = 0; x<vetor.length;x++){
            soma += vetor[x];
        }
        double mediaDaTurma = soma/(vetor.length);
        System.out.printf("MÉDIA DA TURMA: %.2f", mediaDaTurma);
    }
}
