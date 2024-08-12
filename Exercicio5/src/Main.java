import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a unidade de temperatura atual (CELSIUS, FAHRENHEIT, KELVIN): ");
        UnidadeTemperatura unidadeAtual = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());

        System.out.println("Digite a unidade de temperatura desejada (CELSIUS, FAHRENHEIT, KELVIN): ");
        UnidadeTemperatura unidadeDesejada = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());

        System.out.println("Digite a temperatura atual: ");
        double temperaturaAtual = scanner.nextDouble();

        double temperaturaConvertida = unidadeAtual.converterPara(temperaturaAtual, unidadeDesejada);

        System.out.printf("A temperatura convertida é: %.2f %s%n", temperaturaConvertida, unidadeDesejada);

        scanner.close();
    }
}