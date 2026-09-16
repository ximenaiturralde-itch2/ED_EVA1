/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_primos;

/**
 *
 * @author XIMENA ALEJANDRA ITURRALDE CONTRERAS
 */
public class EVA1_12_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 17; // Cambia este número para probar
        int esPrimo1 = 1; // 1 significa que sí es primo, 0 que no
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo1 = 0; 
                break;
            }
        }
        int esPrimo2 = 1; // 1 significa que sí es primo, 0 que no
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                esPrimo2 = 0; 
                break;
            }
        }
        
        System.out.println("Método ineficiente (Resultado 1=Primo, 0=No): " + esPrimo1);
        System.out.println("Método eficiente (Resultado 1=Primo, 0=No): " + esPrimo2);
    }
}

    