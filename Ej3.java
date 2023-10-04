import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de pizzas:");
        int pizza = sc.nextInt();
        System.out.println("Introduce el numero de amigos:");
        int amigos = sc.nextInt();
        System.out.println("Introduce el numero de porciones:");
        int porciones = sc.nextInt();

        int porciones_persona = pizza * porciones / amigos;
        int sobran = pizza * porciones % amigos;
        System.out.println("Cada amigo toca a " + porciones_persona + " porciones cada uno y sobran " + sobran + " porciones");
    }
}
