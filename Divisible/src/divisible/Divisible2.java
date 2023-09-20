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
public class Divisible2 {
    
    public void divisible2(){
        int n ,d;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el primer valor enteros");    
        n = entrada.nextInt();
        System.out.println("Introduzca el segundo valor enteros");
        d = entrada.nextInt();
        if (n%d == 0 ){
            System.out.println(n + " es divisible por: " + d);
        }else{
            System.out.println(n + " no es divisible por: " + d);
        }
    }
    public static void main(String[] args){
        Divisible2 divisible2 = new Divisible2();
        divisible2.divisible2();
    }
}
