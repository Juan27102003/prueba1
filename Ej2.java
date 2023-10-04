import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A que los quieres convertir?(F/K):");
        String convertir = sc.nextLine();

        System.out.println("Introduce el numero de grados centigrados:");
        double grados = sc.nextDouble();

        double fahrenheit = 9 / 5 * grados + 32;
        double kelvin = grados + 273.15;


        String resultado = convertir.equals("F") ? "El resultado en grados Fahrenheit es:" + fahrenheit : convertir.equals("K") ? "El resultado en grados Kelvin es:"+kelvin : "Los datos introducidos son incorrectos";

        System.out.println(resultado);
    }
}
