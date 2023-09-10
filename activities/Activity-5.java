/* 5)	Desenvolver um programa onde o usuário informa 05 Valores e retorne o Maior
e o Menor Valor Inserido.*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        int n2 = sc.nextInt();
        System.out.println("Insira o terceiro número:");
        int n3 = sc.nextInt();
        System.out.println("Insira o quarto número:");
        int n4 = sc.nextInt();
        System.out.println("Insira o quinto número:");
        int n5 = sc.nextInt();

       if ((n1>n2) && (n1>n3) && (n1>n4) && (n1>n5)){
           System.out.println("O maior numero é o: " + n1);
       }
        if ((n2>n1) && (n2>n3) && (n2>n4) && (n2>n5)){
            System.out.println("O maior numero é o: " + n2);
        }
        if ((n3>n4) && (n3>n2) && (n3>n1) && (n3>n5)){
            System.out.println("O maior numero é o: " + n3);
        }
        if ((n4>n3) && (n4>n2) && (n4>n1) && (n4>n5)){
            System.out.println("O maior numero é o: " + n4);
        }
        if ((n5>n2) && (n5>n3) && (n5>n4) && (n5>n1)){
            System.out.println("O maior numero é o: " + n5);
            }



        if ((n1<n2) && (n1<n3) && (n1<n4) && (n1<n5)){
            System.out.println("O menor numero é o: " + n1);
        }
        if ((n2<n1) && (n2<n3) && (n2<n4) && (n2<n5)){
            System.out.println("O menor numero é o: " + n2);
        }
        if ((n3<n4) && (n3<n2) && (n3<n1) && (n3<n5)){
            System.out.println("O menor numero é o: " + n3);
        }
        if ((n4<n3) && (n4<n2) && (n4<n1) && (n4<n5)){
            System.out.println("O menor numero é o: " + n4);
        }
        if ((n5<n2) && (n5<n3) && (n5<n4) && (n5<n1)){
            System.out.println("O menor numero é o: " + n5);
        }


    }
}
