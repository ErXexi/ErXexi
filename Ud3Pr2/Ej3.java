import java.util.Scanner;

/*Escribe un programa que lea un valor correspondiente a una distancia en millas
marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a
1.852 metros. */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float milla_mar = 0, metros = 0;

        System.out.println("Introduce la cantidad de millas marinas que quieres convertir a metros: ");
        milla_mar = sc.nextFloat();
        metros = milla_mar * 1852;

        System.out.println(milla_mar + " millas marinas son "+ metros + " metros");

        sc.close();
    }
    
}
