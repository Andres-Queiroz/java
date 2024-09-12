package aula.andres.quintodia;

import java.util.*;

public class quintodiascanner {
    public static void main (){
        Scanner myscanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Olá, bem vindo ao estádio do morumbi, é sua primeira vez aqui?");
        String resposta1 = myscanner.next();
        resposta1 = resposta1.toUpperCase();
        if(resposta1.equals("SIM")){
            System.out.println("Como é sua primeira vez, o que achou da experiência até agora? Dê uma nota de 0 a 10.");
            int experiencia = myscanner.nextInt();
            if (experiencia > 7){
                System.out.println("Que bom que esta gostando, vamos fazer o possível para melhorar cada vez mais");
            } else{
                System.out.println("Hmm, que pena. Vamoos fazer o possível para melhorar e buscar o seu 10!");
            }
        }else{
            System.out.println("Que bom que está de volta ao Morumbi, obrigado por retornar. Vamos torcer juntos!");
        }

        System.out.println("Digite seu nome: ");
        String nome = myscanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = myscanner.next();
        System.out.println("Digite sua idade");
        int idade = myscanner.nextInt();
        System.out.println("Agora palpite, qual será o placar do jogo? (Casa x Visitante)");
        String placar = myscanner.next();
        System.out.println("Obrigado pelo palpite, " + nome + " " + sobrenome);
        System.out.println("Tenha um bom jogo e até a próxima.");
        System.out.println("Vaaai São Paulo");
    }
}
