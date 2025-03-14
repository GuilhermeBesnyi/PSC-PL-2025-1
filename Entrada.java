import java.util.Scanner;

public class Entrada {
public static void main(String[] args) {
java.util.Scanner scanner = new Scanner(System.in);

System.out.println("digite o seu nome");
String nome = scanner.nextLine();

System.err.println("Digite a sua idade");
int idade = scanner .nextInt();

System.err.println("Ola " + nome + " voce tem " + idade + " anos, seja bem vindo");

}
}
