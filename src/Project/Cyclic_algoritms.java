package Project;

import java.util.Scanner;

public class Cyclic_algoritms {

    public static void main(String args[]) {
        int temp;
        boolean prima = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки:");

        int num = scan.nextInt();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            temp = num % i;
            if (temp == 0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }
}
/*
Дано число N. 
Определить, является ли число простым 
(простое число делиться без остатка только на само себя и 1). 
Вывести на экран: “число простое”, или “число не совсем простое”.
 */
