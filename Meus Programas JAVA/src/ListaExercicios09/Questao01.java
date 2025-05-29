package ListaExercicios09;

public class Questao01 {
    public static void main(String args[]) {
        //1) Implemente um metodo que recebe por parâmetro um vetor de números inteiros e informe  a posição do maior número.
        int vetor[] = {1,2,5,3,10,9,7};
        acharPocisao(vetor);
    }
    public static void acharPocisao(int vetor[]) {
        int maior = vetor[0];
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.println("A posição do maior número é: " + posicao);
    }
}
