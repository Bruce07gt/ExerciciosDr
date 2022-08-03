package exercicios;

import java.util.Scanner;
public class Primo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2 || n ==3 || n ==5 || n ==7) {
            System.out.println("Numero Primo!");
        }
        else if (n % 2 == 0 || n % 3 == 0 || n % 7 == 0 || n % 5 == 0) {
            System.out.println("Numero não primo.");
        } else {
            System.out.println("Numero Primo!");
        }
    }
}
