import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeros;
        int soma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero a ser somado: ");
        numeros = sc.nextInt();

        while (numeros != 0) {
            System.out.println("Digite um numero a ser somado: ");
            numeros = sc.nextInt();
            soma += numeros;
        }

        System.out.println("A soma total dos valores digitados é: " + soma);

        sc.close();

    }
}

