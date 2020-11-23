/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xd;

import java.io.*;
    public class Xd {
       public static void main (String arg[]) throws IOException{
         int a, b, c;
         BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
         String ingresado1;
         String ingresado2;
         String ingresado3;
         System.out.println("Introduce el numero A...." );
         ingresado1=lector.readLine();
         a=Integer.parseInt(ingresado1);
         System.out.println("Introduce el numero B...." );
         ingresado2=lector.readLine();
         b=Integer.parseInt(ingresado2);
         System.out.println("Introduce el numero C...." );
         ingresado3=lector.readLine();
         c=Integer.parseInt(ingresado3);
 
         if(a!=0&&b*b>4*a*c){
            System.out.println("La solucion positiva es: "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
            System.out.println("La solucion negativa es: "+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
         }
         }
 
      }
 
   