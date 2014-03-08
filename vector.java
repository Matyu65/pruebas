package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author 3
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ////creo e instacio el vector de 5 posiciones
        int numeros[]= new int[5];
        ////ciclo para recolectar los datos
        for (int i = 0; i < 5; i++) 
        {
            ///variable que recive el dato ingresado
            int num;
            ////obtecion de datos
            num=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
            ///ciclo para obtener datos
            if(num > 8)
            {
                ///agregacion de valores al vector
                numeros[i]=num;
                ///mensaje de confirmacion, cuando el dato se ha insertado en el vector
                JOptionPane.showMessageDialog(null,"el numero fue ingresado");
            }
            ////excepcion cuando el numero es muy bajo 
            else
            {
                JOptionPane.showMessageDialog(null,"el numero es menor");
            }
        }
        ///ciclo para mostrar el resultado
        for (int j = 1; j <=5; j++) 
        {
            JOptionPane.showMessageDialog(null,"los numeros del vector son: "+ numeros[j]);
        }
        
       
       
    }
    
}
