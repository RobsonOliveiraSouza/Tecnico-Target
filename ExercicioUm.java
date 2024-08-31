// 1) Sequencia de Fibonacci, se inicia 0 e 1, e o proximo valor é a soma.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ExercicioUm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        scanner.close();

        List<Integer> sequenciaFibonacci = calcularSequenciaFibonacciAte(numero);
        System.out.println("Sequência de Fibonacci até " + numero + ": " + sequenciaFibonacci);


        if(sequenciaFibonacci.contains(numero)){
            System.out.println("O número " + numero + " pertence à sequencia.");
            
            int proximoNumero = calcularProximoNumeroFibonacci(sequenciaFibonacci);
            System.out.println("O próximo número da sequência de Fibonacci é: " + proximoNumero);

        } else {
            System.out.println("O número " + numero + " não pertence à sequencia.");
        }
    }

    public static List<Integer> calcularSequenciaFibonacciAte(int numero) {
        List<Integer> sequencia = new ArrayList<>();
        int termo_a = 0;
        int termo_b = 1;

        sequencia.add(termo_a);
        if (numero >= 1) {
            sequencia.add(termo_b);
        }

        int fibonacci = termo_a + termo_b;

        while (fibonacci <= numero) {
            sequencia.add(fibonacci);
            termo_a = termo_b;
            termo_b = fibonacci;
            fibonacci = termo_a + termo_b;
        }

        return sequencia;
    }

    public static int calcularProximoNumeroFibonacci(List<Integer> sequenciaFibonacci) {
        int tamanho = sequenciaFibonacci.size();
        int penultimo = sequenciaFibonacci.get(tamanho - 2);
        int ultimo = sequenciaFibonacci.get(tamanho - 1);

        return penultimo + ultimo;
    }
}