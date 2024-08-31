import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        scanner.close();

        int contagem = contarLetraA(input);

        if (contagem > 0) {
            System.out.println("A letra 'a' (ou 'A') aparece " + contagem + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não aparece na string.");
        }
    }

    public static int contarLetraA(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (char a : str.toCharArray()) {
            if (a == 'a') {
                count++;
            }
        }
        return count;
    }
}
