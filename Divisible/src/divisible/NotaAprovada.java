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
public class NotaAprovada {
    
    public void aprovada(){
       int nota;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca nota a analizar");
        nota=entrada.nextInt();
        if (nota>5){
            System.out.println("Prueba superada");
        }         
     }
    
    public static void main (String[] arg){
        NotaAprovada aprovada = new NotaAprovada();
        aprovada.aprovada();
        
    }
}
