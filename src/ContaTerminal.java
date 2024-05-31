package src;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        try {
            System.out.println("Por favor, digite seu Nome!");
            nomeCliente = leitor.nextLine();
            System.out.println("Por favor, digite o número da Agência(EX: 123-45) !");
            agencia = leitor.nextLine();
            System.out.println("Por favor, digite o número da Conta(EX: 12345) !");
            numero = leitor.nextInt();
            System.out.println("Por favor, digite o Saldo da Conta !");
            saldo = leitor.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na entrada de dados. Por favor, tente novamente.");
        } finally {
            leitor.close();
        }

    }
}
