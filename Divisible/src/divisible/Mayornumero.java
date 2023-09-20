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
public class Mayornumero {
    
    public void Mayor(){
        int n1,n2;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa el primer valor: ");
        n1= entrada.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        n2= entrada.nextInt();
        
        if (n1>n2){
            System.out.println("El mayor numero es " + n1);
        }else {
            System.out.println("El mayor numero es " + n2);
        }
    }
    public static void main(String[] args){
        Mayornumero mayor = new Mayornumero();
        mayor.Mayor();
    }
}
