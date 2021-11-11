import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizD = new int[3][3];
        Random gerador = new Random();
        int[][] resultado = new int[3][3];
        double[][] resultadoD = new double[3][3];

        System.out.println();
        System.out.println("Digite os valores presentes na matriz primaria: ");
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD.length; j++) {
                int y = scanner.nextInt();
                matrizD[i][j] = y;

            }

        }
        // imprimir a matriz
        System.out.println();
        System.out.println("Valores presentes na matriz 3x3: ");
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD.length; j++) {
                System.out.print(matrizD[i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }

        System.out.println(); // quebra de linha

        // valores que a matriz recebera, usando gerador de numeros para preencher
        System.out.println("Valores presentes na matriz 3x3 (gerados automaticamente): ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int x = gerador.nextInt(9) + 1;
                matriz[i][j] = x;

            }

        }
        // imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(); // quebra de linha
        }
        System.out.println();
        System.out.println();
        // Soma de matrizes

        System.out.println("A soma das matrizes é de:");
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD.length; j++) {
                resultado[i][j] = matrizD[i][j] + matriz[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }

        System.out.println();
        System.out.println();
        // Subtração de matrizes

        System.out.println("A subtração das matrizes é de:");
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD.length; j++) {
                resultado[i][j] = matrizD[i][j] - matriz[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }

        System.out.println();
        System.out.println();
        // Multiplicacão de matrizes

        System.out.println("A multiplicação das matrizes é de:");
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD.length; j++) {
                resultado[i][j] = matrizD[i][j] * matriz[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }
        System.out.println();
        System.out.println();

        // Divisão de matrizes
        System.out.println("A divisão das matrizes é de:");
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD.length; j++) {
                resultadoD[i][j] = (double) matrizD[i][j] / matriz[i][j];
                System.out.printf("%.2f ", resultadoD[i][j]);
            }
            System.out.println(); // quebra de linha
        }

    }

}