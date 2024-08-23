/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareaprom2;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class Tareaprom2 {

    public static void main(String[] args) {
        
         Scanner entrada = new Scanner (System.in);
         
         
         
         System.out.println("digite su nombre:");
         String nombre = entrada.next();
        
         System.out.println("digite su sexo masculino(1) o femenino(2):");
         int sexo = entrada.nextInt();
         
         System.out.println("digite su apellido:");
         String apellido = entrada.next();
         
         System.out.println("digite su edad:");
         int edad = entrada.nextInt();
         
         
         
         if (edad >= 18){
             System.out.println("usted es mayor de edad");}
             
         else {    
              System.out.println("usted es menor de edad");
         }
         
         if ( sexo == 1 ) {
              System.out.println("usted es hombre"); }
         
         if ( sexo == 2) {
             
             System.out.println("usted es mujer");
         }
            
              
        
    }
}
