import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//tratamento de excessoes
public class ExemploTryCatch {
    public static void main(String[] args) throws Exception {
        try{
            //trabalhando com a classe scaner
            //criar o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("digite sua altura:");
            double altura = scanner.nextDouble();
            scanner.nextLine();//isso cata o <ENTER> digitado na hora da altura
            System.out.println("Digite seu nome completo");
            String nome = scanner.nextLine();// scanner.next() le a string ate o primeiro espaco

            // System.out.println("Digite seu sobrenome");
            // String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Seu nome: " + nome);
            System.out.println("Sua altura: " + altura);
            System.out.println("Sua idade: " + idade);
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
