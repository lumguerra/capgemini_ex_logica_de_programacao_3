package exercicios_logicos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {

            System.out.println("Deseja cadastrar um veiculo? (S ou N)");
            String resposta = scanner.next();

            if (resposta.equals("N") || resposta.equals("n")) {
                continuar = false;

            } else if (resposta.equals("S") || resposta.equals("s")) {
                Veiculo veiculo = new Veiculo();
                System.out.println("Digite o valor do veiculo: ");
                float valor_veiculo = scanner.nextFloat();
                veiculo.set_valor_veiculo(valor_veiculo);
                System.out.println("Digite o ano do veiculo: ");
                int ano_veiculo = scanner.nextInt();
                veiculo.set_ano_veiculo(ano_veiculo);
                veiculo.calcular_desconto();
            } else {
                System.out.println("Resposta inválida");
            }
        }

        System.out.print("Sistema finalizado.");

    }

}
