import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        Float saldoConta;

        Scanner nextInput = new Scanner(System.in);

        System.out.println("Seja bem vindo! Começaremos com o processo de abertura de conta!");
        System.out.println("Por favor, insira o numero da Conta: ");
        numeroConta = nextInput.nextInt();
        nextInput.nextLine();
        System.out.println("Por favor, insira o numero da Agencia: ");
        numeroAgencia = nextInput.nextLine();
        System.out.println("Por favor, insira o seu nome: ");
        nomeCliente = nextInput.nextLine();
        System.out.println("Por favor, insira o saldo da conta: ");
        saldoConta = nextInput.nextFloat();

        System.out.println("Olá " + nomeCliente +
                " , obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                " , conta " + numeroConta +
                " e seu saldo " + String.format("%.2f", saldoConta)  +
                " já está disponível para saque");

        nextInput.close();

    }
}
