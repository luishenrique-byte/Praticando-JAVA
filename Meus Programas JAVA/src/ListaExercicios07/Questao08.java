package ListaExercicios07;

public class Questao08 {
    public static void main(String args[]) {
        int anos=0;
        int popA=5000, popB=7000;

        while(popA<popB){
            anos++;
            popA += popA*0.03;
            popB += popB*0.02;
        }
        System.out.printf("Serão necessarios %d anos para que a população do país A(%d) ultrapasse a população do país B(%d)", anos,popA,popB);
    }
}
