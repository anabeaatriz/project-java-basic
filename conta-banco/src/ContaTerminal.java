import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem-vindo! Para começar, informe seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual o seu saldo?");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " ja esta disponivel para saque.");
        

        //System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta ", numeroConta + " e seu saldo " + saldoConta + " ja esta disponivel para saque.");

    }
    
}
