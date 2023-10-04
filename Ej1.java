import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a:");
        int a = sc.nextInt();
        System.out.println("Introduce el valor de b:");
        int b = sc.nextInt();
        System.out.println("Introduce el valor de c:");
        int c = sc.nextInt();

        int operacion1 = a * b + c * (3 - a) / 2 * b;
        int operacion2 = ((2 + a * b) / 4) ^ (c + 2);
        int operacion3 = (-b + (b ^ 2 - 4 * a * c) ^ (1 / 2)) / 2 * a;

        System.out.println("El resultado de la operacion 1 es:" + operacion1);
        System.out.println("El resultado de la operacion 2 es:" + operacion2);
        System.out.println("El resultado de la operacion 3 es:" + operacion3);
    }
}
