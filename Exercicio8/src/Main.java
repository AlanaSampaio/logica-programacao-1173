import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int num;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero para a linha %d e coluna %d \n", (i+1), (j+1));
                num = sc.nextInt();
                matriz[i][j] = num;
            }
        }

        printMatriz(matriz);

        int soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.printf("Os valores da diagonal principal são %d, %d, %d e a soma é: %d", matriz[0][0], matriz[1][1], matriz[2][2], soma);
    }

    private static void printMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
