
package ClaseMath;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MathClase {
    public static void main (String [] args){
        
        JOptionPane.showMessageDialog(null, "Te doy la raiz cuadrada del numero que ingreses");
        Scanner leer = new Scanner (System.in);
        double numero, raiz;
        
        System.out.print("Ingresa un numero pa sacarle la raiz: ");
        numero = leer.nextDouble();
        
        raiz = Math.sqrt(numero);
        
        System.out.println("la raiz de " +numero+ " es: "+raiz);
        
    }
}
