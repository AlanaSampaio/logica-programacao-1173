import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, peso, soma=0;
        System.out.println("Insira sua altura(m) e peso(kg) respectivamente: ");
        altura = sc.nextDouble();
        peso = sc.nextDouble();

        soma = peso/(altura*altura);

        if(soma < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (soma >= 17 && soma < 18.50) {
            System.out.println("Abaixo do peso");
        } else if (soma >= 18.50 && soma < 25) {
            System.out.println("Peso normal");
        } else if (soma >= 25 && soma < 30) {
            System.out.println("Acima do peso");
        } else if (soma >= 30 && soma < 35) {
            System.out.println("Obesidade I");
        } else if (soma >= 35 && soma < 40) {
            System.out.println("Obesidade II (severa)");
        } else if (soma >= 40) {
            System.out.println("Obesidade III (mórbida)");
        }

        sc.close();
    }
}