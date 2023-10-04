import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String resultado1 = a < b && a < c ? ("El valor minimo es " + a) : a > b && a > c ? "El valor maximo es " + a : "El valor medio es " + a;
        String resultado2 = b < a && b < c ? ("El valor minimo es " + b) : b > a && b > c ? "El valor maximo es " + b : "El valor medio es " + b;
        String resultado3 = c < a && c < b ? ("El valor minimo es " + c) : c > a && c > b ? "El valor maximo es " + c : "El valor medio es " + c;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

    }
}