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
        StringBuilder sequenciaFibonacci = new StringBuilder(); // Criando um objeto StringBuilder para construir a sequência de Fibonacci
        int primeiro = 0, segundo = 1; // Inicializando as variáveis 'primeiro' e 'segundo' com os primeiros valores da sequência de Fibonacci

        if (entradaUsuario >= 0) { // Verificando se o valor de 'entradaUsuario' é maior ou igual a 0
            sequenciaFibonacci.append(primeiro); // Se for, adicionaremos o primeiro número da sequência (0) ao StringBuilder
        }

        while (segundo <= entradaUsuario) { // Loop que continua enquanto 'segundo' for menor ou igual ao 'entradaUsuario'
            sequenciaFibonacci.append(", ").append(segundo); // Adicionando o valor de 'segundo' ao StringBuilder, junto com uma vírgula e um espaço para separar
            int proximo = primeiro + segundo; // Calculando o próximo número da sequência de Fibonacci como a soma de 'primeiro' e 'segundo'
            primeiro = segundo; // Atualizando 'primeiro' com o valor de 'segundo'
            segundo = proximo; // Atualizando 'segundo' com o valor de 'proximo'
        }

        return sequenciaFibonacci.toString(); // Converte o StringBuilder para uma string e retorna a sequência de Fibonacci gerada
    }
}