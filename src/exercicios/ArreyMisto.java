package exercicios;

import java.util.Scanner;

public class ArreyMisto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int b= 10;
        int n[] = new int[b];
        for (i=1; i<n.length; i++){
           n[i] = sc.nextInt();
        }

        for (i = 1; i<n.length; i++) {
            if (n[i]%2==0){
                System.out.print(n[i]+" ");
            }
        }
        System.out.println();
        for (i = 1; i<n.length; i++) {
            if (n[i]%2!=0){
                System.out.print(n[i]+" ");
            }
        }
        System.out.println();
        for (i = 1; i<n.length; i++) {
            if (n[i] % 2 != 0 && n[i] % 3 != 0 && n[i] % 7 != 0 && n[i] % 5 != 0 && n[i] > 1 || n[i] ==2 || n[i] == 3 || n[i] == 5 || n[i] == 7) {
                System.out.print(n[i]+" ");
            }
        }
    }
}
