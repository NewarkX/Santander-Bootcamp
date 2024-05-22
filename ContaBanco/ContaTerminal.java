import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        //conhecer e importar a classe Scanner ok
        //exibir as mensagens para o nosso usuario ok
        //obter pela scanner os valores digitados no terminal ok

        //1021
        //"067-8"
        //"MARIO ANDRADE"
        //237.48

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor,digite o número de sua conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor,digite o número de sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor,digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Por favor,digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta no nosso banco, sua agencia é "
                + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para o saque");
    }
}