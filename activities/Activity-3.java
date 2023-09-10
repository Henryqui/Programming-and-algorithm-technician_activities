/* 3)	Criar Uma Calculadora com as seguintes opções:
1 SOMAR, 2 MULTIPLICAR, 3 SUBTRAIR, 4 SOMAR, 5 ELEVAR AO
QUADRADO, RAIZ QUADRADA E 6 SAIR */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, result;
        boolean calc = true;

while(calc) {
    System.out.println("Insira o primeiro número:");
    x = sc.nextDouble();
    System.out.println("Qual equação você deseja fazer");
    System.out.println(" 1 = Soma");
    System.out.println(" 2 = Subtração");
    System.out.println(" 3 = Multiplicação");
    System.out.println(" 4 = Divisão");
    System.out.println(" 5 = Elevar ao quadrado");
    System.out.println(" 6 = Raiz quadrada");
    System.out.println(" 7 = Sair");
    int w = sc.nextInt();
    switch (w) {
        case 1:
            System.out.println("Insira o segundo número");
            y = sc.nextDouble();
            System.out.println("O resultado da soma é:" + (x + y));
            break;
        case 2:
            System.out.println("Insira o segundo número");
            y = sc.nextDouble();
            System.out.println("O resultado da subtração é:" + (x - y));
            break;
        case 3:
            System.out.println("Insira o segundo número");
            y = sc.nextDouble();
            System.out.println("O resultado da multiplicação é:" + (x * y));
            break;
        case 4:
            System.out.println("Insira o segundo número");
            y = sc.nextDouble();
            System.out.println("O resultado da divisão é:" + (y / x));
            break;
        case 5:
            result = Math.pow(x, 2);
            System.out.println("Seu número ao quadrado é:" + result);
            break;
        case 6:
            result = Math.sqrt(x);
            System.out.println("A raiz quadrada do seu número é:" + result);
            break;
        case 7:
            calc = false;
            break;
        default:
            System.out.println("Cálculo não encontrado!");
            break;
    }
