//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
//algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
//calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
//–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
//clientes;

//input: while cadastro,  valor_veiculo, tipo_combustivel
//processing: printDescontoEValor( if alcool 25%, if gasolina 21, disel 14)

package java_exercices;

import java.util.Scanner;

public class Ex27 {
    static void printDescontoEValor(float valor_veiculo, char tipo_combustivel) {
        float porcentagem_desconto = 0.0f;
        switch (tipo_combustivel) {
            case 'A':
                porcentagem_desconto = 0.25f;
                break;
            case 'G':
                porcentagem_desconto = 0.21f;
                break;
            case 'D':
                porcentagem_desconto = 0.14f;
                break;
        }
        float valor_desconto = valor_veiculo * porcentagem_desconto;
        System.out.println("Valor do desconto: " + valor_desconto);
        float valor_total = valor_veiculo - valor_desconto;
        System.out.println("Valor a ser pago pelo cliente: " + valor_total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja cadastrar um veiculo? (S/N)");
        char resposta = scanner.nextLine().charAt(0);

        while (resposta != 'N') {
            if (resposta == 'S') {
                System.out.println("Digite o valor do veiculo: ");
                float valor_veiculo = scanner.nextFloat();
                scanner.nextLine();  // Consume newline left-over
                System.out.println("Digite o tipo de combustivel ('A' para alcool, 'G' para gasolina, 'D' para diesel):");
                char tipo_combustivel = scanner.nextLine().charAt(0);

                while (tipo_combustivel != 'A' && tipo_combustivel != 'G' && tipo_combustivel != 'D') {
                    System.out.println("Tipo de combustivel nao identificado. Digite 'A' para alcool, 'G' para gasolina, 'D' para diesel.");
                    tipo_combustivel = scanner.nextLine().charAt(0);
                }

                printDescontoEValor(valor_veiculo, tipo_combustivel);
                System.out.println("Deseja cadastrar outro veiculo? (S/N)");
                resposta = scanner.nextLine().charAt(0);
            } else {
                System.out.println("Resposta nao identificada, digite S para sim e N para nao.");
                resposta = scanner.nextLine().charAt(0);
            }
        }
        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}

