package ListaExercicios07;

public class Questao09 {
    public static void main(String args[]) {
        int anos = 0;
        double alturaC = 1.50, alturaJ = 1.10;

        while (alturaJ < alturaC) {
            anos++;
            alturaC += 0.02;
            alturaJ += 0.03;
        }
        System.out.printf("Serão necessarios %d anos para que a altura de Juca(%.2f) ultrapasse a alrura de Chico(%.2f)", anos, alturaJ, alturaC);
    }
}


