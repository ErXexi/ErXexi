/*10. Realiza las siguientes modificaciones en el programa anterior: */

enum Semana { /*c) */
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES
}

public class Ejercicio10 {
    public static void main(String[ ] args) {
        boolean casado = false; 

        final int MAXIMO = 999999;

        short diaanual = 0;
        
        char sexo = '\u0000';

        long miliseg = 0;

        double totalfactura = 0;

        float poblacion = 0;

        Semana diasem = Semana.LUNES; 
        casado = true;
        diaanual = 300;
        miliseg = 1298332800000L;
        totalfactura = 10350.678;
        poblacion = 6775235741F;
        sexo = 'M';

        System.out.println("El valor de la variable casado es "+ casado);
        System.out.println("\tEl valor de la variable MAXIMO es "+ MAXIMO);
        System.out.println("\tEl valor de la variable diasem es "+ diasem);
        System.out.println("\tEl valor de la variable diaanual es "+ diaanual);
        System.out.println("\tEl valor de la variable miliseg es "+ miliseg);
        System.out.println("\tEl valor de la variable totalfactura es "+ totalfactura);
        System.out.println("\tEl valor de la variable poblacion es "+ poblacion );
        System.out.println("\tEl valor de la variable sexo es "+ sexo);

    }
    }
    