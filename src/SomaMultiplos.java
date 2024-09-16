import java.util.Scanner;

public class SomaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero qualquer pra calcular a soma dos multiplos de 3 e 5:");
        int x = scanner.nextInt();
        int resultado = calcularSomaMultiplos(x);

        System.out.printf("A soma dos múltiplos de 3 ou 5 até %d é %d%n", x, resultado);
    }

    public static int calcularSomaMultiplos(int x) {
        int soma = 0;

        for (int i = 1; i < x; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}