import java.util.Scanner;

public class Fatorial{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número para calcular o fatorial: ");
            int num = scanner.nextInt();

            long fatorial = calcularFatorial(num);

            System.out.printf("O fatorial de %d é %d%n", num, fatorial);
        }

        public static long calcularFatorial(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
