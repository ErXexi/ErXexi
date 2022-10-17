import java.util.Scanner;

/*Diseña un programa Java para leer las longitudes de los lados de un triángulo (L1,
L2, L3) y calcular el área del mismo de acuerdo con la siguiente fórmula:
*/
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sp = 0, area = 0, L1 = 0, L2 = 0, L3= 0;

        System.out.println("Introduce el primer lado: ");
        L1 = sc.nextFloat();
        System.out.println("Introduce el segundo lado: ");
        L2 = sc.nextFloat();
        System.out.println("Introduce el tercer lado: ");
        L3 = sc.nextFloat();

        sp = (L1 + L2 + L3)/2;
        area = (float) Math.sqrt(sp * (sp-L1) * (sp-L2) * (sp-L3));

        System.out.println("El área del triangulo es: "+  String.format("%.2f", area));


        sc.close();
    }
}
