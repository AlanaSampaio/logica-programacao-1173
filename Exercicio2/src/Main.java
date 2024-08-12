import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas provas você fez?");
        int provas = sc.nextInt();

        int maior = 0, menor = 100, soma = 0, media, nota;
        for (int i = 0; i < provas; i++) {
            System.out.printf("Qual a nota da sua %s prova (nota de 0 a 100): ", i+1);
            nota = sc.nextInt();

            soma += nota;
            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }

        media = soma/provas;

        System.out.printf("A maior nota: %s \nA menor nota: %s \nA média de notas: %s", maior, menor, media);

        sc.close();
    }
}