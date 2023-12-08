import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String nome;
        int numero;
        String agencia;
        double saldo;

        System.out.println("Olá! Me informe seu nome: ");
        nome = sc.next();

        System.out.println("Me informe o numero de sua conta: ");
        numero = sc.nextInt();

        System.out.println("Me informe sua agência (formato: xxx-x): ");
        agencia = sc.next();

        System.out.println("Me informe o seu saldo (formato: xxx,xx)");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia + ", " +
                "conta "+ numero +" e seu " +
                "saldo "+ saldo +" " +
                "já está disponível para saque");

    }
}
