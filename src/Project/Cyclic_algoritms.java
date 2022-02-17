package Project;

import java.util.Scanner;

public class Cyclic_algoritms {

    public static void main(String args[]) {
        int t;
        boolean prima = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки:");

        int num = scan.nextInt();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            t = num % i;
            if (t == 0) {
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

