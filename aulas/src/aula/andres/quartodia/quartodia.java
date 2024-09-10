package aula.andres.quartodia;

public class quartodia {
    
    public static void main(String[] args) {
        String nome, nome2;
        nome = "ANDRES";
        nome2 = new String ("ANDRES");
        imprimir(nome,nome2);

    }
    public static boolean validar(String nome, String nome2){
        if (nome.equals(nome2)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void imprimir(String nome, String nome2){
        boolean result = validar(nome,nome2);
        if(result){
        System.out.println("IGUAL");
       }
       else{
        System.out.println("DIFERENTE");
       }

    }
}