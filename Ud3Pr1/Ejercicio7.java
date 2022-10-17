import java.util.Scanner;

/**7. Escribe un programa que lea dos números, calcule y muestre el valor de sus suma,
resta, producto y división. */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

       int suma = num1 + num2, resta = num1 - num2, multiplicacion = num1 * num2, division = num1 / num2;
        
        System.out.println("Suma: " + suma + "\nResta: " + resta+ "\nProducto: "+ multiplicacion+ "\nDivision: " + division);

        sc.close();
    }
}
