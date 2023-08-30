import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o numero da sua Agência! ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor digite sua Agência ");
        String agencia = scanner.next();

        System.out.println("Digite  o nome do cliente ");
        String nome = scanner.next();

        System.out.println("Digite  o saldo do cliente ");
        double saldo = scanner.nextDouble();

        String mensagemCliente = "Ola " +nome+ "obrigado por criar uma conta em nosso banco sua agência é " +agencia+", conta "+numeroAgencia+" e seu saldo "+saldo+" ja está disponivel para saque." ;

        System.out.println(mensagemCliente);

        }
    }
