package ListaExerciciosSala;

import java.util.Scanner;

//    Implemente um programa em Java que pergunte ao usuário os gastos mensais de uma
//    empresa por setor durante um período de 12 meses (1 ano).
//    Os dados devem ser armazenados em uma matriz de dimensões 5x12,
//    onde cada linha representa um setor da empresa e cada coluna representa um mês do ano.
//
//    O programa deve calcular e exibir:
//    A soma total dos gastos de todos os setores ao longo do ano.
//    O gasto total de cada setor ao longo do ano.
//    O gasto total de cada mês, considerando todos os setores.
//
//            Ex: Com 2 setores e 3 meses:
//    {
//        {1500.0, 2300.5, 3200.75}, // Setor 1
//        {2800.2, 4100.0, 3900.0}   // Setor 2
//    }
//
//
//    Resultado esperado:
//    Soma total dos gastos: 17801.45
//    Gasto total do Setor 1: 7001.25
//    Gasto total do Setor 2: 10800.20
//    Gasto total do Mês 1: 4300.20
//    Gasto total do Mês 2: 6400.50
//    Gasto total do Mês 3: 7100.75
//
//
//    Dica:
//
//    Faça com 2 setores e 3 meses apenas para validar o raciocínio e
//    depois você aumenta pra 12 de forma a não precisar digitar os todos valores a cada teste!
public class ExercicioMatriz {

    static Scanner sc = new Scanner(System.in);
    static double gastosMensais[][] = new double[5][12];

    public static void main(String args[]) {
        gastosMensais = alimentarMatriz();
        double somaTotal = somaGastosTotais(gastosMensais);
        System.out.printf("Soma total dos Gastos: %.2f%n", somaTotal);
        somaTotalPorSetor(gastosMensais);
        somaTotalPorMes(gastosMensais);
    }

    private static double[][] alimentarMatriz() {
        double[][] matriz = new double[2][3];

        for (int setor = 0; setor < matriz.length; setor++){
            System.out.printf("Setor %d%n", (setor+1));
            for (int mes = 0; mes < matriz[setor].length; mes++){
                System.out.printf("Por favor, infomar gasto do Mês %d%n", mes+1);
                double valor = sc.nextDouble();
                matriz[setor][mes] = valor;
                System.out.printf("Mês %d - R$ %.2f%n", mes+1, matriz[setor][mes]);
            }
        }
        return matriz;
    }

    public static double somaGastosTotais(double[][] matriz){
        double soma=0;

        for (int setor = 0; setor < matriz.length; setor++){
            for (int mes = 0; mes < matriz[setor].length; mes++){
                soma += matriz[setor][mes];
            }
        }
        return soma;
    }

    public static void somaTotalPorSetor(double[][] matriz){
        double somaSetor=0;
        for (int setor = 0; setor< matriz.length; setor++){
            for (int mes = 0; mes < matriz[setor].length; mes++){
                somaSetor += matriz[setor][mes];
            }
            System.out.printf("Gastos Totais Setor %d R$ %.2f%n", setor+1, somaSetor);
            somaSetor = 0;
        }
    }

    public static void somaTotalPorMes(double[][] matriz){
        double somaMes = 0;

        for (int mes = 0; mes < matriz[0].length; mes++) {
            for (int setor = 0; setor < matriz.length; setor++) {

                somaMes += matriz[setor][mes];

            }
            System.out.printf("Gastos Totais do Mês %d - R$ %.2f%n", mes+1, somaMes);
            somaMes = 0;
        }
    }
}
