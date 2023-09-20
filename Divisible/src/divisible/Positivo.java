/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible;

import java.util.Scanner;

/**
 *
 * @author S.YAEL
 */
public class Positivo {
    
    public void positivo(){
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero real ");
        numero= entrada.nextFloat();
        
        if (numero>0){
            System.out.println(numero + " es mayor que cero");
        }
    }
    public static void main(String[] args){
        Positivo posit = new Positivo();
        posit.positivo();
    }
}
