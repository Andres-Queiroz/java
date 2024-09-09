package aula.andres.terceirodia;

public class terceirodia_tv {
     /*TELEVISÃO */
     boolean ligada = false;
     int canal = 1;
     int volume = 0;
 
     public void mudarCanal (int novoCanal){
         canal = novoCanal;
     }
     public void ligarTV (){
        ligada = true;
     }

     public void aumentarVolume (){
         volume++;
     }
 
     public void abaixarVolume(){
         volume--;
     }
 
     public void aumentarCanal(){
         canal++;
     }   
 
     public void abaixarCanal(){
         canal--;
     }
}
