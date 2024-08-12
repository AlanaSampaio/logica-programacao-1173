import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;
        System.out.println("Digite um valor inteiro positivo: ");
        valor = sc.nextInt();

        int resultado = soma(valor);

        System.out.println("A soma dos números é: "+ resultado);
        sc.close();
    }

    static int soma(int valor) {
        int soma = 0;
        for(int i = valor; i >= 1; i--) {
            soma+=i;
        }
        return soma;
    }
}