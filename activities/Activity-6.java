/*6)	Desenvolver um Programa (Estrutura CASE) onde irá definir a Classificação de
um Nadador de acordo com a sua Idade*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   int code;
   String name;

   Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        name = sc.next();

        System.out.println("Insira seu código de categoria de acordo com a sua idade:");
        System.out.println(" de 0 a 7 digite 101 = infantil");
        System.out.println(" de 8 a 13 digite 102 = juvenil");
        System.out.println(" de 13 a 17 digite 103 = adolescente");
        System.out.println(" de 18 a 25 digite 104 = senior ");
        System.out.println(" de 26 a 35 105 = profissional");
        System.out.println(" de 36 a 40 106 = master");
        code = sc.nextInt();

        switch(code){
            case 101:
                System.out.println("Sua categoria é infantil");
                break;
            case 102:
                System.out.println("Sua categoria é Juvenil");
                break;
            case 103:
                System.out.println("Sua categoria é Adolescente");
                break;
            case 104:
                System.out.println("Sua categoria é Senior");
                break;
            case 105:
                System.out.println("Sua categoria é profissional");
                break;
            case 106:
                System.out.println("Sua categoria é master");
                break;
        }

    }
}
