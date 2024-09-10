package aula.andres.terceirodia;

public class terceirodia {
    
    public static void main(String[] args) {
        terceirodia_tv TV = new terceirodia_tv();

        System.out.println("TV ESTÁ LIGADA? " + TV.ligada);
        System.out.println("VOLUME DA TV: " + TV.volume);
        System.out.println("CANAL: " + TV.canal);
        System.out.println("-----------------------");

        TV.ligarTV();
        TV.mudarCanal(651);
        TV.abaixarCanal();
        TV.aumentarCanal();
        TV.aumentarCanal();
        TV.aumentarCanal();
        TV.aumentarCanal();
        TV.aumentarCanal();
        TV.aumentarCanal();
        TV.abaixarCanal();
        TV.aumentarVolume();       
        TV.aumentarVolume();       
        TV.aumentarVolume();       
        TV.aumentarVolume();       
        TV.aumentarVolume();       
        TV.aumentarVolume();       
        TV.aumentarVolume();       

        TV.abaixarVolume();

        System.out.println("TV ESTÁ LIGADA? " + TV.ligada);
        System.out.println("VOLUME DA TV: " + TV.volume);
        System.out.println("CANAL: " + TV.canal);



    }
}
