import java.util.Scanner;

public class index {

    public static void main(String[] args){

        calculadora();

    }
    public static void calculadora() {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA");

        System.out.println("Selecione a Operação");

        int operacao;
        do {
            System.out.println("1 = Soma = +\n2 = Subtração = -\n3 = Multiplicação = *\n4 = Divisão = /");
            operacao = sc.nextInt();
        } while (operacao < 1 || operacao > 4);

        System.out.println("Primeiro numero");

        double n1 = sc.nextDouble();

        System.out.println("Segundo numero");

        double n2 = sc.nextDouble();

        if (operacao == 1) {

            double resultado = n1 + n2;

            // %.2f significa: número de ponto flutuante com 2 casas decimais
            // O %f indica que vai entrar um número decimal.
            //O %n no final serve para quebrar a linha (equivalente ao println).

            System.out.printf("Resultado: %.2f + %.2f = %.2f%n", n1, n2, resultado);

        } else if (operacao == 2) {

            double resultado = n1 - n2;

            System.out.printf("Resultado: %.2f - %.2f = %.2f%n", n1, n2, resultado);

        } else if (operacao == 3) {

            double resultado = n1 * n2;

            System.out.printf("Resultado: %.2f * %.2f = %.2f%n", n1, n2, resultado);

        } else if (operacao == 4) {

            if (n2 == 0) {

                System.out.println("Erro: Não é possível dividir por zero!");

            } else {

                double resultado = n1 / n2;

                System.out.printf("Resultado: %.2f / %.2f = %.2f%n", n1, n2, resultado);

            }

        } else {

            System.out.println("Operação Inválida, Tente novamente");

        }

    }
}





