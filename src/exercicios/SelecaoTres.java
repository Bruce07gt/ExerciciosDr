package exercicios;

import java.util.Scanner;

public class SelecaoTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = 0;

        //Pares
        for (int i = a; i < b; i++) {
            i += soma;
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Impares
        for (int j = a; j < b; j++) {
            j += soma;
            if (j % 2 != 0) {
                System.out.print(j+" ");
            }
        }
        System.out.println();
        //Primos
        for (int p = a; p < b; p++) {
            p += soma;
            if (p % 2 != 0 && p % 3 != 0 && p % 7 != 0 && p % 5 != 0 && p > 1 || p ==2 || p == 3 || p == 5 || p == 7) {
                System.out.print(p + " ");
            }
        }
    }
}
