
package javafilaencadeadamodelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class JavaFilaEncadeadaModelo {
private static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Menu Fila ---");
        System.out.println("1. Inserir pessoa na fila");
        System.out.println("2. Remover pessoa da fila");
        System.out.println("3. Mostrar próxima pessoa na fila");
        System.out.println("4. Mostrar fila de pessoas");
        System.out.println("0. Sair");
        System.out.print("Digite a opção desejada: ");
        return scanner.nextInt();
    }
    public static void leiaPessoa(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        pessoa.setNome(scanner.nextLine());
        System.out.println("CPF:");
        pessoa.setCpf(scanner.nextLine());
    }


    
    public static void main(String[] args) {
      int op;
        Scanner scanner = new Scanner(System.in);
        FilaEncadeada<Pessoa> fila = new FilaEncadeada<>();

        do {
            op = mostrarMenu();
            switch (op) {
                case 1:
                    System.out.println("Dados da pessoa:");
                    Pessoa novaPessoa = new Pessoa("", "");
                    leiaPessoa(novaPessoa);
                    fila.enqueue(novaPessoa);
                    System.out.println("Pessoa inserida na fila.");
                    break;
                case 2:
                    if (!fila.isEmpty())
                        System.out.println("Pessoa removida da fila: " + fila.dequeue());
                    else
                        System.out.println("Fila vazia!");
                    break;
                case 3:
                    if (!fila.isEmpty())
                        System.out.println("Próxima pessoa na fila: " + fila.peek());
                    else
                        System.out.println("Fila vazia!");
                    break;
                case 4:
                    System.out.println("Fila de pessoas:");
                    System.out.println(fila);
                    break;
            }
            System.out.println("Pressione ENTER para continuar...");
            scanner.nextLine();
            scanner.nextLine(); // Consumir a nova linha
        } while (op != 0);
        scanner.close();
    }
    
}
