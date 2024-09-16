public class Eleicao {

    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao(1000, 800, 150, 50);

        System.out.printf("Votos válidos: %.2f%%\n", eleicao.calcularVotosValidos());
        System.out.printf("Votos brancos: %.2f%%\n", eleicao.calcularVotosBrancos());
        System.out.printf("Votos nulos: %.2f%%\n", eleicao.calcularVotosNulos());
    }

    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    public double calcularVotosValidos() {
        return (votosValidos / (double) totalEleitores) * 100;
    }

    public double calcularVotosBrancos() {
        return (votosBrancos / (double) totalEleitores) * 100;
    }

    public double calcularVotosNulos() {
        return (votosNulos / (double) totalEleitores) * 100;
    }
}