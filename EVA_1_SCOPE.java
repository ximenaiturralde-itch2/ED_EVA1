/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_scope;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class EVA_1_SCOPE {
    public static void main (String [] arg){
        int x = 100; //EXISTE DENTRO DEL BLOQUE DEL main()
        for (int i = 0; i < 10;i++){//EXISTE SOLO EN DENTRO DEL FOR
            System.out.println("i = " + i);
            x++; //VISIBLE DENTRO DEL FOR
            
    }
    System.out.println("Valor final de la i = " + i); //YA NO EXISTE
    System.out.println("Valor final de la x = " + x); //TODAVIA EXISTE

public static void OtraFuncion(){
    System.out.println("Valor de x" + x); //NO EXISTE
}
    
    /**
     * @param args the command line arguments
     */
    
}
