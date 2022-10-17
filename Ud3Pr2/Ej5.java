import java.util.Scanner;

/*Diseña un programa Java para resolver una ecuación de primer grado con una
incógnita (x), suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen
desde teclado.
• C1x + C2 = 0 */

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float C1 = 0, C2 = 0, x = 0;

        System.out.println("Vamos a resolver la siguiente ecuación C1X + C2 = 0\nIntroduce C1: ");
        C1 = sc.nextFloat();
        System.out.println("Introduce C2: ");
        C2 = sc.nextFloat();
        x = -C2 / C1;
        System.out.println("El proceso es:\n\t"+ C1 +"x + "+ C2 +"= 0\n\t"+ C1 +"x = "+ -C2 +"\n\tx = "+-C2 +"/"+ C1 +"\n\tx = "+ x);
        sc.close();
    }
}
