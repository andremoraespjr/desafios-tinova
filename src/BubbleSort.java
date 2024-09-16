public class BubbleSort {
    public static void main(String[] args) {

        int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
        bubbleSort(v);

        System.out.println("Vetor Ordenado:");
        exibirVetor(v);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean iteracaoFinal;

        for (int i = 0; i < n - 1; i++) {
            iteracaoFinal = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    iteracaoFinal = true;
                }
            }
            if (!iteracaoFinal) {
                break;
            }
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}