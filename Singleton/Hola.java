import java.util.Scanner;

public class Hola{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int number = scanner.nextInt();
        System.out.println("El número que ingresaste es: " + number);
        scanner.close();
    }
}