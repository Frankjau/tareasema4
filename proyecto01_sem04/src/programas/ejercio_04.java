
package programas;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ejercio_04 {
    public static void main (String[]args){
        int numero ;
        String palabra ="";
        Scanner lectura =new Scanner(System.in);
       //entradas de datos 
       System.out.print("imngresar numero del 1 al 5:");
       numero=lectura.nextInt();
        //proceso de datos
        switch(numero){
            case 1:palabra="uno";
            break;
            case 2:palabra="dos";
            break ;
            case 3:palabra="tres";
            break;
            case 4:palabra="cuatro";
            break;
            case 5: palabra="cinco";
            break;
            
            
        }
        System.out.println("el nombre del numero es:"+palabra);
        
       
       
    }
    }

   
                    
