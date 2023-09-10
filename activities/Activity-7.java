/* 7)	Desenvolva um algoritmo que leia o nome de times de futebol e Informe a qual
estado ele pertence.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String time, nome;
        boolean timess = true;
        Scanner sc = new Scanner(System.in);

        while(timess){
            System.out.println("Qual o teu nome?");
            nome = sc.nextLine();
            System.out.println("Para qual time você torce?");
            System.out.println("São Paulo");
            System.out.println("Flamengo");
            System.out.println("Atlético Mineiro");
            System.out.println("Internacional");
            System.out.println("Grêmio");
            System.out.println("Coritiba");
            System.out.println("Chapecoense");
            System.out.println("Rio Branco Athletico");
            System.out.println("Goias");
            System.out.println("CRB");
            System.out.println("Corinthians");
            System.out.println("Athletico Acriano");
            System.out.println("Santos-AP");
            System.out.println("Nacional-Am");
            System.out.println("Bahia");
            System.out.println("Fortaleza");
            System.out.println("Brasiliense");
            System.out.println("Sampaio Corrêa");
            System.out.println("Cuiabá");
            System.out.println("Corumbaense ");
            System.out.println("Paysandu");
            System.out.println("Botafogo-PB");
            System.out.println("Sport");
            System.out.println("Parnahyba-PI");
            System.out.println("ABC");
            System.out.println("Barcelona-RO ");
            System.out.println("Confiança");

            time = sc.nextLine();

            if (time.equals("São Paulo")){

                System.out.println("Esse time pertence ao estado de São Paulo.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Flamengo")){

                System.out.println("Esse time pertence ao estado do Rio de Janeiro.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Atlético Mineiro")){

                System.out.println("Esse time pertence ao estado de Minas Gerais.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Internacional") || time.equals("Grêmio")){

                System.out.println("Esse time pertence ao estado do Rio Grande do Sul.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Coritiba")){

                System.out.println("Esse time pertence ao estado do Paraná.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Chapecoense")){

                System.out.println("Esse time pertence ao estado de Santa Catarina.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Rio Branco Athletico")){

                System.out.println("Esse time pertence ao estado do Acre.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Goiás")){

                System.out.println("Esse time pertence ao estado de Goiás.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("CRB")){

                System.out.println("Esse time pertence ao estado de Alagoas.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Corinthians")){

                System.out.println("Esse time pertence ao estado de São Paulo.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Athletico Acriano")){

                System.out.println("Esse time pertence ao estado do Acre.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Santos-AP")){

                System.out.println("Esse time pertence ao estado do Amapá.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Nacional-Am")){

                System.out.println("Esse time pertence ao estado do Amazonas.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Bahia")){

                System.out.println("Esse time pertence ao estado da Bahia.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Fortaleza")){

                System.out.println("Esse time pertence ao estado do Ceará.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Brasiliense")){

                System.out.println("Esse time pertence ao Destrito Federal.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Sampaio Corrêa")){

                System.out.println("Esse time pertence ao estado do Maranhão.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Cuiabá")){

                System.out.println("Esse time pertence ao estado do Mato Grosso.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Corumbaense")){

                System.out.println("Esse time pertence ao estado do Mato Grosso do Sul.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Paysandu")){

                System.out.println("Esse time pertence ao estado do Pará.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Botafogo-PB")){

                System.out.println("Esse time pertence ao estado da Paraíba.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Sport")){

                System.out.println("Esse time pertence ao estado do Pernambuco.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Parnahyba-PI")){

                System.out.println("Esse time pertence ao estado do Piauí.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("ABC")){

                System.out.println("Esse time pertence ao estado do Rio Grande do Norte.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Barcelona-RO")){

                System.out.println("Esse time pertence ao estado de Rondônia.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }

            if (time.equals("Confiança")){

                System.out.println("Esse time pertence ao estado de Sergipe.");
                System.out.println(" ");
                System.out.println("Deseja reiniciar o projeto?");
                System.out.println(" Digite SIM para reiniciar");
                System.out.println(" Digite NÃO para finalizar");
                String response = sc.next();
                if (response.equals("Não")){
                    timess = false;
                }
            }
        }

    }
}
