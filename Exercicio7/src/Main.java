import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de linhas e colunas respectivamente: ");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        int num;
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.printf("Digite o numero para a linha %d e coluna %d \n", (i+1), (j+1));
                num = sc.nextInt();
                matriz[i][j] = num;
            }
        }
        int maior = matriz[0][0];
        for(int m = 0; m < linha; m++) {
            for (int n = 0; n < coluna; n++) {
                if(matriz[m][n] > maior) {
                    maior = matriz[m][n];
                }
            }
        }

        System.out.println("Número maior é: "+ maior);

    }
}