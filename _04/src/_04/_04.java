package _04;

import java.util.Scanner;

public class _04 {

    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una nota");

        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par");

        } else {
            System.out.println("El numero es impar");
        }

    }

}
