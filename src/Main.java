import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entradaUsuario = scanner.nextInt();
        String sequenciaFibonacci = gerarSequenciaFibonacci(entradaUsuario);
        System.out.println(sequenciaFibonacci);

        scanner.close();
    }

    public static String gerarSequenciaFibonacci(int entradaUsuario) {
        StringBuilder sequenciaFibonacci = new StringBuilder();
        int primeiro = 0, segundo = 1;

        if (entradaUsuario >= 0) {
            sequenciaFibonacci.append(primeiro);
        }

        while (segundo <= entradaUsuario) {
            sequenciaFibonacci.append(", ").append(segundo);
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        return sequenciaFibonacci.toString();
    }
}