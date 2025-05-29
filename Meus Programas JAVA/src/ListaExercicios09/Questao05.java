package ListaExercicios09;

import java.util.Scanner;

public class Questao05 {
//    5) Complemente o programa desenvolvido na questão anterior, criando um metodo que receba
//    o vetor e o valor da média a turma, calcule e retorne a quantidade de alunos que ficaram acima
//    da média. Apresente em tela o total de alunos e a quantidade de alunos que ficaram acima da
//    média.
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {


        double[] notasAlunos = alimentandoVetor(capturarTamanhoVetor());
        double mediaTurma = calcularMediaTurma(notasAlunos);
        int alunosAcimaMedia = verificarAlunosAprovados(notasAlunos, mediaTurma);
        System.out.printf("QTDE DE ALUNOS: %d%n", notasAlunos.length);
        System.out.printf("ALUNOS ACIMA DA MÉDIA: %d%n",alunosAcimaMedia);

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
    public static double calcularMediaTurma(double[] vetor){ // fiz com que ele retornasse a media da turma
        double soma = 0;
        for (int x = 0; x<vetor.length;x++){
            soma += vetor[x];
        }
        double mediaDaTurma = soma/(vetor.length);
        System.out.printf("MÉDIA DA TURMA: %.2f%n", mediaDaTurma);
        return mediaDaTurma;
    }
    public static int verificarAlunosAprovados(double[] vetor, double media){
        int alunosAprovados = 0;
        for (int j = 0; j < vetor.length; j++){
            if (vetor[j] > media){
                alunosAprovados++;
            }
        }
        return alunosAprovados;
    }
}
