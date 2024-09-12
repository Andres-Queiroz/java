package aula.andres.quintodia.projeto;
import java.util.*;

public class ContaBanco {

    public static void main(String[] args) {
        Conta();
    }
    public static void Conta (){
       
        String  agencia,nome;
        float saldo;
        int numero;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem vindo ao BANCO ITAÚ, qual é o seu nome e sobrenome?");
        nome = input.next();
        System.out.println("Agora, digite o número da Agência!");
        agencia = input.next();
        System.out.println("Insira, o número da sua conta.");
        numero = input.nextInt();
        System.out.println("Agora, confirme qual o seu saldo.");
        saldo = input.nextFloat();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta número "+numero+ " e seu saldo de "+saldo+" já está disponível para saque");

    } 



}
