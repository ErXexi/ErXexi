import java.util.Scanner;

/*Escribe un programa que dado el precio de un artículo y el precio de venta real nos
muestre el porcentaje de descuento realizado.*/
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0, precio_real= 0, descuento = 0;
        System.out.println("Introduce el precio con el descuento aplicado: ");
        precio = sc.nextDouble();
        System.out.println("Introduce el precio base del producto: ");
        precio_real = sc.nextDouble();
        descuento = 100 - (precio_real * 100)/precio;

        System.out.println("El descuento aplicado es del "+ descuento + "%");

        sc.close();
    }
}
