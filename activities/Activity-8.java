/* 8)  Faça um algoritmo que receba o número do mês e mostre o mês
correspondente. Valide mês inválido */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Digite o número correspondente ao mês em questão:");
        number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println(" O mês de número " + number + " é Janeiro");
                break;
            case 2:
                System.out.println(" O mês de número " + number + " é Fevereiro");
                break;
            case 3:
                System.out.println(" O mês de número " + number + " é Março");
                break;
            case 4:
                System.out.println(" O mês de número " + number + " é Abril");
                break;
            case 5:
                System.out.println(" O mês de número " + number + " é Maio");
                break;
            case 6:
                System.out.println(" O mês de número " + number + " é Junho");
                break;
            case 7:
                System.out.println(" O mês de número " + number + " é Julho");
                break;
            case 8:
                System.out.println(" O mês de número " + number + " é Agosto");
                break;
            case 9:
                System.out.println(" O mês de número " + number + " é Setembro");
                break;
            case 10:
                System.out.println(" O mês de número " + number + " é Outubro");
                break;
            case 11:
                System.out.println(" O mês de número " + number + " é Novembro");
                break;
            case 12:
                System.out.println(" O mês de número " + number + " é Dezembro");
                break;
            default:
                System.out.println("Mês Inválido");
                break;
        }

    }
}
