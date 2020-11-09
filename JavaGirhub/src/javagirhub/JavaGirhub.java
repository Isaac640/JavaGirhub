/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagirhub;

import java.util.Scanner;

/**
 *
 * @author DAM107
 */
public class JavaGirhub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cocinar las alubias? 1 = si  2 = no");
        int res = teclado.nextInt();
        if (res==1){
            System.out.println("Las quemaste");
        }else if (res==2){
            System.out.println("Bien, ya estaban cocinadas");
        }
        
    }
    
}
