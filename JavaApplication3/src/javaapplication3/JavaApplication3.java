/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner
/**
 *
 * @author ESPE
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
    System.out.print("\n================================");
    System.out.print("\nNombre: Edith Chuico");
    System.out.print("\nCurso: Programacion Orientada a Objetos");
    System.out.print("\nTALLER 1");
    System.out.print("\n=================================");
        System.out.print("\nIngrese el primer numero:");
    double numero1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo numero:");
    double numero2 = scanner.nextDouble();
    double suma = numero1 + numero2;
    double resta = numero1 - numero2;
    double multiplicacion = numero1 * numero2;
    double div = numero1/numero2;
    System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma );
    System.out.println("La resta de " + numero1 + " y " + numero2 + " es igual a " + resta );
    System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es igual a " + multiplicacion );
    System.out.println("La division de" + numero1 + "y" + numero2 + "es igual a" + div );
    }
}
