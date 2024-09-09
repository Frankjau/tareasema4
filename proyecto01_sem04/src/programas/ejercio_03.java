
package programas;

/**
 *3.- Crear un programa que permita ingresar un número (1-6) entero. Visualizar el número en inglés.
Número=1
Ingles=”one”

 * @author USER
 */
import java.util.Scanner;
public class ejercio_03 {
    public static void main (String[]args){
         int numero ;
        String ingles="";
        Scanner lectura =new Scanner(System.in);
       //entradas de datos 
       System.out.print("imngresar numero del 1 al 6:");
       numero=lectura.nextInt();
        //proceso de datos
         switch(numero){
              case 1:ingles="one";
            break;
            case 2:ingles="two";
            break ;
            case 3:ingles="tri";
            break;
            case 4:ingles="four";
            break;
            case 5:ingles="five";
            break;
            case 6:ingles="six";
            break;
            
         }
         System.out.println("el numero en ingles es:"+ingles);
        
    }
    
}
