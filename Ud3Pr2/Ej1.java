import java.util.Scanner;


/*Escribe un programa que toma como dato de entrada un número que corresponde
a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del
círculo y el volumen de la esfera que corresponden con dicho radio. */

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radio = 0, circunferencia = 0, area = 0, volumen = 0;

        System.out.println("Introduce la longitud del radio: ");
        radio = sc.nextFloat(); /*Cambiamos el radio al valor que introdujimos */
        circunferencia = (float) (2 * Math.PI * radio);
        area = (float) (Math.PI * Math.pow(radio, 2));
        volumen = (float) ((4/3) * Math.PI * Math.pow(radio, 3));
        /*Con string.format truncamos los decimales */
        System.out.println("Longitud de radio = "+ String.format("%.2f", radio) + "\nLongitud circunferencia = "+ String.format("%.2f", circunferencia) + "\nÁrea = "+ String.format("%.2f", area) + "\nVolumen = " + String.format("%.2f", volumen));




        sc.close();
    }
}
