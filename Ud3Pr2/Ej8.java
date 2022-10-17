import java.util.Scanner;

/*8. Realiza un programa que pida un número entre 0 y 9999 y lo muestre con las cifras
al revés. */
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = "", inverso = "";
        System.out.println("Introduce un número de máximo 4 cifras: ");
        num = sc.nextLine();

        if (num.length() == 4){
            char L0 = num.charAt(0);
            char L1 = num.charAt(1);
            char L2 = num.charAt(2);
            char L3 = num.charAt(3);
            inverso = ""+ L3 + L2 + L1 + L0;
        }else if (num.length() == 3){
            char L0 = num.charAt(0);
            char L1 = num.charAt(1);
            char L2 = num.charAt(2);
            inverso = ""+ L2 + L1 + L0;
        }else if (num.length() == 2){
            char L0 = num.charAt(0);
            char L1 = num.charAt(1);
            inverso = ""+ L1 + L0;
        }else if (num.length() ==1){
            inverso = num;
        }else {
            System.out.println("El número introducido no es válido");
        }    
        System.out.println(inverso);

        sc.close();  
    }
}
