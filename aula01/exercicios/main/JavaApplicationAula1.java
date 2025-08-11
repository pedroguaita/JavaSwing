/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationaula1;

/**
 *
 * @author 2830482411036
 */
public class JavaApplicationAula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vai Corinthians");
        
        Carro c1 = new Carro();
        c1.anoFabricacao = 2022;
        c1.modelo = "Fox Xtreme";
        
        System.out.println(c1.modelo);
        System.out.println(c1.anoFabricacao);
        
        c1.ligar();
        if(c1.getEstado()){
            System.out.println("Ligado");
        }
        else{
            System.out.println("Desligado");
        }
        
        c1.desligar();
        if(c1.getEstado()){
            System.out.println("Ligado");
        }
        else{
            System.out.println("Desligado");
        }
    }
    
}
