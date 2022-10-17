/**5. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por
teclado. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = 0, cuadrado = 0;

        System.out.println("Introduce el lado del cuadrado del que quieras saber el área: ");
        lado = sc.nextInt();
        cuadrado = lado*lado;
        System.out.println("El área de un cuadrado de lado "+ lado + " es " + cuadrado);

        sc.close();
    }
    
}
