//  2)	Faça um programa em que o usuário digite 2 valores e se a soma deles for maior que 15 o programa encerra, caso contrário, repete

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Insert the first number:");
        x = sc.nextDouble();
        System.out.println("Insert the second number:");
        y = sc.nextDouble();
        System.out.println(y + x);

        while (x + y <=15){

            System.out.println("Insert the first number:");
            x = sc.nextDouble();
            System.out.println("Insert the second number:");
            y = sc.nextDouble();
            System.out.println(y + x);
        }


    }
}
