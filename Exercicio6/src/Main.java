import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorJuros, saldo;

        System.out.println("Informe o valor investido em R$ ");
        double valor = sc.nextDouble();
        System.out.println("Informe o juros ao mês em % ");
        int juros = sc.nextInt();
        System.out.println("Informe o tempo que o dinheiro ficará investido. ");
        int tempo = sc.nextInt();

        for (int i = 1; i <= tempo; i++) {
            valorJuros = juros(valor, juros);
            valor = saldo(valor, valorJuros);
            System.out.printf("Mês %s: Juros: R$%.2f , Saldo: R$%.2f", i, valorJuros, valor);
            System.out.println();
        }
        
        sc.close();
    }
    
    static double juros(double valor, int juros) {

        return (valor*juros)/100;
    }

    static double saldo(double valor, double juros) {
        return valor+juros;
    }
}