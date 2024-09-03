package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dados {
    private Scanner sc = new Scanner(System.in);

    private void menu() {
        boolean opcao = true;

        while (opcao) {
            try {

                String msg = """
                        ➢ \nOlá seja bem-vindo ao Calendario.\n
                        ➢ Informe o dia que gostaria de acessar o valor. no período  30 dias.\n
                        """;
                System.out.println(msg);
                Integer dia = sc.nextInt();
                sc.nextLine();
                System.out.println("");

                switch (dia) {
                    case 1:
                        System.out.println("\nvalor: 22174.1664");
                        break;
                    case 2:
                        System.out.println("\nvalor: 24537.6698");
                        break;
                    case 3:
                        System.out.println("\nvalor: 26139.6134");
                        break;
                    case 4:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 5:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 6:
                        System.out.println("\nvalor: 26742.6612");
                        break;
                    case 7:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 8:
                        System.out.println("\nvalor: 42889.2258");
                        break;
                    case 9:
                        System.out.println("\nvalor: 46251.174");
                        break;
                    case 10:
                        System.out.println("\nvalor: 11191.4722");
                        break;
                    case 11:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 12:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 13:
                        System.out.println("\nvalor: 3847.4823");
                        break;
                    case 14:
                        System.out.println("\nvalor: 373.7838");
                        break;
                    case 15:
                        System.out.println("\nvalor: 2659.7563");
                        break;
                    case 16:
                        System.out.println("\nvalor: 48924.2448");
                        break;
                    case 17:
                        System.out.println("\nvalor: 18419.2614");
                        break;
                    case 18:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 19:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 20:
                        System.out.println("\nvalor: 35240.182");
                        break;
                    case 21:
                        System.out.println("\nvalor: 43829.1667");
                        break;
                    case 22:
                        System.out.println("\nvalor: 18235.6852");
                        break;
                    case 23:
                        System.out.println("\nvalor: 4355.0662");
                        break;
                    case 24:
                        System.out.println("\nvalor: 13327.1025");
                        break;
                    case 25:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 26:
                        System.out.println("\nvalor: 0.0");
                        break;
                    case 27:
                        System.out.println("\nvalor: 25681.8318");
                        break;
                    case 28:
                        System.out.println("\nvalor: 1718.1221");
                        break;
                    case 29:
                        System.out.println("\nvalor: 13220.495");
                        break;
                    case 30:
                        System.out.println("\nvalor: 8414.61");
                        break;

                    default:
                        System.out.println("Opção inválida.\n");
                        break;
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("\nInforme números inteiros:");
            }

            while (true) {
                try {
                    System.out.print("\nDeseja continuar (S/N) : ");
                    String resp = sc.nextLine().trim();

                    if (resp.equalsIgnoreCase("N")) {
                        opcao = false;
                        System.out.println("\nObrigado");
                        break;
                    } else if (resp.equalsIgnoreCase("S")) {
                        break;
                    } else {
                        System.out.println("\nInforme apenas 'S' ou 'N'.");
                    }
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("\nInforme apenas 'S' ou 'N'.");
                }
            }

        }

    }

    public void acessoAoMenu() {
        menu();
    }

}
