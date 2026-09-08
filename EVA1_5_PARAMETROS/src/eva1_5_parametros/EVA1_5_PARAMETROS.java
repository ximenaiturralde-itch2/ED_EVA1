/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_parametros;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class EVA1_5_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        System.out.println("Valor de i = " + 1);
        incrementar(i);
        System.out.println("Valor de i(despues de incrementar) = " + 1);
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y = " + prueba.y);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (despues de incrementar) = " + prueba.y);
    }
    public static void incrementar (int valor){ //PASO POR VALOR (RECIBO UNA COPIA)
        valor ++;
        
    }
    public static void incrementarObj (Prueba objeto){
        objeto.y++;
    }
}
 class Prueba {
     int y = 5;
     
 }