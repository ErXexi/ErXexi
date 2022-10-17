import java.util.Scanner;

/**6. Pedir el radio de un círculo y calcular su área. A = PI+r2
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radio = 0, area = 0;

        System.out.println("Introduce el radio del círculo el cual quieras calcular su área: ");
        radio = sc.nextFloat();
        area = (float) (Math.PI * Math.pow(radio, 2));

        System.out.println("El área de un circulo de "+ radio + " de radio es "+ String.format("%.2f", area));

        sc.close();
        }
}
