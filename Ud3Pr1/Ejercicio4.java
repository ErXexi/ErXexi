/**4. Muestra un mensaje de bienvenida por consola según el nombre que se haya
introducido. Por ejemplo: si introduzco “Carles”, me aparezca “Bienvenido Carles”.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Bienvenido "+ nombre);

        sc.close();

    }
    
}
