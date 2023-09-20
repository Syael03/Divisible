package divisible;

import java.util.Scanner;

/**
 *
 * @author S.YAEL
 */
public class Divisible {
    
    public void EjemploIF(){
        int n ,d;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca dos enteros");    
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n%d == 0 ){
            System.out.println(n + " es divisible por: " + d);
        }
    }
    
    public static void main(String[] args) {
        Divisible divisible = new Divisible();
        divisible.EjemploIF();
        
    }
    
}
