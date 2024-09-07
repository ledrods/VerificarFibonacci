import java.util.Scanner;

public class Main {

    // Método para verificar se um número é quadrado perfeito
    public static boolean eQuadradoPerfeito(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static boolean isFibonacci(int num) {
        // Verifica se 5*num^2 + 4 ou 5*num^2 - 4 é um quadrado perfeito
        return eQuadradoPerfeito(5 * num * num + 4) || eQuadradoPerfeito(5 * num * num - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número a ser verificado
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
