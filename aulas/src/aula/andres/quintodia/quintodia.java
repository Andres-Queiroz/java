package aula.andres.quintodia;

public class quintodia {
    public static void main (String [] args){
        String nome = args [0];
        String sobrenome = args[1];
        String idade = args [2];
        String altura = args[3];

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

     /* CHAMADA -> java quintodia nome sobrenome idade altura. 
                   Ou mudando no "launch.json inserido a chave 'args" e seus valores.
     
        RETORNO
        Meu nome é Andres Queiroz
        Tenho 22 anos        
        Minha altura é 1.83cm
     */
    }
}
