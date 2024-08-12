import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Crie um programa que solicite ao usuário para digitar uma frase ou número, realize a leitura e utilize um bloco try-catch
        * para verificar se a string representa um número inteiro válido.
        * */
        Scanner sc = new Scanner(System.in);
        String fraseOuNumero = "";

        try {

            System.out.println("Digite uma frase ou número ");
            fraseOuNumero = sc.nextLine();

            int numero = Integer.parseInt(fraseOuNumero);
            System.out.println("Número inteiro válido: "+numero);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}