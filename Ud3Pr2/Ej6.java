import java.util.Scanner;

/*Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos
números introducidos por teclado. Incorpora también las funciones que permitan
realizar la potencia de un número y la raíz cuadrada del otro. */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = 0, num2= 0, suma = 0, resta = 0, multiplicacion = 0, division = 0, cuadrado1 = 0, cuadrado2 = 0, raiz1 = 0, raiz2 = 0;
        
        System.out.println("Introduce un número: ");
        num1 = sc.nextFloat();

        System.out.println("Introduce otro número: ");
        num2 = sc.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        cuadrado1 = (float) Math.pow(num1, 2);
        cuadrado2 = (float) Math.pow(num2, 2);
        raiz1 = (float) Math.sqrt(num1);
        raiz2 = (float) Math.sqrt(num2);

        System.out.println("x = "+ num1 +"  y = "+ num2 +"\nSuma = "+ suma +"\nResta = "+ resta +"\nMultiplicacion = "+ multiplicacion + "\nDivision = "+ division + "\nCuadrado de x = "+ cuadrado1 +"\nCuadrado de y = "+ cuadrado2 + "\nRaiz cuadrada de x = "+ raiz1 + "\nRaiz cuadrada de y ="+ raiz2);
        sc.close();
    }
}
