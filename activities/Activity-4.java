/* 4)	Desenvolver um programa que o usuário informe e mostre: nome, quantidade, idade de pessoas e a média da idade das pessoas informadas.
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int quan, total  = 0;
        int age;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão apresentadas?");
        quan = sc.nextInt();

        for (int i = 1; i <= quan; i++) {
            System.out.println("Insira o nome da " + i + " pessoa");
            sc.next();
            System.out.println("Insira a idade da " + i + " pessoa");
            age = sc.nextInt();
            total += age;
        }
        media = (total/quan);
        System.out.println("A média das idades é de: " + media);
    }
}
