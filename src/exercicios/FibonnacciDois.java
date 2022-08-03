package exercicios;

import java.util.Scanner;

public class FibonnacciDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 1, num2 = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < 20; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            if (num1 < b && num1 > a) {
                System.out.println(num1);
            }
        }
    }
}
