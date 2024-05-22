package Dio.Desafios;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Insira o número da Agência:");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        System.out.println("Insira seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira seu saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
        + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " 
        + saldo + " já está disponível para saque.");
    }

    
}
