package actions;

import java.util.Scanner;

public class Funcoes {

    int i;
    int j;
    int c= 10;
    int n[] = new int[c];

//Programa #1
    public void leitorArr() {
        Scanner ac = new Scanner(System.in);
        for (i=1; i<n.length; i++){
            n[i] = ac.nextInt();
        }
    }

    public void funcPrimoArr() {
        System.out.println();
        for (i = 1; i < n.length; i++) {
            if (n[i] % 2 != 0 && n[i] % 3 != 0 && n[i] % 7 != 0 && n[i] % 5 != 0 && n[i] > 1 || n[i] == 2 || n[i] == 3 || n[i] == 5 || n[i] == 7) {
                System.out.print(n[i] + " ");
            }
        }
    }
    public void funcParArr(){
        System.out.println();
        for (i = 1; i<n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.print(n[i] + " ");
            }
        }
    }
    public void funcImparArr() {
        System.out.println();
        for (i = 1; i<n.length; i++) {
            if (n[i]%2!=0){
                System.out.print(n[i]+" ");
            }
        }
    }

    //Programa #2
    //###########################################
    int a;
    int b;
    int soma = 0;
    public void funcLeitorAeB() {
        Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
    }
    public void funcParAeB(){
        for (int j = a; j < b; j++) {
            j += soma;
            if (j % 2 == 0) {
                System.out.print(j +" ");
            }
        }
    }
    public void funcImparAeB(){
        System.out.println();
        for (int j = a; j < b; j++) {
            j += soma;
            if (j % 2 != 0) {
                System.out.print(j +" ");
            }
        }
    }
    public void funcPrimoAeB() {
        System.out.println();
        for (int j = a; j < b; j++) {
            j += soma;
            if (j % 2 != 0 && j % 3 != 0 && j % 7 != 0 && j % 5 != 0 && j > 1 || j ==2 || j == 3 || j == 5 || j == 7) {
                System.out.print(j + " ");
            }
        }
    }
}
