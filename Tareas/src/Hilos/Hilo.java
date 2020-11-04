package Hilos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Hilos {
    public static void main(String[] args) {
        System.out.println("Inicio de main");

        Hilo miHilo1 = Hilo.CrearHilo("Hilo 1");
        Hilo miHilo2 = Hilo.CrearHilo("Hilo 2");
        Hilo miHilo3 = Hilo.CrearHilo("Hilo 3");

        for (int i = 0; i < 25; i++) 
        {
            System.out.print(".");
                try {
					Thread.sleep(80); // //
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//
        }
        System.out.println("Fin de main");
    }
}

public class Hilo implements Runnable 
{
	Thread hilo;

	Hilo(String unHilo){
         hilo= new Thread(this,unHilo);
     }
     public static Hilo CrearHilo (String otroHilo){
    	 Hilo miHilo=new Hilo(otroHilo);
         miHilo.hilo.start(); 
         return miHilo;
     }
     public void run(){
         System.out.println(hilo.getName()+" Inicio.");
         try {
             for (int i=0; i<5;i++)
             {
                 Thread.sleep(400);
                 System.out.println(hilo.getName()+ ", Itero "+i+" cantidad de veces");
             }
         }catch (InterruptedException exc){
             System.out.println(hilo.getName()+ " Interrupcion");
         }
         System.out.println(hilo.getName()+" a finalizado.");
     }
	
}
