public class Ejercicio8 {
    public static void main(String[] args) {//falta "void" en public static *void* main(String[] args) falta "{""
    short x = 7;
    int y = 5;
    float f1 = 13.5F; //falta la f para convertir float en double
    float f2 = 8f;
    System.out.println("El valor de x es " + x + " y el valor de y e" + y); //no esta concatenada
    System.out.println("El resultado de x + y es " + (x + y));
    System.out.println("El resultado de x - y es " + (x - y));
    System.out.printf("\n%s%s\n","División entera:","x / y =",(x/y));
    System.out.println("Resto de la división entera: x % y = " + (x% y));
    System.out.printf("El valor de f1 es %f y el de f2 es%f\n",f1,f2);
    System.out.println("El resultado de f1 / f2 es " + (f1 / f2)); //falta el ";" para completar
    }
} //falta el "}" para cerrar
    