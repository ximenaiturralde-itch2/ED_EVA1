/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arregloa_size;

/**
 *
 * @author ca-co
 */
public class EVA1_7_ARREGLOA_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] original = new int[10];
        System.out.println(original);{
        for (int i = 0; i<original.length;i++){//LLENAR CON DATOS ALEATORIOS
           original[i]= (int)(Math.random()*100);
           
       }
       for (int i = 0; i<original.length;i++){//IMPRIMIR
           System.out.print("{"+ original[i]+ "}");
       }
        System.out.println("");
        //CAMBIAR EL TAMAÑO(NO SE PUEDE)
        //RESPALDO
        
        int[]copia = original;
        original = new int[5];
        original = new int [5];//AQUI SE CAMBIAN LOS DATOS
        System.out.println(original);
        for (int i = 0; i<original.length;i++){
            original[i]= copia[i];
        }
        
        
        for (int i = 0; i<original.length;i++){
           System.out.print("{"+ original[i]+ "}");
    }
 }
    
}
