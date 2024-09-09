
package programas;

/**
 *4.- Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. Visualizar el nombre del periodo anual, por ejemplo:
 * @author USER
 */
import java.util.Scanner;
public class ejercio_01 {
     public static void main (String[]args){
         int numero ;
        String periodo ="";
        Scanner lectura =new Scanner(System.in);
       //entradas de datos 
       System.out.print("imngresar numero del 1,2,3,4,6,12:");
       numero=lectura.nextInt();
       //proceso de datos 
        switch(numero){
             case 1:periodo="mensual";
            break;
            case 2:periodo="bimestral";
            break ;
            case 3:periodo="trimestral";
            break;
            case 4:periodo="cuatrimestral";
            break;
            case 6:periodo="semestral";
            break;
            case 12:periodo="anual";
            break;
            default:periodo="fuera de periodo";
            
      
     }
        System.out.println("el periodo es:"+periodo);
      
          
      }
    
}
