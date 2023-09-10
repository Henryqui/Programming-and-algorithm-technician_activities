/* 10) Dados três valores A, B e C, em que A e B são números reais e C
é um caractere, pede-se para imprimir o resultado da operação de A por B se C
for um símbolo de operador aritmético; caso contrário deve ser impressa uma
mensagem de operador não definido. Tratar erro de divisão por zero.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, r;
        String c;

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();

        System.out.println("Insira um operador dentre os seguintes ( -, +, /, *, ^");
        c = sc.next();

        if ( (c.equals("-")) || (c.equals("+")) || (c.equals("*")) || (c.equals("/")) || (c.equals("^"))){

            if ((c.equals("/")) && (b==0) || (a==0)){
                System.out.println("Erro! A equação é uma divisão por 0");
            } else {

                switch (c){

                    case "+":
                        r = (a + b);
                        System.out.println("O resultado da soma é de: " + r);
                        break;
                    case "-":
                        r = (a - b);
                        System.out.println("O resultado da subtração é de: " + r);
                        break;
                    case "/":
                        r = (a / b);
                        System.out.println("O resultado da divisão é de: " + r);
                        break;
                    case "*":
                        r = (a * b);
                        System.out.println("O resultado da multiplicação é de: " + r);
                        break;
                    case "^":
                        r = Math.pow(a, b);
                        System.out.println("O resultado da elevação é de: " + r);
                        break;

                    default:
                        System.out.println("Operador não definido");
                }
            }
        }
    }
}
