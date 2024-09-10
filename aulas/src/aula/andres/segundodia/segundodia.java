package aula.andres.segundodia;
public class segundodia {
    public static void main (String[] args){
        int n = 7;
        for (int i = 0; i<=10; i++)
        System.out.println(n + " x " + i +" = " +n*i);

        String resultado = (n*n) == 49 ? "O número é 7" : "O número não é 7";
        System.out.println(resultado);
    }
}
