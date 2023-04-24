/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio_mes;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int mes;
        
        System.out.println("Elije un mes: ");
        mes = sc.nextInt();       
        
        if (mes < 1  || mes < 12)
            System.out.println("mes correcto");
        else{
            switch(mes){
             case 1:
                    System.out.println("enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("mayo");
                    break;   
                case 6:
                    System.out.println("junio");
                    break; 
                case 7:
                    System.out.println("julio");
                    break;
                case 8:
                    System.out.println("agosto");
                    break; 
                case 9:
                    System.out.println("septiembre");
                    break; 
                case 10:
                    System.out.println("octubre");
                    break; 
                case 11:
                    System.out.println("noviembre");
                    break; 
                case 12:
                    System.out.println("diciembre");
                    break; 
            }      
        }
       
    }
}
