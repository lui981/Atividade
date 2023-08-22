import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<String> pratos = new ArrayList<>();
        while (true) {

            System.out.printf("%n%n");
            System.out.println("~~ Sistema adminstrativo ~~~~~~");
            System.out.printf("\t%s%n", "1. Cadastrar - Cliente.");
            System.out.printf("\t%s%n", "2. Remover - Cliente.");
            System.out.printf("\t%s%n", "3. Cadastrar - Pratos/Bebidas.");
            System.out.printf("\t%s%n", "4. Remover - Pratos/Bebidas.");
            System.out.printf("\t%s%n", "5. Listar Menu.");
            System.out.printf("\t%s%n", "6. Listar Clientes.");
            System.out.printf("\t%s%n", "0. Sair.");
            System.out.println("~~~~ * ~~~~");

            int escolha;
            do {
                System.out.print("Escolha: ");
                escolha = sc.nextInt();
                sc.nextLine();
            } while (escolha < 0 || escolha > 7);


            Thread.sleep(3000);
            switch (escolha) {
                case 0: {
                    System.out.printf("\tFechando execução de sistema.%n");
                    System.exit(1);
                    break;
                }
                case 1: {
                    System.out.printf("%n~~ Cadastro ~~~~%n");
                    System.out.print("Nome: ");
                    clientes.add(sc.nextLine());
                    Thread.sleep(1000);
                    System.out.printf("%n\t[Cadastrado com sucesso]%n%n");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    System.out.printf("%n~~ Excluir ~~~~%n");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    if (clientes.contains(nome)) {
                        clientes.remove(nome);
                    } else {
                        Thread.sleep(1000);
                        System.out.printf("%n\t[Cliente %s removido com sucesso!]%n", nome);
                    }
                    break;
                }
                case 3: {
                    System.out.printf("%n~~ Cadastro Pratos/Bebidas ~~~~%n");
                    System.out.print("Nome: ");
                    pratos.add(sc.nextLine());
                    Thread.sleep(1000);
                    System.out.printf("\tCadastrado com sucesso no cardapio.%n");
                    break;
                }
                case 4: {
                    System.out.printf("%n~~ Excluir  Pratos/Bebidas ~~~~%n");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    if (pratos.contains(nome)) {
                        pratos.remove(nome);
                        System.out.printf("%n\t[Item %s removido com sucesso do cardapio!]%n", nome);
                    } else {
                        System.out.printf("%n\t[Item %s não existe no cardapio!]%n", nome);
                        Thread.sleep(1000);
                    }
                    break;
                }
                case 5: {
                    System.out.printf("%n~~ CARDAPIO ~~~~%n");
                    for (String string : pratos) {
                        System.out.println("#. " + string);
                    }
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    
                    System.out.printf("%n---------- CLIENTES CADASTRADOS ------------%n");
                    for (String string : clientes) {
                        Thread.sleep(1000);
                        System.out.println("    +. " + string);
                    }
                    System.out.printf("%n---------- CLIENTES CADASTRADOS ------------%n");
                    break;
                }

                default:
                    break;
            }
        }
    }
}