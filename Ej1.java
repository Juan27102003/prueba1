import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a:");
        double a = sc.nextInt();
        System.out.println("Introduce el valor de b:");
        double b = sc.nextInt();
        System.out.println("Introduce el valor de c:");
        double c = sc.nextInt();

        double operacion1 = a * b + c * (3 - a) / 2 * b;
        double operacion2 = Math.pow((2 + a * b) / 4,c+2);
        double operacion3 = Math.pow((-b + Math.pow(b,2) - 4 * a * c),(1 / 2)) / 2 * a;

        System.out.println("El resultado de la operacion 1 es:" + operacion1);
        System.out.println("El resultado de la operacion 2 es:" + operacion2);
        System.out.println("El resultado de la operacion 3 es:" + operacion3);
    }
}
